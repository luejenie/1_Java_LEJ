package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	public void ex1() {
		
		// break문 : '가장 가까운' 반복문을 빠져나가는 구문
		
		for(int i=1 ; i<=10000 ; i++) {
			System.out.println(i);
			
			// i가 20일 때 반복 종료
			if(i == 20) {
				break;	
			}		
		}
		
		System.out.println("------------------------------");
		
		for(int row=1 ; row <=5 ; row++) {
			
			for(int col=1 ; col<=100 ; col++) {    //5행 100열
				
				System.out.printf("(%d , %d) ", row, col);
				
				if(col == 3 ) {
					break;   //제일 가까운 데서 break를 감싸고 있는 괄호  _가장 가까운 for문
				}	  
			}
			
			System.out.println();  //줄 바꿈
			
			if(row == 3) {
				break; //더 큰 for문
			}
			
		}

	} //1
	
	
	public void ex2() {
		
		// 0이 입력될 때 까지의 입력된 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		
		while( true ) {  // 조건식에 강제로 true 작성 == 무한 반복을 하겠다.
			// 조건식 : true/false 나오는 식
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			sum += input; //누적
		}
		
		System.out.println("합계 : " + sum);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다. //_위에서 무한반복하기 때문에.
		// _위에 break 코드를 넣으면 빨간줄 사라짐. 도달할 수 있는 가능성이 생기기 때문.

	}

	
	
	public void ex3( ) {
		
		//"exit@"문자열이 입력될 때까지 문자열 누적하기
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";  //빈 문자열
		
		System.out.println("--- 문자열 입력 (종료시 exit@ 입력) ---");
		while(true) {
		
			String input = sc.nextLine();  // 한 줄 입력
			
			// 비교연산자는 보통 기본 자료형의 값 비교만 가능하다!
			// -> String은 기본 자료형이 아님xxxx, 참조형O
			// -> 참조형은 A.equls(B) 를 사용해 값을 비교할 수 있다.
			// _기본자료형 8가지 빼고는 모두 equls를 이용
			
			// 	A.equls(B)  =  A==B 같은말임.		
			if(input.equals("exit@")) {
				break;
			}
			
			str += input + "\n";  //누적하면서 줄 바꿈
			
		}
		
		System.out.println(str);
		
	}
	
	
	public void ex4() {
		
		// continue : 다음 반복으로 넘어감
		
		// 1부터 30까지 5의 배수를 제외하고 출력 (continue 사용)
		for(int i=1 ; i<=30 ; i++) {
			
			if(i%5 == 0) {
				continue;  //다음 반복으로 이동(증감식 부분으로 이동)
			}
		
			System.out.println(i);
		}
		
	}
	
	
	public void ex5() {
		// 1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 대 반복을 멈춤
		
		for(int i=1 ; i<=100 ; i++) {
			
//			if(i == 40) {  // continue if문 위로 옮겨도 됨.
//				System.out.println(i);  //추가함으로써, 40일 때 40일 출력하고 멈춤.
//				break;     //출력 구문 아래에 둬야 40을 출력하고 멈춤. 그렇지 않으면, continue 떄문에 40이 출력 안됨.
//			} 
			
			if(i%5==0) {
				
				if(i == 40) {  // continue if문 위로 옮겨도 됨.
					System.out.println(i);  //추가함으로써, 40일 때 40일 출력하고 멈춤.
					break;     //출력 구문 아래에 둬야 40을 출력하고 멈춤. 그렇지 않으면, continue 떄문에 40이 출력 안됨.
				} 
				
				continue;		
			}
		
			System.out.println(i);

		}
		
	}
	
	
	
	public void upDownGame() {
		
		// 프로그램 시작 시 1~50 사이의 임의의 수(난수)를 하나 생성하여
		// 사용자가 몇 회 만에 맞추는지 카운트
		
		// 만약 틀렸을 경우, 난수가 입력한 수보다 크면 UP / 작으면 DOWN 출력
		
		//(임의의 수 30일 경우)
		
		// ex) 
		// 1번 입력 : 10
		// UP
		
		// 2번 입력 : 40
		// DOWN
		
		// 3번 입력 : 30
		// 정답입니다! (총 입력 횟수 : 3회)
		
		
		// while문, break문 사용해보기
		
		
		// [Math.random()]
		// ** 난수 생성 : Math.random()   _random에 커서 놓고 shift+F2
		// -> Java에서 제공해주는 난수 생성 방법.
		// 0.0 이상에서 1.0 미만의 난수를 생성(double형)
		// 0.0 <= x < 1.0 									// cf. random이라는 함수도 따로 있음.
		
		
		int ran = (int)(Math.random() * 50+1) ;  // 문제 범위에 맞추기 위해서 *
		// 0.0 <= x < 1.0 	
		// *50 -> 0.0 <= x < 50.0    //50 미만의 50을 곱한 x의 값은 말이 안되고, 결국 난수이기 때문에 그냥x
		// +1  -> 1.0 <= x < 51.0    // x는 50.9999999까지도 포함
		// (int) 강제 형변환  -> 소수점 아래 강제 버림처리
		// 1 <= (int)(x *50 +1) < 51   == 1~50 사이의 난수 
		
		//System.out.println(ran);
		
	/*	Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int count = 1;
	//	int count = 0;
	
		while(input != ran) {
			
			System.out.print(count + "번 입력 : ");   //이 부분 놓쳤다. 문제 잘보기!
			input = sc.nextInt();
			
			count++;
			
			if(input == ran) {
				System.out.println("정답입니다! (총 입력 횟수 : " + count + "회)");
				break;
			
			} else if(input < ran) {
				System.out.println("UP");
				
			} else {
				System.out.println("DOWN");
				
			}
			System.out.println();
		}
	
	*/	
		//풀이
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		while(true) {
			System.out.print(count + "번 입력 : ");
			int input = sc.nextInt();
			
			
			// 난수 == 입력값
			// 난수 > 입력값
			// 난수 < 입력값
			
			if(ran == input) {  //난수 == 입력값
				System.out.printf("정답 입니다! (총 입력 횟수 : %d회) \n", count);
				break;  //while문 종료
				
			} else if(ran > input) {  // 난수 > 입력값
				System.out.println("UP");			
				
			} else { // 난수< 입력값
				System.out.println("DOWN");
				
			}
			
			count++;
		}
	
	}//updown
	
	
	public void rpsGame() {   //가위바위보
		
		   // 난수 이용
		
		   // 몇판? : 3
		   
		   // 1번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 플레이어 승!
		   // 현재 기록 : 1승 0무 0패
		   
		   // 2번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  보
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 비겼습니다.
		   // 현재 기록 : 1승 1무 0패
		   
		   // 3번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [바위]를 선택했습니다.
		   // 졌습니다ㅠㅠ
		   // 현재 기록 : 1승 1무 1패
		
	
			int ran = (int)(Math.random() *3);
			
			// --> 결과가 0/1/2 가 나옴.
			// 0:가위 / 1:바위 / 2:보
		
			// 승: 가위>보 / 바위>가위 / 보자기 > 바위
	
			
			Scanner sc = new Scanner(System.in);
			System.out.print("몇 판? : ");
			int pan = sc.nextInt();
			
			int count = 0; // n번째 판
			int winCount = 0; //승 카운트
			int loseCount = 0; //패 카운트
			int tieCount = 0; //무 카운트
		
			String rannum="";
			String result = "";
			
			//몇 판인지 입력 받고, 그만큼 작동하는 for문 입력.
			
			
			for(int i=1 ; i<=pan ; i++) {
				
				count++;
				System.out.println(count + "번째 게임");
				System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");
				String input = sc.next();
				
				
				switch(ran) {
				case 0 : rannum="가위"; break;
				case 1 : rannum="바위"; break;
				case 2 : rannum="보"; break;
				default : ;
				} System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", rannum);
				
				
				//플레이어(나) : 가위일 떄
				if(input.equals("가위")) {  
					if(ran == 0) { // 나:가위 - 컴:가위
						result = "비겼습니다.";	
						tieCount++;
					
					} else if(ran == 1) { //나:가위 - 컴:바위
						result = "졌습니다ㅠㅠ";
						loseCount++;
						
					} else { //나:가위 - 컴:보자기
						result = "플레이어 승!";
						winCount++;
			
					}
					
					System.out.println(result);
					System.out.printf("현재 기록 : %d승 %d패 %d무 \n", winCount, loseCount, tieCount);
					System.out.println();  // 줄바꿈
				
				} else if(input.equals("바위")) {   //플레이어(나) : 바위일 떄
					if(ran == 0) { //나:바위 - 컴:가위
						result = "플레이어 승!";	
						winCount++;
					
					} else if(ran == 1) { //나:바위 - 컴:바위
						result = "비겼습니다.";
						tieCount++;
						
					} else { //나:바위 - 컴:보자기
						result = "졌습니다.";
						loseCount++;
			
					}
					
					System.out.println(result);
					System.out.printf("현재 기록 : %d승 %d패 %d무 \n", winCount, loseCount, tieCount);
					System.out.println();  // 줄바꿈
				
					
				} else if(input.equals("보")) {   //플레이어(나) : 보자기일 떄
					if(ran == 0) { // 나:보 - 컴:가위
						result = "졌습니다ㅠㅠ";	
						loseCount++;
					
					} else if(ran == 1) { //나:보 - 컴:바위
						result = "플레이어 승!";
						winCount++;
						
					} else { //나:보 - 컴:보자기
						result = "비겼습니다.";
						tieCount++;
			
					}
					
					System.out.println(result);
					System.out.printf("현재 기록 : %d승 %d패 %d무 \n", winCount, loseCount, tieCount);
					System.out.println();  // 줄바꿈
				}
			
								

				
			}
			
			
			
			
	
	
	} //rps
	
	
	
	
	
	
	

}
