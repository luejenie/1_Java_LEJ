package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	// 실습문제 1~13
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		} else {  //이거 자체가 1보다 크거나 같다는 것을 의미
			
			for(int i=1; i <= input ; i++) {
				System.out.print(i + " ");
			}			
		}

	} //p1
	
	
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			
			for(int i = input ; i >= 1 ; i--) {
				System.out.print(i+ " ");
			}
		}		
	} //p2
	
	
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i <= input-1 ; i++ ) {
			
			System.out.print(i);
			sum += i;	
			System.out.print(" + ");    //// ????????
	
		}
		
		System.out.print(input + " = " + sum);
		
	} //p3
	
	
	
	
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
	
		//풀이 (1)
/*		if( num1 < 1 || num2 < 1) { //num1, num2 중에 1 미만이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else { //둘 다 1 미만이 아니다
			
			if(num1 < num2) { //num1 < num2
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
				
			} else { //num1 > num2
				for(int i=num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				}

		}
		} 
*/
		
		//풀이(2) for문 한번만 사용
/*		if( num1 < 1 || num2 < 1) { //num1, num2 중에 1 미만이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else { //둘 다 1 미만이 아니다
			
			int start = num1;
			int end = num2;
			
			if(num1 > num2) { //먼저 입력한 숫자가 크면 start/end를 바꿈
				start = num2;
				end = num1;	
			}
		
			for(int i=start ; i<=end ; i++) {
				System.out.print(i + " ");
			}		
		}
*/
		
		
		// 풀이(3) 더 간단하게
		if( num1 < 1 || num2 < 1) { //num1, num2 중에 1 미만이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else { //둘 다 1 미만이 아니다
		
			if(num1 > num2) {
				
				// 두 변수의 값 교환
				int temp = num1;  //임시. 많이 사용하는 방법
								 // temp:8 / num1:8 / num2:4
				num1 = num2; // temp:8 / num1:4 / num2:4
		        num2 = temp; // temp:8 / num1:4 / num2:8
			}
		
			for(int i=num1 ; i<num2 ; i++) {
				System.out.print(i + " ");	
			}
		}
	
	} //p4
		
		
		
		
		
		
		
//		if(num1 < 1 || num2 < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//			
//		} else if(num1 <= num2) { 
//			
//			for(int i=num1 ; i <= num2 ; i++) {
//				System.out.print(i + " ");
//			}
//		
//		} else if(num1 > num2){ 
//				
//				for(int x=num2 ; x <= num1 ; x++ ) {
//					System.out.print(x + " ");
//				}
//		}
	
//	}  //p4
	
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("===== " + input + "단 =====");
		
		for(int i=0; i<=9 ; i++) {
			System.out.printf("%d * %d = %d\n", input, i, (input*i));
		}
	
	}  //p5
	
	
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		
		// 풀이
		if(num >= 2 && num <= 9) {
			for(int dan=num ; dan <=9 ; dan++) {
				
				System.out.println("=====" + dan +"단 =====");
				
				for(int i=1 ; i<=9 ; i++) {
					System.out.printf("%d X %d = %2d \n", dan, i , dan*i );
				}
				System.out.println();  //단 사이 줄 바꿈
				
			} 
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요");
				
		}
				
	}
		
		
		
//		int dan = sc.nextInt();		
//		if(dan < 2 || dan > 9) {
//			System.out.println("2~9 사이의 숫자만 입력해주세요.");
//			
//		} else {
//			
//		
//			for(int x=dan ; x<=9 ; x++ ) {
//				System.out.println("===== " + x + "단 =====");
//				
//				//한 단만
//				for(int i=1 ; i<=9 ; i++) {	
//					System.out.printf("%d * %d = %d\n", x, i, (dan*i));
//				}
//			}
//		}
//	} //p6
	
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x=1 ; x <= input ; x++) {
			//한 줄 5개
			for(int i=1 ; i <= x ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} //p7
	
	
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x=1 ; x <= input ; x++) {
			for(int i=input ; i>=x ; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	} //p8
	
	
// 풀이	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 방법(1) for문을 이용
/*		for(int row=1 ; row <= input ; row++) {
			
			for(int i=input-1 ; i>=1 ; i--) { 
				//초기식을 바꿔도 되고, 
				// 조건식을 바꿔도 됨. for(int i=input-1 ; i >= row ; i--){ ~~
				
				System.out.println(" ");
				
			}
			
			for(int col=1 ; col<=row ; col++) { //별 출력
				System.out.print("*");
			}
			
			System.out.println(); //줄바꿈
		}
*/
		  //x표시 나서 일단 주석처리
		// 방법(2) if문을 이용
		// int row=0;
//		for(int col=1 ; col<=input ; col++) { //별 출력
//			
//			if(col <= input - row) {
//				System.out.println(" ");
//			
//			} else {
//				System.out.println("*");
//			
//			}		
//		}
		
		System.out.println(); //줄바꿈
		

				
	} //p9
	
	
