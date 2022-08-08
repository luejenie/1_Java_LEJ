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
	
	
	
	
}
