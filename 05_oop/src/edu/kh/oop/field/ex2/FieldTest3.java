package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest;
// 다른 클래스를 현재 클래스에서 사용할 수 있도록 가져오기

public class FieldTest3 extends FieldTest {  // 상속/ FieldTest3(子)  FieldTest(父)
//[접근제한자] [예약어] class 클래스명 [상속관계]

	public void ex() {
		
		FieldTest f = new FieldTest();
		
		System.out.println("다른 패키지");
		
		System.out.println( f.v1 ); // public
//		System.out.println( f.v2 ); // protected, 에러
									// → 다른 패키지, 상속X
									// _ f.v2는 새로 만든 걸 쓰겠다는 의미 =/= 상속
		
		System.out.println( v2 );  //_상단에 상속관계를 해놓으니 에러가 사라짐. f.을 안해도됨.
		// int edu.kh.oop.field.ex1.FieldTest.v2  -> ctrl 누르고 눌러보면 FieldTest로 연결됨
		// 상속 관계에선 protected 직접 접근 가능
		
		
//		System.out.println( f.v3 ); // (default) 
									// → 다른 패키지
		
		
	}
}
