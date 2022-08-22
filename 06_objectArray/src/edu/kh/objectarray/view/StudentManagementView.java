package edu.kh.objectarray.view;

import java.util.Scanner;

import edu.kh.objectarray.model.service.StudentManagementService;

//화면 제공용 클래스(입/출력)
public class StudentManagementView {
	
	//필드 == 멤버변수
	private Scanner sc = new Scanner(System.in);
	
	private StudentManagementService service = new StudentManagementService();
	
	
	// alt + shift + j : 툴팁용 주석  _마우스 대면 쓴 내용이 보임, 누가 언제 만들었고 이런 내용을 적음
	/**
	 *  메뉴 출력용 메서드
	 */
	public void displayMenu() {
		
		int input = 0; //메뉴 선택용 변수
		
		do {
			
			System.out.println("------[학생 관리 프로그램]------");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 정보 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 정보 조회(이름 검색)");
			System.out.println("5. 학생 정보 수정(이름 검색)");
			System.out.println("6. 종료");
			System.out.println("----------------------------");
			
			
			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();
			sc.nextLine();
			
			
			System.out.println();  //줄바꿈
			
			switch(input){
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		
		} while(input != 0);
		

	}
	
	
	/**
	 * 추가할 학생 정보 입력용 메서드
	 */
			
	public void addStudent() {
		System.out.println("[학생 추가]");
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classRoom = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("이름 : ");
		int name = sc.nextInt();
		
		//학생 추가 서비스 메서드 호출
		
	}
	

}
