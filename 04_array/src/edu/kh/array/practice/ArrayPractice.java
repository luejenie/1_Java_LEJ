package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	
	//실습문제1~25
	
	public void ap1() {
		
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
	
	
	
	
	public void ap2() {
		
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
	
	
	
	public void ap3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0 ; i<arr.length; i++) {
			
			arr[i] += (i+1);
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void ap4() {
		
	}
	
	

}
