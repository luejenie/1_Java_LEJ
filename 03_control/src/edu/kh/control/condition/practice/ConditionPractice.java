package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
//		if(input <= 0) {  //양수가 아닐 때
//			System.out.println("양수만 입력해주세요.");
//		} else if(input % 2 == 0){ //양수이면서 짝수일 때
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
	
		
/*		// 답안 (1)
		if(input > 0) {  //양수
			if(input % 2 == 0) { //짝수
				System.out.println("짝수 입니다.");
			} else {  //홀수
				System.out.println("홀수 입니다.");
			}				
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
*/		
		//답안 (2) if-else if 사용  __ 내가 쓴 답안이랑 result 사용한거 빼고 똑같음.
		String result;
		
		if(input <= 0) {
			result = "양수만 입력해주세요.";
		} else if(input % 2 == 0) {
			result = "짝수 입니다.";
		} else {
			result = "홀수 입니다.";
		}
		
	}
	
	
	
	
	//-----------------------------------------------------------------
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		//합계
		int sum = kor + math + eng;
		
		//평균
		double avg = sum / 3.0 ;    //***또 틀림! 주의!!!! double 쓰고 뒤에 .0 잊지 말기!
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {  //합격
			
			//내가 한 부분. 실행은 됨.
			//System.out.printf("국어 : %d \n수학 : %d \n영어 : %d \n합계 : %d \n평균 : %d \n%s", kor, math, eng, sum, avg, "축하합니다, 합격입니다!");			
		
			//답안은 println으로 사용    //이게 확실히 더 보기 좋다.
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다. 합격입니다!");
			
		} else { //불합격
			System.out.println("불합격입니다.");
		}

	}
	
	
	//------------------------------------------------------
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
//		switch(month) {
//		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : System.out.println(month + "월은 31일까지 있습니다.");
//			break;
//		case 2 : System.out.println(month + "월은 28일까지 있습니다.");
//			break;
//		case 4 : case 6 : case 9 : case 11 : System.out.println(month + "월은 30일까지 있습니다.");
//			break;
//		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
//		}
	
		//답안
		
		//30일 : 4 6 9 11
		//31일 : 1 3 5 7 8 10 12
		//28일 : 2
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
			
		case 4 : case 6 : case 9 : case 11 :
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
			
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
		// result 를 만들어서 빠르게 만들 수 있음.
		// 일단 되게 만들고, 그 뒤에 리팩토리(?)하면 됨. -> 효율적으로 바꾸고, 주석 지워서 용량 낮추고 등등
	}

	
	
	
	//----------------------------------------------------------------
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		
		//내가 한 답 : 굳이 거꾸로 할 필요 없음. 미만을 따라가는게 더 짧음.
//		if(bmi >= 30) { 
//			result = "고도 비만";
//			
//		} else if (bmi >= 25) {
//			result = "비만";
//			
//		} else if (bmi >= 23) {
//			result = "과체중";
//			
//		} else if (bmi >= 18.5) {
//			result = "정상체중";
//			
//		} else {
//			result = "저체중";
//		}
		
		
		//답안
		if(bmi < 18.5) {
			result = "저체중";
			
		} else if(bmi < 23) {
			result = "정상체중";
			
		} else if(bmi < 25) {
			result = "과체중";
			
		} else if(bmi < 30) {
			result = "비만";
			
		} else {
			result = "고도 비만";
		}
		
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
		//System.out.printf("BMI 지수 : %.14f \n%s", bmi, result);    %f는 소수점 아래 6자리까지만 표현됨. 앞에 14쓰면 14자릿수도 가능
		
	}
	
	
	
	
