package edu.kh.oop.constructor;

import edu.kh.oop.constructor.model.vo.Member;
import edu.kh.oop.field.model.vo.Temp;

public class ConstructorRun {
	
	public static void main(String[] args) {
		
		Member member1 = new Member();
								// 기본 생성자   _뒤에 부분이 생성자
		
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		// 기본 생성자가 없어도 Member() 구문에서 에러가 발생하지 않는다!
		// → 클래스에 생성자가 하나도 작성되지 않으면
		// 	 컴파일러가 자동으로 기본생성자를 추가해준다!
		//   public Member(){ } 가 Member 클래스에 자동 추가됨.
		
		
		Member member5 = new Member("member22", "pass22@", "01022223333", 33);
									// → 전달 인자, 인자(Argument)    _전달하는 값. 전달할게
		
		 // _이름이 똑같아도 매개변수가 다르면 다른 값이다.							
		
				
		Member member6 = new Member("아이디", "비밀번호비밀", "01012345678", 11);  
		Member member7 = new Member("idididid", "pwpwpwpw", "01001010101", 20);  
				
				
		
		
		Temp ti = new Temp();
		
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
