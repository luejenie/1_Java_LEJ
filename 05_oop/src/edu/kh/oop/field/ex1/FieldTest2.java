package edu.kh.oop.field.ex1;

public class FieldTest2 {
	
	public void ex() {
		
		FieldTest f = new FieldTest();   //필드 4개 선언했던 클래스를 여기서 사용해보자
										 // 설계도만으로는 불가능 Fieldtest.f(); 바로 불가
										 // 객체로 만들어야 함
		
		System.out.println("같은 패키지, 다른 클래스");
		System.out.println( f.v1 );  // public
		System.out.println( f.v2 );  // protected
		System.out.println( f.v3 );  // (default) 
//		System.out.println( f.v4 );  // private, 에러
								   // → private은 같은 클래스 내부에서만 직접 접근 가능
		
		
										
		
		
	}
	

}
