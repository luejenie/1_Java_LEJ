package review.objectArray.run;

import review.objectArray.view.StudentManagementView;

public class StudentManagementRun {
	public static void main(String[] args) {
		
//		StudentManagementView view = new StudentManagementView();
//		view.displayMenu();
		
		
		new StudentManagementView().displayMenu();
		// 객체 생성 > 참조할 주소 반환 > 바로 메서드 호출
		// == 객체 1회성 사용
		
		
	}

}
