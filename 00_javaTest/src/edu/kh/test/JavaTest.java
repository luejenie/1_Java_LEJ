package edu.kh.test;

// 한 줄 주석 : 컴파일러(번역기)가 해석하지 않는 부분

/* 범위 
   주석 */

//class : 자바 코드가 작성되는 영역
public class JavaTest {

	// main 메서드 : 자바 애플리케이션(프로그램)을 실행하기 위해서 반드시 필요한 구문
	// 				(아래 한 줄부터 중괄호가 닫히는 부분까지)
	public static void main(String[] args) {
		
		System.out.println("안녕하세요");   //실행 ctrl+f11
		System.out.println("println()은 한 줄 출력입니다. 그러면 여러 줄은?");
		System.out.println( 100 + 200 + 300 + 400 );//""은 문자열만. 숫자는
		System.out.println( "100 + 200 + 300 + 400" );
		
		
		System.out.println("git 쉽지 않아요..");
		System.out.println("git 연습 많이 해야 됩니다!");
	}
	
}
