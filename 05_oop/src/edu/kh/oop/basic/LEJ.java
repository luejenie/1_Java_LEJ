package edu.kh.oop.basic;


//클래스 : 객체가 되었을 때 가지고 있을 속성, 기능을 정의한 문서
public class LEJ {
	
	// 객체가 가지고 있는 속성
	String name = "이은지";
	int age = 31;
	String birthday = "1992-09";
	
	
	//캡슐화 예시
	private String password = "1234";  
	// private : 해당 클래스 내부에서 접근 가능하다라는 뜻
	
	/// 패스워드 같은 중요한 정보를 공개하면 안됨. 아예 코드가 작성되면 안됨.
	// private을 넣어서 캡슐화
	// password에 에러 The value of the field LEJ.password is not used.== 보이지 않는다.
	
	
	
	
	// 객체가 가지고 있는 기능
	public void study() {
		System.out.println("자바 공부를 열심히 할 수 있음.");
	}
	
	public void eat() {
		System.out.println("밥을 맛있게 먹을 수 있음");
	}
	
	public void plus(int num1, int num2) {
		System.out.println("합 : " + (num1 + num2));
	}
	
	
	// public : 같은 프로젝트 내부 누구든, 어디서든 접근 가능
	public void showPassword() {
		System.out.println("비밀번호 : ***" + password + "***");
	}
	

}
