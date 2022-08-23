package edu.kh.inheritance.model.vo;

public class Student extends Person {   //Person에 상속
	
	// 자식 Student 클래스에
	// 부모 Person 클래스의 멤버(필드, 메서드)를 상속
	
	// extends : 확장
	// → 자식이 자기의 멤버 + 부모의 멤버를 가지게 되어
	//	 몸집이 커짐(확장됨)

	
//	private String name;
//	private int age;  //중복값 주석처리
	private int grade;  //학년
	private int classroom; //반
	
	
	public Student() {// 기본 생성자
		
		// Person(); // 부모 생성자는 상속X
		// super(); // super 생성자
		// 부모의 생성자를 참조하기 위해서 사용하는 생성자
		// 자식 생성자 내부 첫 번째 줄에만 작성 가능
		// → 자식 객체 생성 시, 내부에 부모 객체를 생성할 때 사용한다.
		
		// → 자식 생성자 첫 번째 줄에 super() 생성자 미작성 시 컴파일러가 자동 추가.
	
			// _ 객체를 생성하려면 무조건 생성자가 있어야 함.
			// 하지만 자식 객체에는 부모 생성자를 만들 수 없음. 자식이 부모는 태어나게 하는 건 말이 안되기 때문.
			// 이에 super 생성자를 사용함!  부모를 지칭하는 단어==super
			// == 부모의 것을 참조해서 쓰겠다.
		
		
			//__ ** 컴파일러가 자동으로 생성해 주는 것들
			// extends Object
			// super()
			// 기본생성자
			// this 참조변수
			// (형변환)
		
		
	}  
	
	// 매개변수 생성자
	public Student(String name, int age, int grade, int classRoom) {
		
		// 상속 받은 자식도 부모의 private 필드에 직접 접근 불가
		// this.name = name;
		// this.age = age;
		
		
		//_간접 접근 방법
		// 방법1. 부모의 getter/setter 이용
//		setName(name);
//		setAge(age);
		
		//_ super. 참조 변수를 굳이 사용해보고 싶다면 아래와 같음.
//		super.setName(name);
//		super.setAge(age);

		
		// 방법2. super(생성자) 
		super(name, age);
		
		
		this.grade = grade;
		this.classroom = classRoom;  //_초기화

		
			//_ Student가 사용할 수 있는 필드는 자신의 grade, classRoom 2개와
			//	부모 Person의 name, age 2개 합쳐서 총 4개. 따라서 name과 age도 사용하기 위해 초기화 해줘야함.
			//	그러나 this.name = name; 이런 식으로 초기화하면 에러남.
			//  이 필드는 부모 클래스에 private으로 선언되어 있기 때문.
			//  자식이라 할지라도 부모의 private 필드에는 접근 할 수 없다. 간접접근방식을 사용해야 한다.(super 생성자 or getter/setter 이용)
	}
	
	
	// getter / setter
	// alt + shift + s -> r
	// select all  > generate


//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassroom() {
		return classroom;
	}


	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	
	
	 // Person으로부터 상속 받은 introduce() 메서드 오버라이딩(재정의)
	
	@Override
	public void introduce() {
//		System.out.println("이름 : " + super.getName());  //_name은 부모의 private이라 그것만 쓸수없음. getName쓰면됨. super는 배워봤으니 써보자.
//		System.out.println("나이 : " + super.getAge());	// _ 이부분이 부모와 동일하여 중복된 코드 -> 이때 super를 쓰는 것
		
		super.introduce();
		//오버라이딩 '되지 않은' 부모의 introduce()메서드를 호출
		
		System.out.println("학년 : " + this.getGrade());  //_자식이 갖고 있는 고유의 기능을 추가
		System.out.println("반 : " + this.getClassroom());
		
	}
	
//	@Override
//	public void ex10() {  // 없어서 에러. override가 알려줌.
//	}	
	
	
	
	
	// *** 
	// 오버로딩 : 매개변수 타입, 개수, 순서 1개라도 달라야 한다.
	// 오버라이딩 :  부모 메서드와 똑같이 작성하는게 보통
	
	
	
	/* Annotation(@) : 컴파일러용 주석
	 * -> 컴파일러에게 해당 코드가 무엇을 의미하는지
	 *    아니면 해당 코드를 수행하기 전에 무엇을 해야하는지 등을 알려줌
	 *    
	 * @Override
	 *    1) 컴파일러에게 해당 메서드는 오버라이딩 되었음을 알려줌
	 *    2) 오버라이딩이 가능한지, 잘못 작성되지 않았는지 검사
	 * 	
	 * 
	 * */
	
	
	
}
