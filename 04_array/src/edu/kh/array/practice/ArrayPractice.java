package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	//실습문제1~25
	
	public void practice1() {
		
		int[] arr = new int[9];  //0~8
		
		int sum=0;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] += (i+1);   //이 부분 맞는지 확인 (밑에서 계속 사용함_ 꼭 확인하기)_맞음
			System.out.print(arr[i] + " ");
			
			if(/*(i==0) || */(i % 2 == 0)) {   //짝수 번째 인덱스 = 1, 3, 5, 7 ...
				sum += arr[i];                 // 문제에 0인덱스는 짝수로 취급한다고 써있음
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
//		int input = sc.nextInt();		
//		int[] arr = new int[input];
		
		int[] arr = new int[sc.nextInt()]; // (풀이) 한줄로 합쳐서 사용!		
		
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
		
		
		
		for(int i=0; i<arr.length; i++) {   // for문은 계속 나눠서 해야하나?? 합칠 수는 없나?
			
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
	
	
	
	/* 실습문제 8
    3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
    중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
    단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
    다시 정수를 받도록 하세요.
    [실행 화면]
    정수 : 4
    다시 입력하세요.
    정수 : -6
    다시 입력하세요.
    정수 : 5
    1, 2, 3, 2, 1
    */
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			if(input < 3 || input % 2 == 0) { //3미만 or 짝수
				System.out.println("다시 입력하세요.");
						
			} else {
				int[] arr = new int[input];
				
				int num = 0;  //arr 배열에 대입될 값
				
				for(int i = 0; i< arr.length; i++) {
					if(i <= arr.length /2 ) { //중간 이전까지 -> 증가
						arr[i] = ++num;
					
					} else { // 중간 이후 -> 감소
						arr[i] = --num;
								
					}
					
					
					if(i == arr.length -1) {  //마지막 바퀴
						System.out.println(arr[i]);
						
					} else {
						System.out.println(arr[i] + ",");
					}
				
				}
			}
			
			break; //while 반복 멈춤
			
		}
		
		
		
		
		
		
//		System.out.print("정수 : ");
//		int input = sc.nextInt();
//		
//		int[] arr = new int[input];
//		
//		
//		//if(input == ) {  
//			for(int i=0 ; i < (arr.length /2 + 1); i++) {
//				arr[i] = (i+1);
//				System.out.print(arr[i] + " ");
//			}
//			
//			for(int i=(int)(input/2) ; i < arr.length ; i++) {
//				arr[i] = arr[i]-1; 
//				System.out.print(arr[i] + " ");
//			}
//		}     //
		
//		else {
//			System.out.println("다시 입력하세요.");
//		}
		
}
	
	
	
    /* 실습문제 9
    10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
    1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
    [실행 화면]
    발생한 난수 : 9 7 6 2 5 10 7 2 9 6
    */	
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];  //10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		
		
			
		for(int i = 0 ; i<arr.length ; i++) {  //배열에 초기화
			arr[i] = (int)(Math.random() * 10 + 1);  //1~10 사이의 난수 //위치에 따라 다른 결과값
		
		}
		
		System.out.print("발생한 난수 : ");
		
		for(int i=0 ; i<arr.length ; i++) {  //출력
			System.out.print(arr[i] + " ");
		}
	
	}

	
	
	
	
	public void practice10() {
		
		int[] arr = new int[10]; //10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		
		
		
		for(int i=0 ; i<arr.length ; i++) { 
			arr[i] = (int)(Math.random() *10 +1);
//			int ran = (int)(Math.random() *10 +1); //1~10사이의 난수를 발생
//			arr[i] = ran;		
			 
			System.out.print(arr[i] + " ");
			
		}
		
		
//		System.out.print("발생한 난수 : ");
//		for(int i=0 ; i<arr.length ; i++) {  //출력
//			System.out.print(arr[i] + " ");
//		}
//		

		
/*	내가 푼 풀이	
 * 		//최대값 최소값
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
*/		
		// 선생님 풀이
        // 3. 반복문을 통해 최대값 최소값 알아내기
        int max = 1;  // 최소값을 담아줄 변수
        int min = 10; // 최대값을 담아줄 변수
		
        for(int i=0; i<arr.length; i++) {

            if(arr[i] > max) { // 해당 인덱스의 값이 max 보다 큰 경우
                max = arr[i]; // 해당 값을 max 변수에 담아줌
            }

            if(arr[i] < min) { // 해당 인덱스의  값이 min 보다 작은 경우
                min = arr[i]; // 해당 값을 min 변수에 담아줌
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
	
	

	
	/* 실습문제 13
    문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
    문자의 개수와 함께 출력하세요. (중복 제거)
    [실행 화면]
    문자열 : application
    문자열에 있는 문자 : a, p, l, i, c, t, o, n
    문자 개수 : 8
    */
	

	public void practice13() {    //패스
		
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		
		// 2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		
		//3. char 배열에서 중복값 존재할 경우 출력x
		int count=0;  //문자개수 카운트
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0; i<arr.length ; i++) {
			
				boolean flag = true; //중복 체크용 flag
				
				for(int j=0; j<i; j++) {
					if(arr[i] == arr[j]) {
						flag = false; // 중복 발생했을 떄
						break;
					}
				}
				
				if(flag) {  //중복 발생하지 않았을 경우
					if(i==0) {
						System.out.println(arr[i]);
					} else {
						System.out.println("," + arr[i]);
					}
					
					count++;
				}
		}
		
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
	
				
	
	   /* 실습문제 14
    사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
    배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
    단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
    늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
    사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
     */
    public void practice14(){

        // 1. 첫 배열 크기 지정
        Scanner sc= new Scanner(System.in);

        System.out.print("배열의 크기를 입력하시오 : ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];

        // 2. 첫 배열에 저장할 문자열 입력 받기
        for(int i=0; i<arr.length ; i++) {
            System.out.print((i+1) + "번째 문자열 : ");
            arr[i] = sc.nextLine();
        }

        // 3. 반복이 시작되는 구간부터 무한루프로 작성하여 내부에 종료 조건을 만들어 break
        while(true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            char ch = sc.nextLine().charAt(0);

            // 4. 값을 더 입력할 경우
            if(ch == 'y' || ch == 'Y') {

                // 5. 더 입력받을 개수 입력 받기
                System.out.print("더 입력하고 싶은 개수 : ");
                int addSize = sc.nextInt();
                sc.nextLine();

                // 6. 새로 값을 입력 받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
                String[] newArr = new String[arr.length + addSize];

                // 7. 배열 복사 + 새로운 문자열 입력 받기
                for(int i=0; i<newArr.length ; i++) {
                    if(i<arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 기존 배열값 복사
                        newArr[i] = arr[i];
                    }else { // 인덱스의 크기가 기존 배열보다 클 경우 새로운 문자열 입력 받기
                        System.out.print((i+1) + "번째 문자열 : ");
                        newArr[i] = sc.nextLine();
                    }
                }

                // 8. 기존 배열공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
                arr = newArr;

            }else if(ch == 'n' || ch == 'N'){ // 9. 값을 더 입력하지 않은 경우
                break; // 반복문 종료
            }else { // 잘못 입력한 경우
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
            }
        }

        // 10. 배열값 모두 출력
        System.out.println(Arrays.toString(arr));
    }				
			
	
	
	
	
	
	
/* 내가 푼 풀이	_완성 못함
	public void practice14() { //얕은 복사, 깊은 복사 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[input]; //사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당
		
		for(int i=0 ; i < arr.length ; i++) {
			System.out.print( (i+1) + "번째 문자열 : ");
			String str = sc.nextLine(); //next();로 하면 띄어쓰기를 받지 못함.	sc.nextLine();
										// nextLine()을 제외한 모든 것 뒤에 sc.nextLine()을 한 번 더 붙여주기
			arr[i] = str;
		}	
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char inputyn = sc.next().charAt(0);
			sc.nextLine();
			
			if(inputyn == 'y' || inputyn == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int input2 = sc.nextInt();
				sc.nextLine();
				
				for(int i=input+1 ; i <= i+input2 ; i++ ) {
					System.out.print((input+1) + "번째 문자열 : ");
					String str2 = sc.nextLine();
					;   //이부분이 문제!
					
				}

			} else {
					
					System.out.print(Arrays.toString(arr));
				
			}

	}
	
*/	
	
	public void practice15() {
		
		String[][] arr = new String[3][3];
	
		
		for(int row=0; row<arr.length; row++) {
			
			
			for(int col=0; col<arr[row].length; col++) {
				
				arr[row][col] = "(row, col)";
				
				System.out.printf("(%d, %d)", row, col);
				
			}
			
			System.out.println();
		}

	}
	
	
	
	
    /* 실습문제 16
    4행 4열짜리 정수형 배열을 선언 및 할당하고
    1) 1 ~ 16까지 값을 차례대로 저장하세요.
    2) 저장된 값들을 차례대로 출력하세요.
    [실행 화면]
    1 2 3 4
    5 6 7 8
    9 10 11 12
    13 14 15 16
     */
    public void practice16(){
        int[][] arr = new int[4][4];

        int value = 1;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }	
	
	
/*
	public void practice16() {
		
		int[][] arr = new int[4][4];
		
		int i=0;
		
		for(int row=0; row<arr.length ; row++) {
			
			for(int col=0; col<arr[row].length; col++) {

					arr[row][col] = i++;
					
					System.out.printf("%2d ", i);
			}
			
			System.out.println();
		}

	}
*/	
	
	
	public void practice17() {
		
		int[][] arr = new int[4][4];
		
		int row=0;
		int i= (arr.length * arr[row].length) +1;    // 다시 확인하기!
		
		for(row=0; row<arr.length ; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				
					arr[row][col] = i--;
					
					System.out.printf("%2d ", i);
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
	

    /* 실습문제 18
    4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
    아래의 내용처럼 처리하세요.
    [실행 화면]
    9 3 7 19
    3 6 9 18
    6 10 10 26
    18 19 26 63
     */
    public void practice18(){
        int[][] arr = new int[4][4];

        int rowLastIndex = arr.length-1; // 행의 마지막 인덱스
        int colLastIndex = arr[0].length-1; // 열의 마지막 인덱스

        for(int i=0; i<rowLastIndex; i++) {
            for(int j=0; j<colLastIndex; j++) {
                // 1 ~ 10 사이 난수를 발생시켜 2차원 배열에 대입.
                arr[i][j] = (int)(Math.random() * 10 + 1);

                // 난수 대입과 동시에 해당 행, 열 끝에 값을 누적
                arr[i][3] += arr[i][j]; // 행의 합
                arr[3][j] += arr[i][j]; // 열의 합
            }
        }

        // 2차원 배열 출력 + 총합 계산
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);

                // 2차원 배열에 반복 접근 중
                // 마지막 행 또는 마지막 열에 접근한 경우
                // 총합 누적 진행
                if(i == rowLastIndex || j == colLastIndex) {
                    arr[rowLastIndex][colLastIndex] += arr[i][j];

                    // 마지막 arr[3][3]에서 또 총합 누적이 진행되어
                    // 총합을 넘는 값이  arr[3][3] 저장되겠지만,
                    // 마지막 누적 이전에 이미 총합을 출력하였기 때문에 문제 없음.
                }
            }
            System.out.println(); // 줄바꿈
        }
    }	
	
	
/*내가 푼 풀이
	public void practice18() {
		
		int[][] arr = new int[4][4];
		
		
		
		for(int row=0 ; row < arr.length-1; row++) {
			for(int col=0 ; col < arr[row].length -1 ; col ++) {
				
				int ran = (int)(Math.random() * 10 + 1);  // 1~10까지의 임의의 정수
				arr[row][col] = ran;	
				
				//직전 행, 열까지만 더하고,
				arr[row][arr[row].length-1] += ran;   // 각 행의 마지막 열
				arr[arr.length-1][col] += ran;        // 각 열의 마지막 행
				arr[arr.length-1][arr[row].length-1] += ran;  // 제일 마지막 행, 열
		
				
			}
		}
			
		//여기서 마지막 행, 열
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				
				System.out.printf("%3d ", arr[row][col]);
				
			}
			System.out.println();
		}
		
	}
*/	
	
	
	
	
	
	
	
	public void practice19() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		
			System.out.print("행 크기 : ");
			int rowInput = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int colInput = sc.nextInt();
			
			char[][] arr = new char[rowInput][colInput];
			
			
			// 입력받은 숫자가 1~10이 아닐때
			boolean input1 = rowInput < 1 || rowInput > 10 ;
			boolean input2 = colInput < 1 || colInput > 10 ;
			
			if(input1 || input2) {
				
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				

			}  else {
				
				for(int row=0 ; row < rowInput; row++) {
					for(int col=0; col < colInput; col++) {
						
						int ran = (int)(Math.random() *26 +(int)'A');
						arr[row][col] = (char)ran;

					}
				}
				
				for(int row=0 ; row < rowInput; row++) {
					for(int col=0; col < colInput; col++) {
						
						System.out.print(arr[row][col] + " ");
						
					}
					System.out.println();  //줄바꿈
				}
				break;
			}
		}
	}
	
	
    /* 실습문제 20
    사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
    문자형 가변 배열을 선언 및 할당하세요.
    그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
    [실행 화면]
    행의 크기 : 4
    0열의 크기 : 2
    1열의 크기 : 6
    2열의 크기 : 3
    3열의 크기 : 5
    a b
    c d e f g h
    i j k
    l m n o p
     */
    public void practice20(){
        Scanner sc = new Scanner(System.in);

        System.out.print("행의 크기 : ");
        int row = sc.nextInt();

        char[][] arr = new char[row][];

        for(int i=0; i<arr.length; i++) {
            System.out.print(i + "행의 크기 : ");
            int col = sc.nextInt();

            arr[i] = new char[col];
        }

        // 값 초기화
        char value = 'a';
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        // 출력
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }	
	
	
	
/* 패스	
	public void practice20() {   
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int rowInput = sc.nextInt();   //사용자에게 행의 크기를 입력 받고

		// arr[0~rowInput] = new int[colInput]
//		int[][] arr = new int[5][];  //열 안씀
//		
//		arr[0] = new int[3];
//		arr[1] = new int [4];
//		arr[2] = new int [5];
//		arr[3] = new int [2];
//		arr[4] = new int [1];
		
		
		for(int i=0 ; i <= rowInput; i++) {   //그 수만큼의 반복을 통해
			System.out.print( i + "열의 크기 : ");  
			int colInput = sc.nextInt();	 //열의 크기도 입력 받아
				
			int[][] arr = new int[i][colInput]; 	//문자형 가변배열을 선언 및 할당하세요.
			
			if(i == rowInput) {
				for(int row=0; row<rowInput; row++) {
					for(int col=0; col<colInput; col++){
						
						System.out.println(arr[row][colInput] + " ");
					}
					System.out.println();	
				}
				
			}
		}
			
		}
*/			

		

    
    
    
    
    
 
	public void practice21() {

		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미","박보배","송성실",
				"윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] part1 = new String[3][2];
		String[][] part2 = new String[3][2];
		
		int index = 0;  // Students 배열에서 0부터 1씩 증가하며 학생들을 선택하는 용도의 변수
		
		
//		String[][] part1 = {
//							{"강건강", "남나나"}, 
//							{"도대담", "류라라"}, 
//							{"문미미", "박보배"}
//			
//							};
//		
//		String[][] part2 = {
//							{"송성실", "윤예의"}, 
//							{"진재주", "차천축"}, 
//							{"피풍표", "홍하하"}	
//							};
//							
//		System.out.print(part1 + " ");  // cf. 주소값 출력

		
		System.out.println("== 1분단 ==");

		for(int row=0; row<part1.length; row++) {
			for(int col=0; col<part1[row].length; col++) {
				
				part1[row][col] = students[index];
				// students 배열 index번째 학생을 part1[row][col]에 대입
				
				index++;				
			
				System.out.print(part1[row][col] + " ");
		
			}
			System.out.println();
		}
		
		
		System.out.println("==2분단==");
		for(int row=0; row<part2.length; row++) {
			for(int col=0; col<part2[row].length; col++) {
				
				part2[row][col] = students[index];
				index++;						
				
				System.out.print(part2[row][col] + " ");
				
			}
			System.out.println();
		}
		
	}

	
	
	
	
	   /* 실습문제 22
    위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
    해당 학생이 어느 자리에 앉았는지 출력하세요.
    [실행 화면]
    == 1분단 ==
    강건강 남나나
    도대담 류라라
    문미미 박보배
    == 2분단 ==
    송성실 윤예의
    진재주 차천축
    피풍표 홍하하
    ============================
    검색할 학생 이름을 입력하세요 : 차천축
    검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다.
     */
    public void practice22(){
        Scanner sc = new Scanner(System.in);
        String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

        String[][] seat1 = new String[3][2];
        String[][] seat2 = new String[3][2];

        int index = 0;
        // 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
        // 학생을 이어서 셀 수 있도록 index 변수 생성

        // 1분단 학생 대입
        System.out.println("== 1분단 ==");
        for (int i = 0; i < seat1.length; i++) {

            for (int j = 0; j < seat1[i].length; j++) {

                seat1[i][j] = students[index++];
                System.out.print(seat1[i][j] + " ");
            }
            System.out.println();
        }

        // 2분단 학생 대입
        System.out.println("== 2분단 ==");
        for (int i = 0; i < seat2.length; i++) {

            for (int j = 0; j < seat2[i].length; j++) {

                seat2[i][j] = students[index++];
                System.out.print(seat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("============================");

        System.out.print("검색할 학생 이름을 입력하세요 : ");
        String searchName = sc.next();


        // 검색된 분단, 줄, 좌우 방향을 지정할 변수 선언
        int seat = 0;
        int row = 0;
        String direction = null;

        for(int i=0; i<seat1.length ; i++) {

            for(int j=0; j<seat1[i].length ; j++) {

                if(seat1[i][j].equals(searchName)) {
                    // 1분단에 일치하는 이름이 있을 경우
                    seat = 1;
                    row = i+1;
                    direction = j == 0 ? "왼쪽" : "오른쪽"; // 삼항 연산자

                }else if(seat2[i][j].equals(searchName)) {
                    // 2분단에 일치하는 이름이 있을 경우
                    seat = 2;
                    row = i+1;
                    direction = j == 0 ? "왼쪽" : "오른쪽"; // 삼항 연산자
                }
            }
        }


        if(seat != 0) { // 검색 결과가 있을 경우
            System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.\n",
                    searchName, seat, row, direction);
        }else {
            System.out.println("검색한 학생이 존재하지 않습니다.");
        }
    }	
	
	
	
	
	
	
/*	
	public void practice22() {
		
		Scanner sc = new Scanner(System.in);
		
			
		String[][] part1 = {
					{"강건강", "남나나"}, 
					{"도대담", "류라라"}, 
					{"문미미", "박보배"}
					};
	
		String[][] part2 = {
					{"송성실", "윤예의"}, 
					{"진재주", "차천축"}, 
					{"피풍표", "홍하하"}	
					};

		
		//출력
		System.out.println("== 1분단 ==");	
		for(int row=0; row<part1.length; row++) {
			for(int col=0; col<part1[row].length; col++) {
				
				System.out.print(part1[row][col] + " ");
				
			}
			System.out.println();
		}
	
	
		System.out.println("==2분단==");
		for(int row=0; row<part2.length; row++) {
			for(int col=0; col<part2[row].length; col++) {
				
				System.out.print(part2[row][col] + " ");
				
			}
			System.out.println();
		}
		
		
		// 검색
		
		System.out.println("========================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String stdName = sc.next();
		
		

		
		
		for(int row=0; row<part1.length; row++) {
			for(int col=0; col<part1[row].length; col++) {
	
				if( part1[row][col] == stdName) {
					
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 왼쪽에 있습니다.", stdName, row);
					
				}
			}
		}
		
		
*/		
		
//		for(int row=0; row<part2.length; row++) {
//			for(int col=0; col<part2[row].length; col++) {
//				
//				if( part2[row][col] == stdName) {
//					
//					if(col == 0) {
//						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 왼쪽에 있습니다.", stdName, row);
//						
//					} else {
//						
//						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 오른쪽에 있습니다.", stdName, row);
//					}
//				}
//				
//			
//			}
//			System.out.println();
//		}

//	}
			


    /* 실습문제 23
    String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
    그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 “X”로 변환해 2차원 배열을 출력하세요.
    [실행 화면]
    행 인덱스 입력 : 4
    열 인덱스 입력 : 2
      0 1 2 3 4
    0
    1
    2
    3
    4 X
     */
    public void practice23(){
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[6][6]; // String 6행 6열 2차원 배열 생성

        // 행과 열의 인덱스를 표시하는 부분에 인덱스 대입
        for (int i = 0; i < board.length-1; i++) {
            board[0][i+1] = i + "";
            board[i+1][0] = i + "";

            // '0' == 60번
        }


        int rowIndex = 0;
        int colIndex = 0;

        while(true) {
            System.out.print("행 인덱스 입력 : ");
            rowIndex = sc.nextInt();

            if(rowIndex < 0 || rowIndex > 4) {
                System.out.println("0~4사이 인덱스를 입력해주세요.");
                continue;
            }

            break;
        }


        while(true) {
            System.out.print("열 인덱스 입력 : ");
            colIndex = sc.nextInt();

            if(colIndex < 0 || colIndex > 4) {
                System.out.println("0~4사이 인덱스를 입력해주세요.");
                continue;
            }

            break;
        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (i == rowIndex && j == colIndex) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
                    board[i + 1][j + 1] = "X";
                    // 실제 2차원 배열의 인덱스에 1을 추가한 값이 화면에 표시된 인덱스
                }

                if(board[i][j] == null){
                    board[i][j] = " ";
                }

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



    
     
    
  /* 내가 푼 풀이  
    public void practice23() {
		
		Scanner sc = new Scanner(System.in);
		
		//char[][] arr = new char[6][6];
		
		char[][] arr = { 
						{' ', '0', '1', '2', '3', '4' },
						{'0', ' ', ' ', ' ', ' ', ' ' },
						{'1', ' ', ' ', ' ', ' ', ' ' },
						{'2', ' ', ' ', ' ', ' ', ' ' },
						{'3', ' ', ' ', ' ', ' ', ' ' },
						{'4', ' ', ' ', ' ', ' ', ' ' },	
						};
					
		
		
		System.out.print("행 인덱스 입력 : ");
		int rowInput = sc.nextInt();   //실제 인덱스는 row+1
		
		System.out.print("열 인덱스 입력 : ");
		int colInput = sc.nextInt();
		
		
		
		for(int row = 0 ; row < arr.length ; row++) {
			for(int col = 0 ; col<arr[row].length; col++) {	
	
					if(row==rowInput+1 && col==colInput+1) {
												
						arr[row][col] = 'X';
					}
	
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
		}
	}
		
*/	
	






/* 실습문제 24
실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
 */
	
public void practice24(){
	Scanner sc = new Scanner(System.in);
	String[][] board = new String[6][6]; // String 6행 6열 2차원 배열 생성
	
	// 행과 열의 인덱스를 표시하는 부분에 인덱스 대입
	for (int i = 0; i < board.length-1; i++) {
		board[0][i+1] = i + "";
		board[i+1][0] = i + "";
		
		// '0' == 60번
	}
	
	
	int rowIndex = 0;
	int colIndex = 0;
	
	while(true) {
		while (true) {
			System.out.print("행 인덱스 입력 : ");
			rowIndex = sc.nextInt();
			
			if(rowIndex == 99){
				break;
			}
			
			if (rowIndex < 0 || rowIndex > 4) {
				System.out.println("0~4사이 인덱스를 입력해주세요.");
				continue;
			}
			
			break;
		}
		
		if(rowIndex == 99){
			System.out.println("프로그램 종료");
			break;
		}
		
		while (true) {
			System.out.print("열 인덱스 입력 : ");
			colIndex = sc.nextInt();
			
			if (colIndex < 0 || colIndex > 4) {
				System.out.println("0~4사이 인덱스를 입력해주세요.");
				continue;
			}
			
			break;
		}
		
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				
				if (i == rowIndex && j == colIndex) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
					board[i + 1][j + 1] = "X";
					// 실제 2차원 배열의 인덱스에 1을 추가한 값이 화면에 표시된 인덱스
				}
				
				if (board[i][j] == null) {
					board[i][j] = " ";
				}
				
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
}	


/*
	public void practice24() {
		
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = { 
						{' ', '0', '1', '2', '3', '4' },
						{'0', ' ', ' ', ' ', ' ', ' ' },
						{'1', ' ', ' ', ' ', ' ', ' ' },
						{'2', ' ', ' ', ' ', ' ', ' ' },
						{'3', ' ', ' ', ' ', ' ', ' ' },
						{'4', ' ', ' ', ' ', ' ', ' ' },	
						};
					
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			int rowInput = sc.nextInt();   //실제 인덱스는 row+1
			
			if(rowInput == 99) {
				System.out.println("프로그램 종료");
				break;
			
			} else {
		
				System.out.print("열 인덱스 입력 : ");
				int colInput = sc.nextInt();
				
				for(int row = 0 ; row < arr.length ; row++) {
					for(int col = 0 ; col<arr[row].length; col++) {	
						
						if(row==rowInput+1 && col==colInput+1) {
							
							arr[row][col] = 'X';
						}
						
						System.out.print(arr[row][col] + " ");
					}
					System.out.println();
				}

			}
		}
		
	}

*/


