package edu.kh.oop.constructor.model.vo;

public class Member {
	
	// 추상화 → 아이디, 비밀번호, 전화번호, 나이
	
	// 캡슐화 → 추상화 결과를 묶고, 데이터 직접 접근 제한
	private String memberId;
	private String memberPw;
	private String memberPhone;   //전화번호를 int로 하면 0이 처음일 떄 사라짐.
	private int memberAge;  // 나이는 int 사용 가능
	
	
	// 생성자(기능) : 객체를 생성할 때 사용하는 기능
	
	// 생성자 작성 규칙 
	// 1.클래스명 == 생성자명
	// 2. 반환형 X
	
	// 기본 생성자 : ()내에 아무것도 없는 생성자 → 매개변수가 없는 생성자
	public Member() {
		
		// 생성자 사용 목적 : 1. 필드 초기화
		memberId = "member01";
		memberPw = "pass01!";
		memberPhone = "010-1234-1234";
		memberAge = 25;
		
		
		
		// 생성자 사용 목적 : 2. 객체 생성 시 특정 기능 수행
		System.out.println("Member 객체가 생성 되었습니다.");
		
		
		// 한 번 만들어둔 생성자를 계속 재사용
		// → 코드 길이 감소, 재사용성 증가
		
	} 
	
	// ★★★ 기본 생성자가 없어도 Member() 구문에서 에러가 발생하지 않는다! 
	// → 클래스에 생성자가 하나도 작성되지 않으면
	// 	 컴파일러가 자동으로 기본생성자를 추가해준다!
	//   public Member(){ } 가 Member 클래스에 자동 추가됨.
	
	
	// 매개변수 생성자
	public Member(String memberId, String memberPw, String memberPhone, int memberAge) {   //_전달 받을게
					// ( ) 안 → 매개 변수(Parameter)
					// * 매개 : 둘 사이에 관계 형성
		
		
		// 필드와 매개변수의 변수명이 같을 경우
		// 변수명 호출 시 가까운 필드 또는 매개변수가 호출된다.
		
		// this 참조 변수
		// - 생성된 객체(인스턴스)에 숨겨진 참조 변수
		//	 현재 객체의 시작 주소를 참조함.  == 현재 객체를 참조함.    // _자기자신
		
		// 생성된 객체의 필드를 매개변수로 초기화
		this.memberId = memberId;    //_현재 생성된 객체 memberPw에 memberPw를 넣겠다. ??
		this.memberPw = memberPw; 
		this.memberPhone = memberPhone; 
		this.memberAge = memberAge; 
		
		
		
		System.out.println(memberId);
		System.out.println(memberPw);
		System.out.println(memberPhone);
		System.out.println(memberAge);
		
		
		
	}
	
	
	// 오버로딩(OverLoading, 과적)   _과하게 적재하다.
	// → 이름 하나로 여러 기능을 수행할 수 있게 하는 것
	// == 동일한 메서드(또는 생성자)명으로 여러 메서드를 작성하는 것
	
	// 오버로딩의 조건
	// 1. 메서드(생성자) 이름이 같아야 한다.
	// 2. 매개변수가 타입, 개수, 순서 중 하나라도 달라야 한다.
	
	public Member(String memberId, String memberPw) {  //1.이름이 같아야 한다
		// 매개변수 개수가 달라서 오버로딩이 성립.
		// 다 똑같이 쓰고 long age라고 자료형을 변경하거나, 순서를 바꿔도 성립
		
	}
	
	//   ** 오버로딩 주의사항 **
	// → 매개변수 "자료형"의 타입, 개수, 순서 중 하나라도 달라야 한다!
	// → 매개변수명은 사용자가 보기 편하게 하기 위해 의미를 부여하는 것뿐
	//	 컴퓨터한테는 불필요한 요소라서 오버로딩 검사 시 인식되지 않음.
	// _사람한테는 멤버아이디랑 패스워드 순서가 바뀐게 크게 다가오지만 컴퓨터한테는 별거 아닌 요소. 그냥 String 두 개인 것. 
	
//	public Member(String memberPw, String memberId) {
//		// Duplicate method Member(String, String) in type Member  순서가 달라져도 에러.	
//	}
	
	
	
	// this() 생성자   _참고로 알아두기. 많이 쓰지는 않음.
	// - 생성자를 이용한 필드 초기화 구문의 중복을 없애고, 재사용성을 늘리기 위한 방법
	// - 주의사항 : 반드시 생성자의 첫 줄에 작성되어야 한다!
	//  _ 호출하다가 컴퓨터가 더 무거워지는 경우가 있어 많이 안씀.
	
	
	public Member(int memberAge, String memberPhone) {
		
		// 전달 받은 매개변수로 현재 객체 필드 초기화
		this.memberAge = memberAge;    //현재 객체 memberAge에 memberAge 값을 전달하겠다.
		this.memberPhone = memberPhone;
	}
	
	
	public Member(String memberId, int memberAge, String memberPhone) {
		this(memberAge, memberPhone);  // this() 생성자 호출   //_ 매개변수에서 전달받아서 다시 위의 생성자로 전달 (ctrl 누르고 눌러보면 알 수 있음)

		// 전달 받은 매개변수로 현재 객체 필드 초기화
		this.memberId = memberId;
		
//		this.memberAge = memberAge;   //위와 중복된 코드
//		this.memberPhone = memberPhone;
	}
	
	
	
	
	
	
	
	
	
	// 메서드(기능)
	
	
	
	
	

}
