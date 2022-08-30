package edu.kh.emp.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.emp.model.service.EmployeeService;
import edu.kh.emp.model.vo.Employee;

public class EmployeeView {
	
	private Scanner sc = new Scanner(System.in);
	private EmployeeService service = new EmployeeService();
	private Employee e = new Employee();
	
	
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			
			System.out.println("------사원 관리 프로그램------");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조희");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치하는 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------");
			
			System.out.print("번호 입력 >> ");
			input = sc.nextInt();
			
						
			switch(input){
			
			case 1 : addEmp(); break;
			case 2 : lookupAll(); break;
			case 3 : lookupEmp(); break;
			case 4 : updateEmp(); break;
			case 5 : removeEmp();break;
			case 6 : break;
			case 7 : break;
			case 8 : break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
				
			}
			
		} while(input != 0);
	
		
	}
	
	//사번, 사원이름, 주민등록번호, 이메일, 전화번호, 부서명, 직급명, 급여
	
	
	//1. 새로운 사원 정보 추가
	public void addEmp() {
		
		System.out.println("[새로운 사원 정보 추가]");
		System.out.print("사원번호(사번) : ");
		int id = sc.nextInt();

		System.out.print("사원이름 : ");
		String name = sc.next();
		
		
		// 주민등록번호 사이에 - 넣기
		System.out.print("주민등록번호 : ");
		String no = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("부서명 : ");
		String dptTitle = sc.next();
		
		System.out.print("직급명 : ");
		String jobName = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		
		if(service.addEmp(id, name, no, email, phone, dptTitle, jobName, salary)) {
			System.out.println("[추가 완료]");
			
		} else {
			System.out.println("[error] 추가 실패");
		}
			
	}
	
	
	//2. 전체 사원 정보 조회
	public void lookupAll() {
		System.out.println("[전체 사원 정보 조회]");
		
		List<Employee> empList = service.lookupAll();
		
		if(empList.isEmpty()) {
			System.out.println("사원 정보가 없습니다.");
		} else {
			for(Employee e : empList) {
				System.out.println(e);
			}
			
		}
	
	}
	
	
	//3.사번이 일치하는 사원 정보 조희
	public void lookupEmp() {
		System.out.println("[사원 정보 조회(사번 일치)]");
		System.out.print("사번 검색 : ");
		int id = sc.nextInt();
		
		List<Employee> resultList = service.lookupEmp(id);
		
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Employee e : resultList) {
				System.out.println(e);
			}
		}
	}
	
	
	//다시
	//4. 사번이 일치하는 사원 정보 수정  //사원이름, 전화번호, 부서명, 직급명, 급여
	public void updateEmp() {
		System.out.println("[사원 정보 수정(사번 일치)]");
		System.out.print("사번 검색 : ");
		int id = sc.nextInt();
		
		System.out.print("사원 이름(수정) : ");
		String name = sc.next();   //입력버퍼개행 붙여야 하나?
		
		System.out.print("전화번호(수정) : ");
		String phone = sc.next();
		sc.nextLine();
		
		System.out.print("부서명(수정) : ");
		String dptTitle = sc.nextLine();
		
		System.out.print("직급명(수정) : ");
		String jobName = sc.nextLine();
		
		System.out.print("급여(수정) : ");
		int salary = sc.nextInt();
		
		
		
		if(service.updateEmp(id, name, phone, dptTitle, jobName, salary)) {
			
			System.out.println("정보가 수정되었습니다.");

		} else {
			System.out.println("실패");
		}


	}
	
	
	//5. 사번이 일치하는 사원 정보 삭제
	public void removeEmp() {
		System.out.println("[사원 정보 삭제(사번 일치)]");
		System.out.print("사번 검색 : ");
		int id = sc.nextInt();
		
		Employee e = service.removeExp(id);
		
		if(e == null) {
			System.out.println("실패(사번 불일치)");
		
		} else {
			System.out.println(e.getEmpName() + "사원의 정보가 삭제되었습니다.");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
