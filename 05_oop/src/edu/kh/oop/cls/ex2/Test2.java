package edu.kh.oop.cls.ex2;

public class Test2 {
	//다른 패키지에 존재하는 클래스   (Test1과 다른 패키지)

	public void ex() {
		Test100 t100 = new Test100();
		
		System.out.println( t100.b ); //t100에서 접근가능한 값은 b가 있음
	}
	
}

class Test3{}

class Test4{}  // 내부클래스   __권장하지는 않음
