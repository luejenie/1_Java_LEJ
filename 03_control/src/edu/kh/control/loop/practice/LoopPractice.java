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
		
		for(int i=1 ; i <= input ; i++ ) {
			
			System.out.print(i);
			sum += i;	
			System.out.print(" + ");    //// ????????
	
		}
		
		System.out.print(" = " + sum);
		
	} //p3
	
	
	
	
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if(num1 <= num2) { 
			
			for(int i=num1 ; i <= num2 ; i++) {
				System.out.print(i + " ");
			}
		
		} else if(num1 > num2){ 
				
				for(int x=num2 ; x <= num1 ; x++ ) {
					System.out.print(x + " ");
				}
		}
	
	}  //p4
	
	
	
	
	
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
		int dan = sc.nextInt();
		
				
		if(dan < 2 || dan > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			
		} else {
			
		
			for(int x=dan ; x<=9 ; x++ ) {
				System.out.println("===== " + x + "단 =====");
				
				//한 단만
				for(int i=1 ; i<=9 ; i++) {	
					System.out.printf("%d * %d = %d\n", x, i, (dan*i));
				}
			}
		}
	} //p6
	
	
	
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
	
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x=1 ; x <= input ; x++) {	
			for(int y=1 ; y <= input-x ; y++) {
				System.out.print(" ");
			}
			for(int i=1 ; i <= x ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	} //p9
	
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();	
		
		
		for(int x = 1; x <=input ; x++) {
			for(int i=1 ; i<=x ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int y = (input-1); y>=1; y--) {
			for(int j=y; j>=1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}//p10
	
	
	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x=(input-1); x>=1 ; x--) {
			for(int y=1; y<=input-x ; y++) {
				System.out.print(" ");
				
			} for(int i=1; i<=input ; i++) {
				for(int odd=1 ; odd<=((2*i)-1) ; odd++) {
					System.out.print("*");
					
				} for(int z=(input-1); z>=1 ; x--) {
					for(int j=1; j<=input-x ; j++) {
						System.out.print(" ");
					} 
				System.out.println();
			}
	
		
		}
	}
		
	} //p11  다시다시
	
	
	
	
	
	public void practice12() {
		
	}
	
	
	
	
	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		//2와 3의 배수 모두 출력하기 (1부터)
		for(int i=1 ; i<=input ; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
				count++;
			}
			
		}
		
		System.out.print("\ncount :" + count);
		
		
		
	}
	
	
	
	
	

}
