package edu.kh.inheritance.model.vo;

//_사람이라면 공통적으로 무엇을 가지고 있을까? 에서 시작
public class Person extends Object { // 자식이 공통적으로 가지고 있는 필드/메서드를 작성함 (추상화)    
	
	
	// extends Object → 상속 구문이 작성되지 않으면 
	// 					컴파일러가 자동으로 추가함.
	// _ 위에서 extends Object를 쓰지 않아도 Object 사용 가능
	
	
	
	private String name;
	private int age;
	
	
	
	// 기본 생성자 단축키  _이 위치에서만 가능함
	// ctrl + space bar + enter
	public Person() { }


	// 매개변수 생성자 단축키
	// alt + s → o  또는 alt + shift + s → o
	// Generator Constructor using Fields...
			
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 자기소개 기능
	public void introduce() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	
	}

	
	
	
	

}
