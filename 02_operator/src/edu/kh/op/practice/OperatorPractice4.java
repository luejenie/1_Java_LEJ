package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		//합계를 저장하기 위한 변수. _보통 0으로 초기화
		//int sum = 0;
		
		int sum = kor + eng + math;
		
		//  sum / 3.0
		//  int / double   -> int를 double로 변경해줌
		
		//평균을 저장하기 위한 변수
		double avg = sum / 3.0 ;   //이부분 틀림! 자료형 주의!  //자동 형변환 int/double -> int를 double로
		String pass = (kor >= 40) && (eng >=40) &&	(math >= 40) && (avg >= 60) ? "합격" : "불합격" ;	
		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(pass);
		
		
	}

}
