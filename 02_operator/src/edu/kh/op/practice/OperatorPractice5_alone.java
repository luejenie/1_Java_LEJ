package edu.kh.op.practice;

import java.util.Scanner;


public class OperatorPractice5_alone {

	public static void main(String[] args) {
		
//		//실습문제 3번 다시 해보기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		
//		String result = (input > 0) ? "양수" : (input < 0 ? "음수" : "0");
//		
//		System.out.println(result + "입니다.");
		
		
		//실습문제 3번 if문으로 해보기  _ 정수를 하나 입력 받아 양수/음수/0 을 구분하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input>0) {
			System.out.println("양수 입니다");
		} else {
			if(input < 0) {
				System.out.println("음수 입니다.");
			} else {
				System.out.println("0 입니다.");
			}
		}
		
		
		
		
		
		
		//실습문제 4번 다시 해보기
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 : ");
//		int kor = sc.nextInt();
//		
//		System.out.print("영어 : ");
//		int eng = sc.nextInt();
//		
//		System.out.print("수학 : ");
//		int math = sc.nextInt();
//		
//		// int sum = 0;
//		int sum = kor + eng + math;
//		System.out.println("합계 : " + sum);
//		
//		double avg = sum / 3.0;
//		System.out.printf("평균 : %.2f \n" , avg);
//		//System.out.println("평균 : " + avg);
//		
//		String pass = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60) ? "합격" : "불합격";
//		System.out.println(pass);
		
		
		
		
	}

}
