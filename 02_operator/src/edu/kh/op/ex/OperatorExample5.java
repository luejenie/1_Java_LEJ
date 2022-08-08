package edu.kh.op.ex;

import java.util.Scanner;

public class OperatorExample5 {
	public static void main(String[] args) {
		
		// 복합 대입 연산자 : +=, -+, *=, /=, %=   // 누적 연산이라고도 함.
		
		int a = 10;
		
		a++;
		System.out.println("a를 1 증가 : " + a ); // 11
		
		a += 4;  // a = a + 4;   // a+4 값을 a에 대입했다고 표현하지 않고 a를 4 증가시켰다고 표현함.
		System.out.println("a를 4 증가 : "  + a );  // 15 
		
		a -= 10; // a = a - 10;
		System.out.println("a를 10 감소 : " + a ); // 5
		
		a *= 3;  // a = a * 3;
		System.out.println("a를 3배 증가 : " + a );  // 15
			
		a /= 6;  // a = a / 6;
		System.out.println("a를 6으로 나눴을 때의 몫 : " + a );  //2

		a %= 2;  // a = a % 2;
		System.out.println("a를 2로 나눴을 때의 나머지 : " + a );  //2
		
		
		System.out.println("--------------------------------------------------");
		
		
		// 삼항 연산자 : 조건식 ? true인 경우 : false인 경우;
		
		// * 조건식 : 연산 결과가 true/false인 식 (비교, 논리, 논리부정)
		
		
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력 받은 정수가 짝수인지, 홀수인지 판별
		// 출력 ex)
		// 정수 입력 :  4
		// 짝수 입니다.
		
		// 정수 입력 : 5
		// 홀수 입니다.
	
		System.out.print("정수 입력 : ");
		
		int input = sc.nextInt();
		
		
		//	 삼항 연산자 : 	조건식 ? 			true인 경우 	: false인 경우;
		String result = (input % 2 == 0) ? "짝수 입니다." : "홀수 입니다.";
		
		System.out.println(result);
		
		// 0은 짝수 홀수에 포함되지 않지만, 조건식에 의해서 짝수입니다. 결과가 나옴. 
		// 이걸 해결해야 함. 해결하려면 삼항연산자 중첩 사용을 해야 함.
		
		
		
	/*	int b = 3;
		int c = 2;
				
		int result1 = b > c ? b++ : c--;
		System.out.println(result1);  */ //혼자 해봄
		
		
		
		
		
		
		
		
		
	}
}
