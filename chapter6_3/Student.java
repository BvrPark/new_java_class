package chapter6_3;


//static(����)�� ��Ÿ���� ����� -> ������������ �����Ϳ��￡ ��-> ���ϳ��� ���𰡴�(��籸������ ���ٰ����ϱ� ������)
/*
*/

public class Student {
	
		
	public static int createCount = 0;
	private int studentID = 20210000;; // �й�
	private String studentName; // �̸�
	private int studentAge; // ����
	private String studentGrade; // ����

	
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
