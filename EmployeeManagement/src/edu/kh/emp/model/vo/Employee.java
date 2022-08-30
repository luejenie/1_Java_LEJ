package edu.kh.emp.model.vo;

public class Employee {
	

	
	private int empId;  // 사원 번호(사번)
	private String empName; // 사원 이름
	private String empNo;  // 주민등록번호
	private String email; // 이메일
	private String phone; // 전화번호
	private String departmentTitle; //부서명
	private String jobName; // 직급명
	private int salary; // 급여
	
	
	public Employee() {}

	public Employee(int empId, String empName, String empNo, String email, String phone,
					String departmentTitle, String jobName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.email = email;
		this.phone = phone;
		this.departmentTitle = departmentTitle;
		this.jobName = jobName;
		this.salary = salary;
		
	}
	
	
	
	
	// getter/setter

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpNo() {
		return empNo;
	}


	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getDepartmentTitle() {
		return departmentTitle;
	}


	public void setDepartmentTitle(String departmentTitle) {
		this.departmentTitle = departmentTitle;
	}


	public String getJobName() {
		return jobName;
	}


	public void setJobName(String jobName) {
		this.jobName = jobName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	//사번, 사원이름, 주민등록번호, 이메일, 전화번호, 부서명, 직급명, 급여
	@Override
	public String toString() {
		return "----사원 정보 출력---- \n사원번호(사번) : " + empId
				+ "\n사원이름 : " + empName
				+ "\n주민등록번호 : " + empNo 
				+ "\n이메일 : " + email 
				+ "\n전화번호 : " + phone
				+ "\n부서명 : " + departmentTitle
				+ "\n직급명 : " + jobName
				+ "\n급여 : "	+ salary + "\n";
	}

	



	
	
	
	
	
	
	
	
	
	
	

}
