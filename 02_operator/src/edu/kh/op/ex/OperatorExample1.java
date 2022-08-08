package edu.kh.op.ex;

import java.util.Scanner; //Scanner import

public class OperatorExample1 {
	
	//main + ctrl + spacebar + enter : 자동완성
	public static void main(String[] args) {
		
		//산술 연산자 : + - * / %(modular, 나머지)
		
		
		
		System.out.println("두 정수를 입력 받아 산술 연산 결과 출력하기");
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		// 5 + 3 = 8
		System.out.println(input1 + " + " + input2 + " = " + (input1+input2));
		
		// 5 - 3 = 2
		System.out.printf("%d - %d = %d \n" , input1, input2, (input1-input2));

		// 5 * 3 = 2
		System.out.printf("%d * %d = %d \n" , input1, input2, (input1*input2));
		
		// 5 / 3 = 1.66666... int / int = int(몫만 남음. 소수점 뒤에 버림)
		System.out.printf("%d / %d = %d \n" , input1, input2, (input1/input2));
		
		
		// 5 % 3 = 2(나머지)  
		System.out.printf("%d %% %d = %d \n" , input1, input2, (input1%input2));
		// //그냥 %만 사용하면 오류가 남. 패턴으로 인식되기 때문. 따라서 %% 두 개 적어야 함.
		// printf에서 '%' 문자를 출력하기 위해서는 %% 입력
		// cf. println에서는 % 하나만 입력해도 가능함.
		
		
		
		
		
	}

}
