package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 양수/음수/0
		String result = (input == 0) ? "0" : (input > 0 ? "양수" : "음수");
												// 뒤 조건식에는 0이 제외
		
		System.out.println(result + " 입니다.");					
		
		
	}

}

/*System.out.print("정수 입력 : ");
int input1 = sc.nextInt();
String result1 = (input1 > 0) ? "양수 입니다." : "0 또는 음수 입니다.";

System.out.println(result1);
System.out.println();


System.out.print("정수 입력 : ");
int input2 = sc.nextInt();
String result2 = (input2 < 0) ? "음수 입니다." : "0 또는 양수 입니다.";

System.out.println(result2);
System.out.println();

System.out.print("정수 입력 : ");
int input3 = sc.nextInt();
String result3 = (input3 == 0) ? "0 입니다." : result1;

System.out.println(result3);
System.out.println();*/


//제일 어렵