package edu.kh.control.condition;

import java.util.Scanner;

//시키는 코드를 수행하는 부분(시키는 일 하는 사람) a.k.a.직원
public class ConditionExample {

	public void test1() {
		System.out.println("1번 기능을 수행합니다.");				
	}
	
	public void test2() {
		System.out.println("2번 기능을 수행합니다.");				
	}
	
	
	// if문 예시 1번
	public void ex1() {
		System.out.println("[if문 예시 1]");
		
		
		// if(만약에) : 조건식이 true 일 때만, 내부에 작성된 코드를 수행하는 구문
		/* 작성법
		 * if(조건식) { 
		 * 
		 * 	// 조건식이 true일 때 수행되는 코드
		 * 
		 * }
		 */
		
		//Sc + ctrl + spacebar 제일 위에 Scanner 자동완성 + import 구문도 추가됨.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// if가 두 번 -> 일을 두 번한 것과 같음. 비효율적. _ 과거에는 비효율적이라고 생각했는데 요즘엔 효율적이라고 하는 추세(유지보수)
		//입력된 정수가 짝수인지 검사 (0도 짝수 취급)
		if(input % 2 == 0) {   // _ ==비교 연산자가 있으니 조건식
			System.out.println("짝수 입니다.");   //_ 조건이 true가 되면 실행, 그렇지 않으면 건너뜀.	
		}
		
		
		//홀수
		if(input % 2 != 0) {
			System.out.println("홀수 입니다.");
		}
		
		System.out.println("[if문 예시 1 종료]");
		
		// 일을 시켜줄 떄까지 잠겨있음. ConditionRun에 가서 실행해야만 실행됨.
	}
	
	
	public void ex2() {
		System.out.println("[if문 예시 2]");
		
		Scanner sc = new Scanner(System.in);
		
		// if - else문
		// if문 조건식의 결과가 true이면 if문,
		// false이면 else문을 수행하는 구문
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if( input % 2 == 1) { //홀수인 경우
			System.out.println("홀수 입니다");
		} else {
			
			/* 중첩 if문 */
			if(input == 0) { //짝수인 경우
				System.out.println("0 입니다.");	
			} else {		
				System.out.println("짝수 입니다.");
			}
		
		}	
		System.out.println("[if문 예시 2 종료]");
	
	}
	
	
	
	public void ex3() {
		
		// if - else if - else
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수를 입력해주세요 : ");
		int input = sc.nextInt();
		
		
		String season;  // 변수 선언
		
		//봄이 아니라면 여름, 가을, 겨울 중 아무거나 나오게 하려면?
		if(input >= 3 && input <= 5) {
			season = "봄";
			
		} else if (input >= 6 && input <= 8){
			season = "여름";
			
		} else if (input >= 9 && input <= 11) {
			season = "가을";
		
		} else if (input == 12 || input == 1 || input == 2) {
			season = "겨울";	
		
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		
				
		System.out.println(season);   
		// The local variable season may not have been initialized. 초기화되지 않을 수 있다.
	}
	
		
		
	public void ex4() {
			// 나이를 입력 받아 
			// 13세 이하면 "어린이"
			// 13세 초과, 19세 이하 "청소년"
			// 19세 초과 시 "성인"
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		
		if (age <= 13) {
			result = "어린이";
	
		} else if (age <= 19) {  
			//else if (input > 13 && input <= 19) 
			// 이미 위에 조건에서 13미만이 아니라는 걸 알았기 떄문에 13초과 부분이 생략 가능. 그래프 그려보기.
			// 좀 더 효율적인 코드!
			result = "청소년";
			
		} else {
			result = "성인";
		}
		
		System.out.println(result);
				
	}
	
	
	//다시해보기!
	public void ex5() {
		// 놀이기구 탑승 제한 검사
	      
	      // 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
	      // 나이가 12미만인 경우 : "적정 연령이 아닙니다."
	      // 키가 140.0cm 미만 : "적정 키가 아닙니다."
	      // 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
				// 나이 먼저 생각해보기! -> 잘못된 경우부터 생각하는 게 좋음.
				// 나이를 0세 미만, 100세 초과부터 생각해 보자.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		
		String result;
		
		// 나이 입력 후 키 입력 안하고 바로 "적정 연령이 아닙니다" 나오게 하는 법??
		
		//첫 번째 방법. 중첩 if 이용
		/*  if(age < 0 || age > 100) {  //0세 미만 100세 초과
			result = "잘못 입력 하셨습니다.";		
			
		} else {
			
			if(age < 12) { //12세 미만
				result = "적정 연령이 아닙니다.";
				
			} else { //12세 이상
				
				if(height < 140.0) { //140 미만
					result = "적정 키가 아닙니다.";
				} else { //12세 이상, 140 이상
					result = "탑승 가능";
				}
			}
		}  */
		
		
		
		//두 번째 방법. else if 이용
		
		if(age < 0 || age > 100) {
			result = "잘못 입력 하셨습니다.";
			
		} else if (age < 12) {   // 이 부분부터 범위가 0 이상 100 이하로 한정되어 짐.
			result = "적정 연령이 아닙니다.";
			
		} else if (height < 140.0) {
			result = "적정 키가 아닙니다.";
		
		} else {
			result = "탑승 가능";
		}
		
		
		System.out.println(result);
	
	}	
	
	
	
//		if(age >= 12 && height >= 140.0) {
//			result = "탑승 가능";			
//		
//		} else if(age < 0 || age > 100) {
//			result = "잘못 입력 하셨습니다.";
//		
//		} else if(age < 12) {
//			result = "적정 연령이 아닙니다.";
//							
//		} else {
//			result = "적정 키가 아닙니다.";
//	    }
//		
//		System.out.println(result);
	
	
	
}

	
	
