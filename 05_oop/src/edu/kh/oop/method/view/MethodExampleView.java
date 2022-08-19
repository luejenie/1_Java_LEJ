package edu.kh.oop.method.view;

import java.util.Scanner;

import edu.kh.oop.method.model.service.MethodExampleService;

// 콘솔에 보여지는 내용 출력, 입력 받는 용도의 클래스
public class MethodExampleView {
	
	// 클래스 내 어디서든 사용 가능한 Scanner 객체 생성
	// (캡슐화 원칙에 따라서 private)
	private Scanner sc = new Scanner(System.in);  //필드로 올림. 지역변수 -> 멤버변수 (필드로 올리려면 캡슐화 원칙에 따라야 함.)

	private MethodExampleService service = new MethodExampleService();  //필드에 만듦
	
			//_ Run에서 view 객체를 만들고, view에서 service객체를 만듦
	
	
	
	// void : 반환값이 없음
	public void displayMenu() {		
		
		
		int input = 0;  // 메뉴 번호를 입력 받을 변수
		
		do {
			
			System.out.println("---------------------------");
			System.out.println("1. 매개변수 X, 리턴 값 X");   //반환값 = 리턴값
			System.out.println("2. 매개변수 O, 리턴 값 X");
			System.out.println("3. 매개변수 X, 리턴 값 O");
			System.out.println("4. 매개변수 O, 리턴 값 O");
			System.out.println("0. 종료");
			System.out.println("---------------------------");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();  // 입력 버퍼 개행문자 제거
			
			System.out.println();  // 줄 바꿈
			
			switch(input) {
			
			// 1이 입력되었을 때, service가 참조하는 객체의 method1() 메서드 호출
			case 1 : service.method1(); break;    //service'에' method1을 가져오겠다.
			
			case 2 : // service.method2(100, 50, 70); 
					 // this.menu() 원하는대로 적으면 됨.
					 menu2();   // 현재 객체가 가지고 있는 menu2() 메서드 호출 
				     break;
				
			case 3 : 
				String result = service.method3(); 
				//method3() 호출 후 String값을 반환 받고
				//그 값을 result 변수에 저장
				
				System.out.println(result);
				break;
				
				
				
			case 4 : 
				menu4();		
				break;
				
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
			
		
		} while(input != 0);   //input이 0이면 반복 종료  (input이 0이 아니면 참, 0이면 거짓_ 참일때만 조건이 반복됨. 거짓이면 반복이 끝남)
		
	}

	
	// method2 관련  //view에 구현되는 것이기 떄문에 service가 아니라 view에 구현.
	// 정수 3개를 입력 받고, service.method2()를 호출하는 메서드 작성
	
	public void menu2() {
		
		System.out.print("입력 1 : " );
		int input1 = sc.nextInt();
		
		System.out.print("입력 2 : " );
		int input2 = sc.nextInt();
		
		System.out.print("입력 3 : " );
		int input3 = sc.nextInt();
		
		service.method2(input1, input2, input3);   //같은 자료형의 변수를 넣어주면 됨.
	
	}
	
	
	//입력받고 출력하고 호출받는 부분 만들어야 함
	public void menu4() {
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		
		
		System.out.print("연산자 입력 : ");
		String op = sc.next();
		
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		
		// 출력모양 1 + 2 = 3  
		System.out.printf("%d %s %d = %.1f \n", 
						input1, op, input2, service.method4(input1, input2, op));  //순서 동일하게
	
	}
	
	
	
	
	
	
	
}
