package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;



//배열 복습
public class ArrayExampleLEJ {
	
	public void ex3() {
	// 5명의 키(cm)를 입력 받고 평균 구하기
	
	 // [실행화면]
	 // 1번 키 입력 : 170.5
	 // 2번 키 입력 : 165.7
	 // 3번 키 입력 : 184.3
	 // 4번 키 입력 : 190.2
	 // 5번 키 입력 : 174.4
		      
	 // 입력 받은 키 : 170.5  165.7  184.3  190.2  174.4   //배열
	 // 평균 : 177.02cm
	
	Scanner sc = new Scanner(System.in);
	double[] arr = new double[5];
	
	for(int i=0; i < arr.length ; i++) {   //인덱스 0에서 시작
		
		System.out.print((i+1) + "번 키 입력 : ");
		arr[i] = sc.nextDouble();   // int input = sc.nextInt();
		
	}
	System.out.println();  //줄바꿈
	
	double sum = 0;
	
	System.out.print("입력 받은 키 : ");
	
	for(int i=0 ; i < arr.length ; i++) {
		System.out.print(arr[i] + " ");
		sum += arr[i];
		
	}
	
	System.out.println("\n평균 : " + (sum/arr.length));
	
	}	

	
	
	public void ex6() {
		//점심 메뉴 뽑기 프로그램
//		김밥  라면  햄버거  피자  샌드위치  순대국  설렁탕 …
		
		String[] arr = {"김밥", "라면", "햄버거", "피자", "샌드위치", "순대국", "설렁탕"};  //7개 (0~6)
		
		int ran = (int)(Math.random() *arr.length);
		
		System.out.print("오늘의 점심 메뉴 : " + arr[ran]);

	}
	
	
	public void ex7() {
		// 인원 수를 입력 받아 그 크기만큼의 정수 배열을 선언 및 할당
		// 인원 수 만큼 점수를 입력 받아
		// 합계, 평균, 최고점, 최저점을 출력
		
		// ex)
	      // 입력 받을 인원 수 : 4
	      // 1번 점수 입력 : 100
	      // 2번 점수 입력 : 80
	      // 3번 점수 입력 : 50
	      // 4번 점수 입력 : 60
	      
	      // 합계 : 290
	      // 평균 : 72.5
	      // 최고점 : 100
	      // 최저점 : 50
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		
		for(int i=0 ; i < arr.length; i++) {
			
			System.out.print((i+1) + "번 점수 입력 : ");
			arr[i] = sc.nextInt();		
			sum += arr[i];
		}
		
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0 ; i<arr.length ; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		
		System.out.println();
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/arr.length);		
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		
		
	}
	
	
	public void ex8() {
		// 배열 내 데이터 검색  _검색 기능 만들기
		
		// 입력 받은 정수가 배열에 존재하면 몇 번 인덱스에 존재하는지 출력
		// 단, 없다면 "존재하지 않습니다." 출력
		
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0 ; i<arr.length; i++) {
			if(input == arr[i]) {
				System.out.println(i + "번째 인덱스에 존재합니다.");
				flag = false;  // 깃발 내려
				break;
			}
		}
	
		if(flag) {
			System.out.println("존재하지 않습니다.");  //flag가 true일때
		}		
	}
	
	
	//시험에는 안 나올 것 같지만 복습!
	public void lotto() {
		// 배열을 이용한 중복 데이터 제거 + 정렬
		
		// 1. 1 ~ 45 사이의 중복되지 않은 난수 6개
		// 2. 생성된 난수를 오름차순 정렬
		
		
		System.out.println("***** 로또 번호 생성기 *****");
		
		int[] arr = new int[6];
		
		for(int i=0; i < arr.length ; i++) {
			
			int ran = (int)(Math.random() * (45+1));
			arr[i] = ran;
			
			
			for(int x=0 ; x < i ; x++) {
				
				if(arr[x] == ran) {
					i--; //중복값 제거
					break;
				}   
			}

		}
		
		Arrays.sort(arr);  //정렬
		
		System.out.println(Arrays.toString(arr));

	}
	
	
	// 2차원 배열 t
	
	// 2차원 배열 행의 길이  System.out.println("행 : " + arr.length);
	// 2차원 배열 열의 길이  System.out.println("열 : " + arr[row].length);
	
	
	public void ext2() {
		
		// 알파벳 검색하기
		
		// 2차원 배열 선언과 동시에 초기화   _위 1차원 배열을 2차원 배열로.
		char[][] arr = {
						{'a', 'b', 'c'}, 
						{'d', 'e', 'f'}, 
						{'g', 'h', 'i'} 
					   };
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 알파벳을 입력해주세요. : ");
		char input = sc.next().charAt(0);
		
		boolean flag = true;
		
		
		//2차원 배열 내 검색
		for(int row=0; row < arr.length ; row++) {
			for(int col=0 ; col<arr[row].length ; col++) {
				
				if(input == arr[row][col]) {
					System.out.printf("%c는 %d행 %d열에 존재합니다.", input, row, col);
					flag=false;
				}
			}

		}
		
		
		if(flag) {
			System.out.println("일치하는 알파벳이 없습니다.");
		}

	}

	
	
	public void ext3() {
		// 3행 3열짜리 int 2차원 배열에 난수(1~9)를 대입
		// 단, 각각의 마지막 행/열은 각 행/열의 합
		// 마지막 행, 마지막 열은 전체 난수 합
		
		int[][] arr = new int[3][3];
		
		for(int row=0 ; row < arr.length-1 ; row++) {
			for(int col=0 ; col < arr[row].length-1 ; col++) {
				
				int ran = (int)(Math.random() * 10);
				arr[row][col] = ran;
				
				arr[row][arr[row].length-1] += ran;
				arr[arr.length-1][col] += ran;
				arr[arr.length-1][arr[row].length-1] += ran;
				
			}	
		}
		
		for(int row=0 ; row < arr.length ; row++) {
			for(int col=0 ; col < arr[row].length ; col++) {
				System.out.printf("%3d", arr[row][col]);
			}	
			System.out.println();
		}
		

		
		
		
			
			
			
		}
		
		
	}
	
	

