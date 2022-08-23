package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class Example {
	
	
	public void ex1() {
		
		// 상속 확인
		
		// Student 자식 객체 생성
		Student s1 = new Student();
		
		// 자식만의 기능과 필드 (grade, classroom)
		s1.setGrade(2);   //setGrade(int grade)  : void  → Student(Student의 메서드)
		s1.setClassroom(3);  // → Student(Student의 메서드)
		
		s1.setName("홍길동"); //setName(String name) : void → Person(Person의 메서드)
					      // 부모인 Person으로부터 상속 받은 메서드라는 뜻
		
		s1.setAge(15); //setName(String name) : void → Person(Person의 메서드)
		
		
		// int edu.kh.interiatnce.model.vo.Student.getGrade()
		System.out.println(s1.getGrade());
		System.out.println(s1.getClassroom());
		
		
		// String edu.kh.inheriatance.moedl.vo.Person.getName()
		System.out.println(s1.getName());
		System.out.println(s1.getAge());	
		
//		Object
		
		Person p1 = new Person();
		
		//int java.lang.Object.hashCode()   //_Object클래스에서 상속받고 있음
		System.out.println(p1.hashCode());
		
		// ▶ Object 클래스는 모든 클래스의 최상의 부모
		//  == 모든 클래스는 Object 클래스의 후손 
		
		// 상속은 누적된다.
		// Object → Person → Student 
		
		
		
		Student s2 = new Student("김학생", 17, 1, 5);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getGrade());
		System.out.println(s2.getClassroom());
		
		
	}
	
	
	
	public void ex2() {
		//오버라이딩 :  재정의
		
		Person p1 = new Person("홍길동", 15);
		
		Student s1 = new Student("김학생", 17, 1, 5);
		
		
		
		p1.introduce();  
		
		//_부모의 자기소개방식은 이름과 나이, 2개뿐
		// 그러나 김학생의 경우 더 많은 정보를 담고 있음.
		// 이를 위해서는 부모의 자기소개 방식의 개정이 필요함.
		// Student에서 해결
		
		System.out.println("--------------------");
		
		s1.introduce();  
		// Person 상속 받음
		//→ 오버라이딩 진행 시 Student의 메서드로 인식되어짐.
		
		
		
	}
	
	
	
	
	
	
	

}
