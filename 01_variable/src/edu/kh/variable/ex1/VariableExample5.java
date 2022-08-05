package edu.kh.variable.ex1;

public class VariableExample5 {
	
	public static void main(String[] args) {
		
		// 우하단 트레이 아이콘 인텔HD그래픽(파란색아이콘) -> 그래픽 옵션 -> 바로가기 키 -> 사용안함
		
		// ctrl + alt + 방향키 위 or 아래 : 해당 줄 복사				
		
		/* 출력 메서드
		 * 
		 * System.out.print("내용");
		 * -> ( )안의 내용 출력 (줄바꿈X)
		 * 
		 * System.out.println("내용");
		 * -> ( )안의 내용 출력 (줄바꿈O)
		 * 
		 * System.out.printf("내용 + 패턴" , 패턴에 들어갈 값 );
		 * */
		
		
		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.println("ddddd");
		
	
		
		String name = "홍길동";
		int age = 31;
		char gender = '남';
		double height = 185.3;
		boolean tf = true;
		
		// 홍길동님은 31세 남성, 키는 185.3입니다. (true)
		
		System.out.println(name + "님은 " + age + "세 " + gender + "성, 키는 " + height + "cm입니다. (" + tf + ")");
		 //전체가 한 줄
		
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm입니다. (%b)\n", name, age, gender, height, tf);
		// ,를 기준으로 오른쪽의 내용을 왼쪽에 지정해주겠다.
		// %s : string
		// %d : C언어에서 옴. int 대신 10진수 정수 뜻하는 d
		// %c : char
		// %f : C언어에 double이 없음. float의 f. // %.1f-> 소수점 아래로 1칸만 출력하겠다.
		// %b : boolean
		// 단점 : 줄바꿈이 안 됨.
		// \n : 줄바꿈(개행)을 나타내는 탈출(escape) 문자. new line. 	
		
		
		System.out.println("줄 바꼈나요?");
		
		System.out.println("내가 추가한 내용");
		
		
	}

}
