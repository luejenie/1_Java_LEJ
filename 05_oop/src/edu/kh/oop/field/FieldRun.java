package edu.kh.oop.field;

import edu.kh.oop.field.model.vo.*;

public class FieldRun {

	public static void main(String[] args) {
		
		// Student 객체 생성
		Student std1 = new Student();
		
		// std1이 참조하는 객체에 있는 name 필드에 "홍길동"을 대입하겠다.
		std1.name = "홍길동";
		
		
		//
		Student std2 = new Student();
		std2.name = "이순신";
		
		
		System.out.println("[std1]");
		System.out.println("이름 : " + std1.name);
		// std1이 참조하는 객체의 name 필드 값 출력
		
		System.out.println("학교명 : " + std1.schoolName);
		std1.study();
		
		//_ 배열보다 더 많고 효율적인 코드 작성이 가능.
		//	배열에는 기능을 넣을 수 없지만 객체는 기능을 넣을 수 있음.
		
		System.out.println("[std2]");
		System.out.println("이름 : " + std2.name);
		System.out.println("학교명 : " + std2.schoolName);
		std2.study();
		
		
		
		System.out.println("==================================");
		
		// static 미사용
		// 모든 학생 객체의 학교명 변경   _학생이 1000명 정도 있다고 가정해보자
//		std1.schoolName = "KH대학 부속 고등학교";
//		std2.schoolName = "KH대학 부속 고등학교";

		
		// static(==공유 영역) 사용
//		std1.schoolName = "KH대학 부속 고등학교";  //한 줄만 썼는데도 아래 둘다 모두 바뀜
		// The static field Student.schoolName should be accessed in a static way
		
		// * static 방식으로 접근하기 *
		// → 클래스명.static 필드명/메서드명
		
		// _너무 남용하면 컴퓨터가 느려짐. 적절히 사용하는 게 좋음.
		
		Student.schoolName = "KH 정보교육원";
				
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
	
		
		
		System.out.println("===========================");
		System.out.println("초기화 블록 확인하기");
		
		Trainee t1 = new Trainee(); // 훈련생 객체 생성
		
		System.out.println(t1.name);
		System.out.println(t1.phone);
		System.out.println(t1.email);  // 초기화가 되어 있는가? 확인 목적
		System.out.println(t1.salary); // 초기화가 되어 있는가?
		System.out.println(t1.classRoom); // 초기화가 되어 있는가?

		
		
		Trainee t2 = new Trainee(); // t2라는 훈련생 객체를 생성해도 t1처럼 초기화되어 있음.  ___ 많이 쓰이지는 않음.
		
		System.out.println(t2.name);
		System.out.println(t2.phone);
		System.out.println(t2.email);  // 초기화가 되어 있는가? 확인 목적
		System.out.println(t2.salary); // 초기화가 되어 있는가?
		System.out.println(t2.classRoom); // 초기화가 되어 있는가?
		

		
		
		
		
	}
}
