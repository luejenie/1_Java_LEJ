package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		// sc.next();  sc.nextLine();의 차이는 무엇인가
			// Scanner의 동작 방법을 알아야 이해할 수 있음.
			// 키보드 - 입력버퍼(임시저장소) - 프로그램(RAM)
		// sc.next() : 한 단어 입력, 띄어쓰기 미포함
		//				-> 띄어쓰기, 엔터가 입력 종료를 의미
		// 			ex) 홍 길동 입력 -> 홍만 입력되고, 길동은 그 아래 '학년'으로 넘어감. 
		//							이에 학년에서 InputMismatch 오류가 뜸.
		
		// sc.nextLine() : 한 문장(한 줄) 입력, 띄어쓰기 포함
		//					-> 엔터가 입력 종료를 의미
		// 문제가 있음. 아래 성별 부분에 기술
		// 문제점 때문에 띄어쓰기가 없는 상태라면, sc.next()를 사용하는게 편함.
		
		
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int number = sc.nextInt();
		// 입력버퍼에 언터가 남은
		
		sc.nextLine(); //입력 버퍼 맨 앞에 남은 엔터를 꺼내옴 -> 입력 버퍼 청소
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.nextLine();  //String gender = sc.next(); 원본
		// sc.nextLine()을 쓰게 되면, 버퍼에 남은 엔터를 꺼내오고
		// -> 문자열을 입력하지 못하고 넘어감.
		// = Scanner의 문제점
		// ** 해결방법 **
		// 입력버퍼 맨앞에 있는 엔터(개행문자)를 제거하면 됨.
		// 맨 앞에 엔터(개행문자)가 남는 경우
		// -> next(), nextInt(), nextFloat(), nextDouble() 등... = 공백문자를 무시하고 다음으로 넘어감.
		//	  nextLine()을 제외한 모두
		//	  뒤에 sc.nextLine()을 한번 더 작성하기
		
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double testResult = sc.nextDouble();  //score
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.\n", grade, classroom, number, name, gender, testResult );
		//\n 개행문자 넣기
		
	
		
	}

}
