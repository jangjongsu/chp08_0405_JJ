package test_1;

public class Student { //DTO > 데이터 이동 오브젝트
	private String name;  //이름
	private int age; //나이
	private int grade; //학녕
	
	
	
	public Student(String name, int age, int grade) { //매게변수가 있는 생성자
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public Student() { //기본생성자
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
