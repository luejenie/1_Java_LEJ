package edu.kh.oop.field.model.vo;

public class Temp {
	
	private int num;
	private String name;
	
	// 생성자 관련 규칙
	// 1. 생성자가 하나도 작성되지 않으면, 컴파일러가 기본 생성자를 추가해준다.
	// 2. 매개변수 생성자 작성 시, 컴파일러가 기본 생성자를 자동 추가하지 않으므로 
	//    기본 생성자를 같이 직접 작성해준다.       //_아예 안쓰거나 쓸거면 기본 생성자는 필수로 써야함!
	
	
	public Temp() { }  //기본 생성자(필수!!)
	
	//매개변수 생성자 
	public Temp(int num, String name) {
		this.num = num;   
		this.name = name;  
		
	}
	

}
