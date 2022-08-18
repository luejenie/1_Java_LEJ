package edu.kh.oop.field.ex1;

public class FieldTest {
	
	/* 필드(Field) : 클래스에 작성되는 내용 중 객체의 속성
	 * 				객체의 속성을 작성하는 부분(영역)
	 * 
	 * == 멤버 변수    _필드와 같은 단어로 사용   _평소에 쓰던 변수는 지역 변수 (색이 다름)
	 * 
	 * [작성법]
	 * : 접근제한자 [예약어] 자료형 변수명 [= 초기값];  _접근제한자는 default도 있기 때문에 안 쓰는 경우도 있음.
	 * 
	 * * 필드에 작성 가능한 접근 제한자 *
	 * : public, protected, (default), private 4가지 모두 작성 가능
	 * 
	 * * 필드에 작성 가능한 예약어 *
	 * : final, static
	 * 
	 * */
	
	
	//__ 필드 대부분은 private으로 사용
	// 객체지향 언어에서 필요한 건 추상화와 캡슐화
	// 캡슐화는 private이 필요함!

	
	// 접근 제한자 확인 예제
	public    int v1 = 10;
	protected int v2 = 20;
			  int v3 = 30;  //(default)
	private   int v4 = 40;
	
	
	public void ex() {
		System.out.println("같은 클래스 내부 직접 접근");
		System.out.println( v1 );
		System.out.println( v2 );
		System.out.println( v3 );
		System.out.println( v4 );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
