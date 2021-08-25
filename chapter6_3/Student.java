package chapter6_3;


//static(정적)을 나타내는 예약어 -> 무조건적으로 데이터영억에 들어감-> 딱하나만 선언가능(모든구역에서 접근가능하기 때문에)
/*
*/

public class Student {
	
		
	public static int createCount = 0;
	private int studentID = 20210000;; // 학번
	private String studentName; // 이름
	private int studentAge; // 나이
	private String studentGrade; // 성적

	
	public Student() {
		studentID += ++createCount;
	}
	
	
 	public String getStudentName() {
 		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	public int showID() {
		return studentID;
	}
	public static int showCount() {
		return createCount;
	}
}
