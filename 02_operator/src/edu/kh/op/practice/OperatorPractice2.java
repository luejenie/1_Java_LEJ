package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* String name = "홍길동";  //이름
		int grade = 3;  //학년
		int classroom = 4; //반
		int number = 15; //번호
		String gender = "남학생";
		double testResult = 85.75;//성별 */
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double testResult = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.", grade, classroom, number, name, gender, testResult );
		
		
		
		
		
		
	}

}
