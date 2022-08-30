package review.network.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientService {

	
	/* 1) 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여,
	 * 		클라이언트용 소켓 객체 생성
	 * 2) 서버와의 입출력 스트림 오픈
	 * 3) 보조 스트림을 통해 성능 개선
	 * 4) 스트림을 통해 읽고 쓰기
	 * 5) 통신 종료
	 */
	
	public void clientStart() {
	

		// 1) 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여, 클라이언트용 소켓 객체 생성
		String serverIp = "127.0.0.1";
		int port = 8500;
		
		Socket clientSocket = null;
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		
		try {
			
			//1) 클라이언트용 소켓 객체 생성
			
			
			clientSocket =  new Socket(serverIp, port);
			
			
			//2)서버와의 입출력 스트림 오픈
			
			if(clientSocket != null) {  //서버와 연결 성공
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
			}
			
			
			
			//3) 보조스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);
			
			
			
			//4) 스트림을 통해 읽고 쓰기
			String serverMessage = br.readLine();
			
			System.out.println(serverMessage);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("서버로 전달할 메세지 : ");
			String str = sc.nextLine();
			
			pw.println(str);
			pw.flush();
			
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {							
			//5) 통신 종료
			
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				
				
				if(clientSocket != null) clientSocket.close();
				
				
			} catch(IOException e) {
				e.printStackTrace();
				
			}
			
			
		}
	}
	

	
	
	
	
	
	
}




