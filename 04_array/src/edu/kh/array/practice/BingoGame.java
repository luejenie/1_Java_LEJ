package edu.kh.array.practice;

import java.util.Scanner;

public class BingoGame {
	
	public void bingo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빙고판 크기 지정 : ");
		int size = sc.nextInt();
		
		char[][] arr = new char[size][size];  //빙고판
		
		for(int row=0 ; row<arr.length ; row++) {
			for(int col=0; col<arr[row].length ; col++) {
				
				int ran = (int)(Math.random() * (size*size)+1);   //중복값 제거 해야하나?
				arr[row][col] = (char)ran;   //정수 난수 무작위 배치	
				System.out.printf("%5d" , arr[row][col]);
			}
			System.out.println();
		}
		
		
		
		System.out.println("=========빙고게임 시작=========");
	

		while(true) {
		
			System.out.print("정수를 입력하시오 : ");
			int num = sc.nextInt();
			//int count = 0;
			
			
			for(int row=0 ; row<arr.length ; row++) {
				for(int col=0; col<arr[row].length ; col++) {
					
					
					if(arr[row][col] == num) {
						
						arr[row][col] = '★';   //일단 별 대신 0을 찍는다고 하고..
						//count++;
					
					} 
//					else {
//						System.out.println("다시 입력해주세요.");
//						break;
//					}
					
					System.out.printf("%5d" , arr[row][col]);
				}
				
				System.out.println();
				
			}

			//System.out.println("현재 " + count + "빙고");  //
				
		}
	
		
		
		
	}
	
	

}
