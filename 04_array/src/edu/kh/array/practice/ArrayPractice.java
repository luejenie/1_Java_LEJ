package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	//실습문제1~25
	
	public void practice1() {
		
		int[] arr = new int[9];  //0~8
		
		int sum=0;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] += (i+1);   //이 부분 맞는지 확인 (밑에서 계속 사용함_ 꼭 확인하기)
			System.out.print(arr[i] + " ");
			
			if((i==0) || (i % 2 == 0)) {   //짝수 번째 인덱스 = 1, 3, 5, 7 ...
				sum += arr[i];
			}
			
		}
		
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);

		
		
	}
	
	
	
	
	public void practice2() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = arr.length - i  ;
			System.out.print(arr[i] + " ");
			
			if(i%2==1) {
				sum += arr[i];
			}

		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	
	}
	
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0 ; i<arr.length; i++) {
			
			arr[i] += (i+1);
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[5];
		int i = 0;
		
		for(i = 0 ; i < arr.length ; i++) {
			
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = true;   //써야되는 건 알겠는데 어떻게 써야 할지 모르겠음...다시하기..
		
		for(i=0 ; i<arr.length ; i++) {
			if(arr[i] == input) {
				System.out.println("인덱스 : " + i);
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		
		int[] arr = new int[str.length()];  //문자열.length() : 문자열의 길이
		
		
		// 입력받은 문자열의 문자 하나하나를 char배열에 대입
		for(int i=0 ; i < arr.length ; i++) {
			
			arr[i] = str.charAt(i);  //문자열.charAt(인덱스번호): 문자열에서 해당 인덱스 번째 문자 하나를 얻어옴 (char 자료형)
		}
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print(str + "에" + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<str.length() ; i++) {
			if(ch == str.charAt(i)) {
				System.out.print(i + " ");	
				count++;				
			}			
		}
		
		System.out.println();  //줄바
		System.out.println(ch + "개수 : " + count);
	}
	
	
	public void practice6(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int sum = 0;
		int num;
		
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			num = sc.nextInt();
			arr[i] = num;		
			
			sum += num;
		}
		
		
//		System.out.println(Arrays.toString(arr));  //이렇게 하면 양끝에 [] 괄호랑 , 가 포함됨.
		
		
		
		for(int i=0; i<arr.length; i++) {   //위에 for문과 변수를 똑같이 해도 되는지 
											// 하나로 for문을 합치는 법은 없는지
			System.out.print(arr[i]+ " ");				
		}

		System.out.println("총 합 : " + sum);
	
	}

	
	
	public void practice7() {
		
		//주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
		// 단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String id = sc.next();
		
		//String[] arr = new String[id.length()];  //주민등록번호 길이만큼 배열 만들기
												//int로 하기엔 '-'이게 포함됨.
		
		char[] arr = new char[id.length()];   //char배열과 string배열 구분하기
		
		
		for(int i=0; i < arr.length ; i++) {
			
			if(i <= (arr.length-7)) {   //arr.length-7을 넣는게 맞는지./ 원래 그냥 숫자 7을 넣었었음.
				arr[i] = id.charAt(i);	
			} else {
				arr[i] = '*';
			}
				
		}
		
		for(int i=0; i<arr.length ; i++) {  //이렇게 하는 게 맞는지 확인!
			System.out.print(arr[i]);
		}

	}
	
	
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		
		if(input > 3 && input %2 == 1) {  //3이상인 홀수
			for(int i=0 ; i < (arr.length /2 + 1); i++) {
				arr[i] = (i+1);
				System.out.print(arr[i] + " ");
			}
			
//			for(int i=(int)(input/2) ; i < arr.length ; i++) {
//				arr[i] = arr[i]-1; 
//				System.out.print(arr[i] + " ");
//			}
//		}     //모르겠다..
		
//		else {
//			System.out.println("다시 입력하세요.");
//		}
		
	}
	
	}
	
	
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];  //10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		
		
			
		for(int i = 0 ; i<arr.length ; i++) {  //배열에 초기화
			int ran = (int)(Math.random() * 10 + 1);  //1~10 사이의 난수 //위치에 따라 다른 결과값
			arr[i] = ran;
		}
		
		System.out.print("발생한 난수 : ");
		
		for(int i=0 ; i<arr.length ; i++) {  //출력
			System.out.print(arr[i] + " ");
		}
	
	}

	
	
	public void practice10() {
		
		int[] arr = new int[10]; //10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		
		
		
		for(int i=0 ; i<arr.length ; i++) { 
			int ran = (int)(Math.random() *10 +1); //1~10사이의 난수를 발생
			arr[i] = ran;			
		}
		
		
		System.out.print("발생한 난수 : ");
		for(int i=0 ; i<arr.length ; i++) {  //출력
			System.out.print(arr[i] + " ");
		}
		
		//최대값 최소값
		int max = arr[0];
		int min = arr[0];
		
		
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}

		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		//왜 자꾸 0이 나오지..  math +1 주의!
		
	}
		

	
	public void practice11() {   //이전 예시 보고 따라함. 다시 해보기!
		
		int[] arr = new int[10];  //10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		
		
		for(int i=0 ; i<arr.length ; i++) {
			
			int ran = (int)(Math.random() * 10 +1);  // 1~10사이의 난수 발생
			arr[i] = ran;
			
			for(int x=0 ; x<i ; x++) {  //중복된 값이 없도록  // 이 부분 다시!!!!
				if(arr[x] == ran) {
					i--;
					break;
				}
			}
	
		}

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	
	
	public void practice12() {
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random() *45 +1);  //1~45 무작위 숫자
			
			arr[i] = ran;
			
			for(int x=0; x<i; x++) {   //arr[x] 는 arr[i]보다 전 배열
				
				if(arr[x] == ran) {
					i--;    // 값이 앞의 난수와 같으면 하나 전 배열로 이동. 
							// 상위for문에서 i++ 되면서 다시 앞으로 가고, 난수가 새롭게 재발생
					break; //  break 없으면 어떻게 되나?
				}
				
			}
				
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice13() {    //패스
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		char[] arr = new char[input.charAt(0)];

		int count=0;
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<arr.length ; i++) {
			arr[i] = input.charAt(i);
			count++;
			
//			for(int x=0 ; x<i ; x++) {   //문자 중복은 어찌해야하나..
//				if(arr[x] == input.charAt(i)) {
//					i--;
//					break;				
//				}
//			}
					
			System.out.print(arr[i] + ", ");
			
		}
		
		System.out.println("\n문자 개수 : " + count);
		
	}
	
	
	
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[input]; //사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당
		
		for(int i=0 ; i < arr.length ; i++) {
			System.out.print( (i+1) + "번째 문자열 : ");
			String str = sc.nextLine(); //next();로 하면 띄어쓰기를 받지 못함.	sc.nextLine();
			arr[i] = str;
			
		}
		

		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
