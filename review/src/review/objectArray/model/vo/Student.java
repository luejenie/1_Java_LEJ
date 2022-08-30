package review.objectArray.model.vo;

public class Student {
	
	private int stdGrade;
	private int stdClassroom;
	private int stdNumber;
	private String stdName;
	
	private int kor;
	private int eng;
	private int math;
	
	
	
	
	
	public Student(int grade, int classroom, int number, String name) {
		
		this.stdGrade = grade;
		this.stdClassroom = classroom;
		this.stdNumber = number;
		this.stdName = name;
	}
	
	
	public Student(int grade, int classroom, int number, String name, 
					int kor, int eng, int math) {
		
		this(grade, classroom, number, name);
		
//		this.stdGrade = grade;
//		this.stdClassroom = classroom;
//		this.stdNumber = number;
//		this.stdName = name;
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}


	public int getStdGrade() {
		return stdGrade;
	}


	public void setStdGrade(int stdGrade) {
		this.stdGrade = stdGrade;
	}


	public int getStdClassroom() {
		return stdClassroom;
	}


	public void setStdClassroom(int stdClassroom) {
		this.stdClassroom = stdClassroom;
	}


	public int getStdNumber() {
		return stdNumber;
	}


	public void setStdNumber(int stdNumber) {
		this.stdNumber = stdNumber;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}
	
	
	

}
