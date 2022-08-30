package review.network.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
	
	/* 1) 서버의 포트번호 정함
	 * 2) 서버용 소켓 객체 생성
	 * 3) 클라이언트의 접속 요청 대기
	 * 4) 접속 요청 시, 수락 후 해당 클라이언트에 대한 소켓 객체 생성
	 * 5) 연결된 클라이언트와 입출력 스트림 생성
	 * 6) 보조 스트림을 통해 성능 개선
	 * 7) 스트림을 통해 읽고 쓰기
	 * 8) 통신 종료 
	 * 
	 */

	
	//1) 서버용 포트번호 정함
	public void serverStart() {
		
		int port = 8500;
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		
		
		try {
			//2) 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			
			
			// 3) 클라이언트 요청 대기
			// 4) 접속 요청 오면, 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			clientSocket = serverSocket.accept();
			
			
			System.out.println("[클라이언트 접속 성공]");
			
			
			//5) 연결된 클라이언트와 입출력 스트림 생성(얻어오기)
			
			is = clientSocket.getInputStream();  //바이트 기반
			os = clientSocket.getOutputStream();
			
			
			
			// 6) 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(is));  // 문자 기반
			pw = new PrintWriter(os);
			
			
			//7) 스트림을 통해 읽고 쓰기
			// 서버 -> 클라이언트 메세지 전송
			
			Date now = new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
					
			
			String str = sdf.format(now) + "[서버 접속 성공]";
			
			pw.println(str);
			pw.flush();
			
			
			
			String clientMessage = br.readLine();  //클라이언트 -> 서버 메세지 전달 받기
			String clientIp = clientSocket.getInetAddress().getHostAddress();  // 클라이언트 IP
			
			//클라이언트 메세지 출력
			System.out.println(clientIp + "가 보낸 메세지 : " + clientMessage);
			
			
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			
		//	8) 통신 종료

			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				
				
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}

		
		}
	
	
	
	
	
	}
	
	
}
