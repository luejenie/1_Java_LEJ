package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample {

		/* 배열 ( 자료구조 )
		 *  - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
		 *  - 묶여진 변수들은 하나의 이름(배열명)으로 불려지고,
		 *    각 변수들은 index를 이용하여 구분함.
		 *   
		 * */

	public void ex1() {	
		
		// 배열 맛보기
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		int sum1 = num1 + num2 + num3 + num4;
		
		System.out.println("합계 : " + sum1);
		
		
		// 배열 이용   _위 내용을 배열올 이용해 만들어보자
		int[] arr = new int[4];   //  []: 배열 기호
		// int형 변수 4개를 묶음으로 다룰 수 있는 배열을 생성하고, 
		// 이를 arr이라고 부름.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int sum2 = 0;
		
		for(int i=0 ; i<4 ; i++) {  // i = 0, 1, 2, 3
			System.out.println(arr[i]);
			
			sum2 += arr[i];
		}
		
		System.out.println(sum2);
		
	
	} //1
	
	
	
	
	public void rpsGame() {   //가위바위보
	
		   // 난수 이용
		
		   // 몇판? : 3
		   
		   // 1번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 플레이어 승!
		   // 현재 기록 : 1승 0무 0패
		   
		   // 2번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  보
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 비겼습니다.
		   // 현재 기록 : 1승 1무 0패
		   
		   // 3번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [바위]를 선택했습니다.
		   // 졌습니다ㅠㅠ
		   // 현재 기록 : 1승 1무 1패
		
	
			int ran = (int)(Math.random() *3);
			
			// --> 결과가 0/1/2 가 나옴.
			// 0:가위 / 1:바위 / 2:보
			
			
			
			// 승: 가위>보 / 바위>가위 / 보자기 > 바위
			
			Scanner sc = new Scanner(System.in);
			System.out.print("몇 판? : ");
			int count = sc.nextInt();
		
			
			for(int i=1 ; i<=count ; i++) {
				
				System.out.print("가위/바위/보 중 하나를 입력해주세요 :");
				String input = sc.next();
				
			
								
//				if(input.equals("가위") &&) {
//
//				}
				
			}
			
			
			
			//몇 판인지 입력 받고, 그만큼 작동하는 for문 입력.
	
	
	
	} //rps
}

