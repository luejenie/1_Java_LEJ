package edu.kh.emp.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.emp.model.vo.Employee;

public class EmployeeService {
	
	private List<Employee> empList = new ArrayList<Employee>();
	
	
	public EmployeeService() {  //일일이 정보 추가 하기 힘드니까 정해놓자!
		
		empList.add(new Employee(1001, "이은지", "220901-1234", "ej@com", "010-1234", "영업", "과장", 1200));
		empList.add(new Employee(2002, "미미", "220801-1234", "mimi@com", "010-4567", "영업", "차장", 1000));
		empList.add(new Employee(3003, "이영지", "220701-1234", "yj@com", "010-8900", "영업", "대리", 800));
		empList.add(new Employee(4004, "안유진", "220601-1234", "yjin@com", "010-9876", "영업", "사원", 600));
	}


	/**1. 새로운 사원 정보 추가
	 * 사번, 사원이름, 주민등록번호, 이메일, 전화번호, 부서명, 직급명, 급여
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTile
	 * @param jobName
	 * @param salary
	 * @return empList.add(emp)
	 */
	public boolean addEmp(int empId, String empName, String empNo, String email, String phone,
						String departmentTile, String jobName, int salary) {
		
		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTile, 
									jobName, salary);
		
		return empList.add(emp);
		
	}
	
	
	
	/** 2. 전체 사원 정보 조회
	 * @return empList
	 */
	public List<Employee> lookupAll() {
		
		return empList;

	}

	
	
	/** 3. 사번이 일치하는 사원 정보 조회
	 * @param empId
	 * @return resultList
	 */
	public List<Employee> lookupEmp(int empId) {
		// 사번이 일치하는 사원 정보 조희
		// 사번 입력 받아서(view) -> vo와 비교 -> 일치하면: empList에 있는 정보 출력
		//						  -> 일치하지 않으면 : 조회 실패하였습니다.
		
		List<Employee> resultList = new ArrayList<Employee>();
		
		for(Employee e : empList) {
			if(e.getEmpId()==empId) {				
				resultList.add(e);							
			}
		}
		
		return resultList;
		
	}
	
	
	//사원이름, 전화번호, 부서명, 직급명, 급여
	
	/** 4. 사번이 일치하는 사원 정보 수정
	 * @param empId
	 * @param empName
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return
	 * true : 사원번호(empId)가 일치하는 사원 정보 수정 성공
	 * false : 사원번호 일치하는 사원이 없을 경우
	 */
	public boolean updateEmp(int empId, String empName, String phone, String departmentTitle, 
									String jobName, int salary){
	
		if(empId >= empList.size() || empId < 0) {
			return false;
		
		} else {
			empList.get(empId).setEmpId(empId);
			empList.get(empId).setEmpName(empName);
			empList.get(empId).setPhone(phone);
			empList.get(empId).setDepartmentTitle(departmentTitle);
			empList.get(empId).setJobName(jobName);
			empList.get(empId).setSalary(salary);
			
			return true;
		}

		
	}
	
	
	
	/** 5.사번이 일치하는 사원 정보 삭제
	 * @param empId
	 * @return
	 */
	public Employee removeEmp(int empId) {
		
		if(empId <0 || empId >= empList.size()) {
			return null;
		
		} else {
			return empList.remove(empId);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
