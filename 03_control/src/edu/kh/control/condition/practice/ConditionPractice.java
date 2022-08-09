package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input <= 0) {  //양수가 아닐 때
			System.out.println("양수만 입력해주세요.");
		} else if(input % 2 == 0){ //양수이면서 짝수일 때
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	
	}
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		int avg = sum / 3 ;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.printf("국어 : %d \n수학 : %d \n영어 : %d \n합계 : %d \n평균 : %d \n%s", kor, math, eng, sum, avg, "축하합니다, 합격입니다!");			
		} else {
			System.out.println("불합격입니다.");
		}

	}
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : System.out.println(month + "월은 31일까지 있습니다.");
		break;
		case 2 : System.out.println(month + "월은 28일까지 있습니다.");
		break;
		case 4 : case 6 : case 9 : case 11 : System.out.println(month + "월은 30일까지 있습니다.");
		break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}

		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		if(bmi >= 30) {
			result = "고도 비만";
			
		} else if (bmi >= 25) {
			result = "비만";
			
		} else if (bmi >= 23) {
			result = "과체중";
			
		} else if (bmi >= 18.5) {
			result = "정상체중";
		} else {
			result = "저체중";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
		//System.out.printf("BMI 지수 : %.14f \n%s", bmi, result);    %f는 소수점 아래 6자리까지만 표현됨. 앞에 14쓰면 14자릿수도 가능
		
	}
	
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mExam = sc.nextInt(); //중간고사 * 0.2
		
		System.out.print("기말 고사 점수 : ");
		int fExam = sc.nextInt(); //기말고사 * 0.3
		
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt(); //과제 * 0.3
		
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();  //출석 * 0.2
		
		
		double total = (mExam * 0.2) + (fExam * 0.3) + (homework * 0.3) + (attend * 0.2);
		
		String result= "보류";
		
//		if(total < 70 || attend >= (20*0.3)) {
//			result = "Fail [점수 미달]";
//		} else {
//			result = "Pass";
//		}
		
		System.out.println("================= 결과 =================");
		System.out.printf("중간 고사 점수(20) : %.1f \n기말 고사 점수(30) : %.1f \n과제 점수 (30) : %.1f \n출석 점수 (20) : %.1f \n총점 : %.1f \n%s"
				, mExam*0.2, fExam*0.3, homework*0.3, attend*0.2, total, result);
		
		
		
		
		
		
		
		
		
		
	}

}
