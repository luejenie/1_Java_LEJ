package review.objectArray.view;

import java.util.Scanner;

import review.objectArray.model.service.StudentManagementService;
import review.objectArray.model.vo.Student;

public class StudentManagementView {
	
	private Scanner sc = new Scanner(System.in);
	
	private StudentManagementService service = new StudentManagementService();
	
	
	public void displayMenu() {
		
		int input = 0;
		
		
		do { 
			System.out.println("-------[학생 관리 프로그램]-------");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 정보 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 정보 조회(이름 검색)");
			System.out.println("5. 학생 정보 수정(이름 검색)");
			System.out.println("6. 종료");
			System.out.println("------------------------------");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			
			
			switch(input) {
			case 1 : addStd(); break;
			case 2 : printAll(); break;
			case 3 : selectIndex(); break;
			case 4 : printStd(); break;
			case 5 : updateStd(); break;
			case 6 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");			
			}
		
		
		} while(input != 6);
		
	}
	
	//1. 학생 추가
	public void addStd() {
		
		System.out.println("[학생 추가]");
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호 : ");
		int number =  sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		int result = service.addStd(grade, classroom, number, name);
		
		if(result==0) {
			System.out.println("더 이상 학생을 추가할 수 없습니다.");
			
		} else {
			System.out.println("학생 정보가 추가되었습니다.");
		}
		
		
	}

	
	//2. 학생 전체 정보 조회
	public void printAll() {
		
		System.out.println("[학생 전체 정보 조회]");
		
		Student[] stdArr = service.getStdArr();
		
		System.out.println("|  학년  |  반  |  번호  |   이름   |  국어   |   영어   |   수학   |");
		System.out.println("-----------------------------------------------------");
		
		for(int i=0; i<stdArr.length; i++) {
			
			if(stdArr[i] == null) {
				break;				
			}
			
			System.out.printf("| %2d   |  %2d  |  %2d   |  %3s  |   %3d  |   %3d  |   %3d  |\n",
							stdArr[i].getStdGrade(), stdArr[i].getStdClassroom(), stdArr[i].getStdNumber(),
							stdArr[i].getStdName(), stdArr[i].getKor(), stdArr[i].getEng(), stdArr[i].getMath());
		}
	}
	
	
	//3.학생 1명 정보 조회(인덱스)
	public void selectIndex() {
		System.out.println("[학생 1명 정보 조회(인덱스를 입력하세요)]");
		
		System.out.print("인덱스 번호 : ");
		int idx = sc.nextInt();
		
		System.out.println(service.selectIndex(idx));

	}

	
	//4.학생 정보 조회(이름 검색)
	public void printStd() {
		
		System.out.println("[학생 정보 조회(이름 검색)]");
		System.out.print("학생 이름 : ");
		String name = sc.next();
		
		Student[] resultArr = service.printStd(name);
		
		if(resultArr == null) {
			System.out.println("검색 결과가 없습니다.");
			
		} else {
			for(int i=0; i<resultArr.length; i++) {
				
				if(resultArr[i] == null) {
					break;
				}
				
				System.out.printf("%s (%d학년 %d반 %d번)\n",
								resultArr[i].getStdName(),
								resultArr[i].getStdGrade(),
								resultArr[i].getStdClassroom(),
								resultArr[i].getStdNumber());

			}
		}
		
	}
	
	
	
	//5.학생 정보 수정
	public void updateStd() {
		
		System.out.println("[학생 정보 수정(인덱스)]");
		
		System.out.print("인덱스 : ");
		int idx = sc.nextInt();
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		
		int result = service.updateStd(idx, kor, eng, math);
		
		if(result == -1) {
			System.out.println("입력한 값이 인덱스 범위를 초과했습니다.");
		
		} else if(result == 0) {
			System.out.println("해당 인덱스에 학생 정보가 존재하지 않습니다.");
			
		} else {
			System.out.println("수정되었습니다.");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
