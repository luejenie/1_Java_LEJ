package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	/* for문 : 반복문
	 * - 끝이 정해져 있는 경우 사용하는 반복문
	 *   == 반복 횟수가 지정되어 있는 경우
	 * 
	 * [작성법]
	 * 
	 * for( 초기식 ; 조건식 ; 증감식 ) {
	 * 	 	
	 * 		조건식이 true일 때 반복 수행할 코드
	 * 
	 * }
	 * 
	 *  초기식 : for 문을 제어하는 용도의 변수 선언

		조건식 : for문의 반복 여부를 지정하는 식
      		조건식이 true인 경우에 반복을 수행함.***중요
      		보통 초기식에 사용되는 변수를 이용해서 조건식을 작성함.

		증감식 : for문이 끝날 때마다 특정값을 변화시키는 식
       		보통 초기식에 사용된 변수를 증가/감소 시켜 
       		조건식의 결과를 변하게 만듦.

	 * 
	 * 
	 * 
	 */
	
	
	// for문 기초 사용법1
	public void ex1() {
		// 1~10까지 반복 출력
		
		// 조건식
		// i = 1 2 3 4 5 6 7 8 9 10 을 만족하는 조건식을 찾아야 함(true여야함!). 11부터 false가 나오도록.
		// i < 10 : 10이 포함 안 됨.
		// i <= 10
		
		// 증감식 : i값이 1씩 증가
		
		for(int i = 1 ; i <= 10 ; i++) {
		//   1)초기식  ;	2,5)조건식 ; 4,7)증감식       :해석순서
													// 1,2,3,4,5 수행 후 -> 5~7을 반복	
			// 3,6) 반복 수행할 코드 :for문 안쪽 코드
			System.out.println(i + "출력");  // 1출력
		}
	
	}
	
	
	// for 기초 사용법2
	public void ex2() {
		
		//5부터 12까지 1씩 증가하면서 출력
		for(int i = 5 ; i <= 12 ; i++) {
		//해석순서   1)     2)     4)	
			
			// 3)
			System.out.println(i + "출력");
		}
		
		System.out.println("========================");
		
		// 1부터 100까지의 모든 정수의 합
		
		int sum = 0;  // 합계 저장용 변수
		// 왜 0으로 초기화 하는가?
		// -> 0이라는 값은 더하거나 뺄 때 아무런 영향이 없어
		//    누적이 필요한 상황에서 기준점으로 사용하기 적합하다.
		
		for(int i = 1 ; i <= 100 ; i++) {
			
			// i 값이 1~100씩 1씩 증가
			//  -> 이 i 값을 sum 변수에 계속 누적
			sum += i; //sum = sum + i;  _누적코드
		}

		System.out.println("1~100까지의 합 : " + sum);
	}
	
	
	
	// for 기초 사용법 3
	public void ex3() {
		
		// 두 정수를 입력 받아
		// 두 정수 사이의 모든 정수 합을 출력
		// (num1부터 num2까지)
		// 단, 첫 번째 입력이 두 번째 입력보다 작아야 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;  //합계 저장용 변수  _그냥 외우자!
		
		for(int i = num1 ; i <= num2 ; i++ ) {   //여기 for문 다시보기! 헷갈려
			sum += i;  //누적					// 첫 번째 값이 두 번째 값보다 크게 입력하면 출력값이 0 나옴!	
		}

		System.out.printf("%d부터 %d까지의 합 : %d \n", num1, num2, sum);

	}
	
	// for 기초 사용법 4
	public void ex4() {
		
		// 1부터 100까지 3씩 증가하는 숫자를 출력
		// 1 4 7 10 13 16 19 22 25 28 31 ....   //밑으로 말고 옆으로 출력
		
		for( int i = 1; i <= 100 ; i += 3 ) {
							// i를 3씩 증가
							// 1씩 증가 == i++ == i = i + 1
							// 3씩 증가 == i+=3 == i = i + 3
			
			System.out.print(i + " ");  // 숫자만 출력할 떄는 뒤에 띄어쓰기를 넣어주기! 
										// 띄어쓰기==공백문자
		}

		
		System.out.println("\n============================");  //줄을 바꾸고 경계선을 출력해라. 위에 print함수.
		
		//10부터 20까지 0.5씩 증가
		
		for( double i = 10.0 ; i <= 20.0 ; i += 0.5 ) {
			
			System.out.print(i + " "); 
						
		}
		
		// 무한루프
		// 10 + 0.5
		// 10.0 + 0.5 (자동 형변환)
		// 10.5 (double)
		// (int) 10.5 -> 10
		

	}

	
	// for문 응용
	// for문 + char + 자동/강제 형변환 응용
	public void ex5() {
		
		// A ~ Z까지 출력
		
		// 방법 1)
//		for( int i = 'A' ; i <= 'Z' ; i++ ) {
//			// 초기식 
//			// int = char -> char부분이 int로 자동 형변환돼서 65
//		
//			System.out.println( (char)i );  //문자출력을 위해 강제 형변환
//		}
		
		// 방법 2)		
		for(char i = 'A' ; i <= 'Z' ; i++) {
			System.out.println( i );
		}
		
		//'A' + 1
		// 65 + 1 == 66  강제형변환  
	}

	
	// [응용]
	public void ex6() {
		
		//10부터 1까지 1씩 감소하면서 출력      // ++ 비교하여 대각선다르게, 증감식 부등호 반대
		for( int i = 10 ; i >= 1 ; i-- ) {
			
			//조건식이 true인 경우에 수행될 코드
			System.out.println(i);
			
		}
		
	} //ex6
	

	// [응용]
	public void ex7() {
		// 입력, sum, for 응용
		
		// 정수 5개를 입력 받아서 합계 구하기
		
		Scanner sc = new Scanner(System.in);
	
		int sum = 0;
		
		for(int i=1 ; i<=5 ; i++) {
		
			System.out.print("입력 "+i+" : ");  //i를 "" 밖으로 뺴줘야 함.
			sum += sc.nextInt();   //*** 이 부분 외우자!!
			// 입력 버퍼에서 다음 정수를 얻어다
			// sum 변수에 누적
		}
		
		System.out.println("합계 : " + sum);

	} //ex7
	
	
	//[응용]
	//문제 ex7 응용
	public void ex8() {
	      // 정수를 몇 번 입력 받을지 먼저 입력 받고
	      // 입력된 정수의 합계를 출력
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 3
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 입력 3 : 30
	      // 합계 : 60
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 2
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 합계 : 30
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 정수의 개수 : ");
		int input = sc.nextInt();
		
		int sum = 0;   // sum 변수는 왜 for 밖에 하는 거지?
		for(int i = 1 ; i <= input  ; i++) {
			
			System.out.print("입력 "+i+" : ");   
			sum += sc.nextInt();  
		
		}
		
		System.out.println("합계 : " + sum);
	
	} //ex8
	
	
	// [기초]
	public void ex9() {
		// for, %(나머지), if-else 조건문 이용
		
		// 1부터 20까지 1씩 증가하며 출력
		// 단, 5의 배수에는 ()를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 12 13 14 (15) 16 17 18 19 (20)
		
		for(int i=1 ; i <= 20 ; i++) {
		
			if(i % 5 == 0) {  // 5의 배수인 경우
				System.out.print("(" + i + ") ");
				
			} else { // 5의 배수가 아닌 경우
				System.out.print(i + " ");
			}	
		}
	} //ex9
	
	
	// [응용]
	public void ex10() {
		
		// for, if, Scanner, 논리연산자, print 메서드
		// 구구단 출력
		// 2 ~ 9 사이 수를 하나 입력 받아
		// 해당하는 수의 단을 출력
		// 단, 입력 받은 수가 2 ~ 9 사이가 아니라면 
		// "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단(2~9) 입력 : ");
		int dan = sc.nextInt();
		
		// 2~9 사이의 단인지 검사하는 게 먼저
		
		if(dan < 2 || dan > 9) { //dan이 2~9 사이가 아니라면  
								// !(dan >= 2 && dan <= 9) 논리부정을 해도 됨.
			System.out.println("잘못 입력하셨습니다.");
			
		} else {
			/* 2 X 1 = 2
			 * 2 X 2 = 4
			 * 2 X 3 = 6
			 * 2 X 4 = 8
			 * 2 X 5 = 10
			 * ..
			 * 2 X 9 = 18
			 * */
			
			for(int i = 1; i <= 9 ; i++) {
				System.out.printf("%d X %d = %d \n", dan, i, (dan*i));
			}	
			
			System.out.println("===========================");
			
			// 역순 출력
			/* 2 X 9 = 18
			 * 2 X 8 = 16
			 * 2 X 7 = 14
			 * ..
			 * 2 X 1 = 2
			 * */
			
			for(int i = 9; i >= 1 ; i--) {
				System.out.printf("%d X %d = %d \n", dan, i, (dan*i));
			}	
			
		}		
	} //ex10
	
	
	// ================================================================
	// ================================================================
	
	// [중첩 반복문] 이중 for문
	
	public void ex11() {
		
		//12345
		//12345
		//12345
		//12345

		for(int x=1 ; x<=4 ; x++) {  // 4번 반복
		
			for(int i=1 ; i<=5 ; i++) {  // 12345 한문장이 나옴
				System.out.print(i); 
			}
		
			//줄바꿈
			System.out.println();  // (()안의 내용을 출력하고) 줄 바꿈(개행).
		}	
	} //ex11
	
	
	// [응용]
	public void ex12() {
		
		// 구구단 2단부터 9단까지 모두 출력  //2~9까지 8줄
		// 2x1=2 2x2=4 2x3=6 ...
		// 3x1=2 3x2=6 3x3=9...
		// 4x1=4 ...
		// ...
		// 9x1=9 ...
		
		for(int dan=2 ; dan<=9 ; dan++) {  //2단~9단
		
			for(int i=1 ; i<=9 ; i++) {
				
				System.out.printf("%dx%d=%2d ", dan, i, dan*i);	
										//%2d :  정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력
											// 한 자리 수라면 2칸 중에 오른쪽 칸에 숫자가 입력됨.
			}
			
			System.out.println();  //줄 바꿈
		}
		
		
	} //ex12
	
	
	
	
}
