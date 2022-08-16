package edu.kh.oop.basic;


//클래스 : 객체가 되었을 때 가지고 있을 속성, 기능을 정의한 문서
public class LEJ {
	
	// 객체가 가지고 있는 속성
	String name = "이은지";
	int age = 31;
	String birthday = "1992-09";
	String password = "1234";
	
	
	
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
	
	

}
