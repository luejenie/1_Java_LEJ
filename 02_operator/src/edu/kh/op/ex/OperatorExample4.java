package edu.kh.op.ex;

public class OperatorExample4 {
	public static void main(String[] args) {
		
		// 논리 연산자 : &&(AND), ||(OR)
		
		// &&(AND) 연산자 : 둘 다 true이면 true, 나머진 false
		// ~와, 그리고(~이고), ~이면서(~면서), ~부터~까지, ~사이
		
		int a = 101;
		 
		// a는 100이상 이면서 짝수인가?  '~이면서' && 연산자
		
		boolean result1 = a >= 100; // a는 100 이상? true
		boolean result2 = a % 2 == 0;  // a는 짝수인가?
		// => boolean result2 = a % 2 != 1;
		
		System.out.println("a는 100이상 이면서 짝수인가?" +  (result1 && result2));
		// 연산자 우선 순위에 따라서 &&보다 +가 우선이 됨. 따라서 괄호를 넣어줘야 한다.
		// 괄호를 넣지 않으면 앞에 문자열과 result1이 먼저 계산이 되면서 string이 되어버림.
		//  string + boolean은 다른 연산자로 계산이 되지 않는다.
		
		
		int b = 5;
		
		// b는 1부터 10 사이의 정수인가?  '~부터~사이' &&연산자
	//	boolean result3 = 1 <= b <= 10;  //동시에 불가. 하나씩 밖에 안됨.
		
		boolean result3 = 1 <= b;   // b는 1 이상인가?  true
		boolean result4 = b <= 10;  // b는 10 이하인가? true
		
		System.out.println("b는 1부터 10 사이의 정수인가?" + (result3 && result4));
		
		
		
		// ||(OR) 연산자 : 둘 다 false 이면 false, 나머진 true (AND의 반대)
		// 또는, ~거나, ~이거나
		
		int c = 10;
		
		// c는 홀수 이거나 10을 초과한 숫자인가?
		
		System.out.print("c는 홀수 이거나 10을 초과한 숫자인가? : ");
		System.out.println((c % 2 == 1) || (c > 10));  //false || false -> false
		
		
		int d = 20;
		
		// d는 1 부터 100 사이의 숫자 또는 음수인가?
		
		boolean result5 = 1 <= d && d <= 100 || (d<0) ; // true //우선순위는 &&가 ||보다 우선함.
		 				// true && true -> true
						// 				ture || false -> true
		
		System.out.println("d는 1 부터 100 사이의 숫자 또는 음수인가? " + result5); //true
		
		
		System.out.println("--------------------------");
		
		// 논리 부정 연산자 : !(NOT)
		// 논리 값을 반대로 바꾸는 연산자
		System.out.println("!result5 논리부정연산자 : " + !result5);  // !true -> false
		
		
		
		int e = 3;
		
		boolean result6 = e >= 1 && e < 5; // e는 1 이상이고, 5 미만인가?
		
		// 명제를 반대로 e는 1 미만 이거나(또는) 5 이상인가?   or !result6 라고 써도 됨.
		boolean result7 = e < 1 || e >= 5;
		
		
		
		// result6와 7은 서로 반대이다. result6의 반대가 result7과 같은가?
		System.out.println(	!result6 == result7	);
							// false  == false  -> true
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
