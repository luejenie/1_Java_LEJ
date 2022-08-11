package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPracticeLEJ {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input>=1) {
			for(int i=1 ; i<=input ; i++) {
				System.out.print(i + " ");
			}
			
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	} //1
	
	
	
	
	

}
