package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		LEJ 이은지 = new LEJ();
		// heap 영역에 LEJ 클래스에 정의된 내용을 이용하여
		// LEJ 객체 생성(할당)
		
		
		//객체가 가지고 있는 속성을 얻어와서 출력
		System.out.println("이름 : " + 이은지.name );
		System.out.println("나이 : " + 이은지.age);
		System.out.println("생년월일 : " + 이은지.birthday);
		
		//System.out.println("비밀번호 : " + 이은지.password);
		//The field LEJ.password is not visible. 에러. 보이지 않음.
		
	
		//비밀번호를 볼 수 있는 기능을 호출 == 갑접 접근 방법
		이은지.showPassword();
	
		
		
		// 기능 수행
		이은지.eat();
		이은지.study();
		이은지.plus(50, 100);   //ctrl 누른 채로 plus 눌러보기
		
	}
}