//	내가 푼 식
//	public void practice9() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		
//		for(int x=1 ; x <= input ; x++) {	
//			for(int y=1 ; y <= input-x ; y++) {
//				System.out.print(" ");
//			}
//			for(int i=1 ; i <= x ; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		
//	} //p9
	
	
	//풀이
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();	
		
		//위쪽 삼각형
		for(int row=1 ; row<=input ; row++) {
			
			for(int col=1 ; col<=row ; col++) {
				System.out.println("*");
			}
			System.out.println(); //줄바꿈
		}
		
		//아래쪽 삼각형
		for(int row=input ; row>=1 ; row--) {
			
			for(int col=1 ; col<=row ; col++) {
				System.out.println("*");
			}
			System.out.println(); //줄바꿈
		}
	}//p10
	
	// 코드 공유
/*	for(int row=1 ; row<=input*2-1 ; row++){
 * 		
 * 		if(row < input) {
 * 	
 * 			for(int col=1 ; col <= row; col++){
 * 				System.out.print("*");
 * 			}
 * 
 *		 } else {
 *			for(int col=input ; col > row-input ; col--){
 *				System.out.print("*");
 *			}
 *		}	
 *			System.out.println();
 *
 *}
 *
 * */	

	
	
	//내가 푼 방식
//	public void practice10() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();	
//		
//		
//		for(int x = 1; x <=input ; x++) {
//			for(int i=1 ; i<=x ; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int y = (input-1); y>=1; y--) {
//			for(int j=y; j>=1 ; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//	}//p10
//	
	
	
//9번 응용	
	
	/* 실습문제 11
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 4
	    *
	   ***
	  *****
	 *******
	*/
	public void practice11() {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		
//		for(int row = 1 ; row <= input ; row++ ) {
//			
//			// for문을 이용한 풀이
//			for(int i = input-row ; i >= 1 ; i--) {
//			
//			for(int i = input-1 ; i >= row ; i--) {
//				System.out.print(" ");
//			}
//			
//			for(int col = 1 ; col <= row * 2 - 1 ; col++) {
//				System.out.print("*");
//			}
		
	
	
	//if문을 이용한 풀이
//	public void practice11() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		
//		for(int col=1 ; col <= input*2-1; col++) {
//			
//			if(input-row >= col || input+row <= col) {
//				System.out.println(" ");
//			
//			} else {
//				System.out.println("*");
//			}
//		}
//		System.out.println();
	}
	


		
	
	



		
		
		
		
		
		//풀다가 포기..
//		for(int x=(input-1); x>=1 ; x--) {
//			for(int y=1; y<=input-x ; y++) {
//				System.out.print(" ");
//				
//			} for(int i=1; i<=input ; i++) {
//				for(int odd=1 ; odd<=((2*i)-1) ; odd++) {
//					System.out.print("*");
//					
//				} for(int z=(input-1); z>=1 ; x--) {
//					for(int j=1; j<=input-x ; j++) {
//						System.out.print(" ");
//					} 
//				System.out.println();
//			}
//	
//		
//		}
//	}
		
//	} //p11  다시다시
//	
	
	
	
	//풀이.. 못 풀었음. 복습하기!
	// for문으로 5개 5줄 만들고 사이에 if문 넣어주기
	// if문 조건이 '공백일 경'우보다 '별이 나오는 경우'가 좀 더 쉬운편.
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) {
			
			for(int col=1 ; col<=input ; col++) {
				
				//첫 번째, 마지막 줄/칸일 때만 *출력
				if(row==1 || row==input || col==1 || col==input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}	
			}

			System.out.println();
		}
	
		
	} //p12
	
	
	
	
	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		//2의 배수 또는 3의 배수인 경우 출력하기 (1부터)
		for(int i=1 ; i<=input ; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
				
			// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다	
//			} if(i%6 == 0){
			} if(i%2 == 0 && i%3==0){
				count++;  //count 증가
			}
			
		}
		System.out.print("\ncount : " + count);
		
	} //p13
	
	
	
	
	

}