//--------------------------------------------------------------------	
	public void practice5() {
		
/*		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mExam = sc.nextInt(); //중간고사 * 0.2
		
		System.out.print("기말 고사 점수 : ");
		int fExam = sc.nextInt(); //기말고사 * 0.3
		
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt(); //과제 * 0.3
		
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();  //출석 * 0.2
		
		
		double total = (mExam * 0.2) + (fExam * 0.3) + (homework * 0.3) + (attend);
		
		String result;
		
		if(total < 70 ) {
			result = "Fail [점수 미달]";
		} else if (attend <= (20*0.7) {   //결석을 봐야해
			result = "Fail [출석 횟수 부족 (attendacne/20);
		} else {
			result = "Pass";
		}
		
		System.out.println("================= 결과 =================");
		System.out.println("중간 고사 점수(20) : " + (mExam * 0.2));
		System.out.println("기말 고사 점수(30) : " + (fExam * 0.3));
		System.out.println("과제 점수      (30) : " + (homework * 0.3));
		System.out.println("출석 점수      (20) : " + (double)attend);  //실수형으로
		System.out.println("총점 : " + total);
		System.out.println(result);
		
		
		
		
		//System.out.printf("중간 고사 점수(20) : %.1f \n기말 고사 점수(30) : %.1f \n과제 점수 (30) : %.1f \n출석 점수 (20) : %.1f \n총점 : %.1f \n%s"
		//		, mExam*0.2, fExam*0.3, homework*0.3, attend*0.2, total, result);
		
		
		// ?????? 대체 출석 점수 왜이래? 왜 자꾸 3.6?  출석 점수에서 *0.2 안 하면 답 나옴. 그러면 이건 왜 있는거지? total에도 들어가지 않아..
		// 뭔가 더 깔끔하게 할 수 있을 것 같은데.. 모르겠음..
		
*/
		
		//답안
		// 응용할 때, 비율도 조절할 수 있도록 해보기
		Scanner sc = new Scanner(System.in);
		
		
		//소수점 있기 때문에 재활용해보자. int -> double   
		// 변수의 장점 "재사용성"
		System.out.println("중간 고사 점수 : ");
		double midTerm = sc.nextInt();  // int로 입력 받아도 대입 연산 시 double로 자동 형변환
										//왜 에러나지 않나. 큰쪽으로 자동 형변환 되기 때문에!
		
		System.out.println("기말 고사 점수 : ");
		double finalTerm = sc.nextInt();
		
		System.out.println("과제 점수 : ");
		double report = sc.nextInt();
		
		System.out.println("출석 횟수 : ");
		double attendance = sc.nextInt();
		

		// 각각의 점수를 비율에 맞게 변경
		midTerm *= 0.2;  // midTerm = midTerm * 0.2;  더 간단하게!
		finalTerm *= 0.3;  
		report *= 0.3;  
	 // attendance *= 5 * 0.2;  //attendance = attendance * 5 * 0.2;
								// 어차피 1이라서 1이라고 써도 되고, 아예 안써도 됨.
		
		// 중간, 기말, 과제는 100점 기준으로 비율을 곱함
		// 출석은 20회 기준으로 비율을 내기 때문에 5를 곱해서 100을 만들어줘야 함. 20 * 5 * 0.2
		
		System.out.println("================= 결과 =================");
		
		// if 중첩
		if(attendance <= (20 * 0.7)) {   //14번보다 이하 출석했을 경우
			System.out.println("Fail [출석 횟수 부족]" + (int)attendance + "/20");  //attendance 자료형이 double이라서 int로 강제 형변환 해줘야 함.
												// 소수점 버림 처리
		
		} else {  //출석 만족
			System.out.printf("중간 고사 점수(20) : %.1f \n", midTerm);
			System.out.printf("기말 고사 점수(30) : %.1f \n", finalTerm);
			System.out.printf("과제 점수(30) : %.1f \n", report);
			System.out.printf("출석 점수(20) : %.1f \n", attendance);
			
			
			double sum = midTerm + finalTerm + report + attendance;
			System.out.printf("총점 : %.1f \n", sum);
			
			if(sum >= 0) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
		
	}
	
	
	//----------------------------------------------------------
	// 5번 문제 복습해보기
	public void practice5_review() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midterm = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		double finalterm = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		double report = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		double atd = sc.nextInt();
		
		
		//double total = (midterm * 0.2) + (finalterm * 0.3) + (report * 0.3) + (atd * 5 * 0.2);

		
		midterm *= 0.2;
		finalterm *= 0.3;
		report *= 0.3;
		// atd *1 =
		
		double total = midterm + finalterm + report + atd;
		
		
		String result;
		if(total < 70) { //70점 미만이거나
			result = "Fail [점수 미달]";
		
		} else if((20-atd) >= (20*0.3)){ //출석일수 부족
			result = "Fail [출석 횟수 부족 (" + atd + "/20)";     //앞부분이 안나와야 함!!		
			
		} else { //70점 이상이면서 출석일수 충족
			result = "PASS";
		}
		
		
		System.out.println("========결과========");
		System.out.println("중간 고사 점수(20) : " + midterm);
		System.out.println("기말 고사 점수(20) : " + finalterm);
		System.out.println("과제 점수 (30) : " + report);
		System.out.println("출석 점수 (20) : " + atd);
		System.out.println("총점 : " + total);
		System.out.println(result);

		
		
		
	}
	
	

}
