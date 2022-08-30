package review.objectArray.model.service;

import review.objectArray.model.vo.Student;

public class StudentManagementService {

	private Student[] stdArr = new Student[5];
	
	
	//기본 생성자
	public StudentManagementService() {
		stdArr[0] = new Student(3, 5, 7, "이은지", 100, 30, 70);
		stdArr[1] = new Student(2, 3, 11, "김미미", 50, 100, 80);
		stdArr[2] = new Student(1, 7, 3, "이영지", 100,100, 100);
		stdArr[3] = new Student(3, 5, 7, "안유진", 100, 30, 70);
		
	}
	
	
	
	/** 학생 추가 _총 5개의 배열 중 4개만 채워진 상태
	 * @param grade
	 * @param classroom
	 * @param number
	 * @param name
	 * @return 0(null 인덱스 없음) 또는 1(null 인덱스 있음. 학생 객체의 주소를 추가함)
	 */
	public int addStd(int grade, int classroom, int number, String name) {
		
		int idx = -1;
		
		for(int i=0; i<stdArr.length; i++) {
			if(stdArr[i] == null) { //null인 인덱스가 있다
				idx = i;
				break;				
			}
		}
		
		if(idx == -1) {  //null인 인덱스가 없다
			return 0;
		}
		
		
		stdArr[idx] = new Student(grade, classroom, number, name);
		return 1;
	}
		

	
	// 2. 학생 전체 정보 조회
	public Student[] getStdArr() {
		return stdArr;
	}
		
			
	
	
	/** 3. 학생 1명 정보 조회(인덱스) 서비스 메서드
	 * @param idx(검색할 인덱스 번호)
	 * @return idx 값에 따른 결과 문자열
	 */
	public String selectIndex(int idx) {
		
		if(idx < 0 || idx >= stdArr.length) {
			return "입력된 값이 인덱스 범위를 초과했습니다.";				
		
		} else {
			if(stdArr[idx] ==null) {
				return "해당 인덱스에 학생 정보가 존재하지 않습니다.";
			
			} else {
				
				String str = "이름 : " + stdArr[idx].getStdName();
						str += "\n학년 : " + stdArr[idx].getStdGrade();
						str += "\n반 : " + stdArr[idx].getStdClassroom();
						str += "\n번호 : " + stdArr[idx].getStdNumber();
						str += "\n국어 : " + stdArr[idx].getKor();
						str += "\n영어 : " + stdArr[idx].getEng();
						str += "\n수학 : " + stdArr[idx].getMath();
						
					return str;								
				
			}
		}
	
	}
	
	
	
	/** 학생 정보 조회(이름) 서비스 메서드
	 * @param name (입력받은 이름)
	 * @return 은 아래 두 경우 중 하나
	 * null : 검색 결과x
	 * result(null 아님) : 검색 결과 O
	 */
	public Student[] printStd(String name) {
		
		Student[] resultArr = new Student[stdArr.length];
		
		int resultIdx = 0;  //resultArr에서 값을 대입할 인덱스 번호를 나타내는 변수
		
		
		for(int i=0; i<stdArr.length; i++) {
			
			if(stdArr[i] == null) {
				break;
			}
			
			if(stdArr[i].getStdName().equals(name)) {
				resultArr[resultIdx] = stdArr[i];
				
				resultIdx++;
				
			}
			
		}
	 	
		
		if(resultIdx==0) {
			return null;	
		}
		
		else {
			return resultArr;
		}

		
	}
	
	

	/**
	 * @param idx
	 * @param kor
	 * @param eng
	 * @param math
	 * @return
	 * 		-1 : idx가 stdArr 배열의 범위를 초과한 경우
	 * 		 0 : stdArr[idx] 인덱스가 null인 경우
	 * 		 1 : 정상적으로 수정이 된 경우
	 */
	public int updateStd(int idx, int kor, int eng, int math) {
		if(idx<0 || idx>=stdArr.length) {
			return -1;
	
		} else {
			
			if(stdArr[idx] == null) {
				return 0;
				
			} else {
				stdArr[idx].setKor(kor);
				stdArr[idx].setEng(eng);
				stdArr[idx].setMath(math);
				
				return 1;
			}
		}
	}
}

		
	