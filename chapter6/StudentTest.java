package chapter6;

public class StudentTest {
	//Student jun -> jun�̶�� ��ü�� ����;
	// jun = new Student(); -> �����ڸ� ���� ������ �ϸ� �ν��Ͻ��� �ȴ�.
	
	void output(Student s) {
		System.out.println(s.studentName);
		System.out.println(s.studentID);
		System.out.println(s.grade);
		System.out.println(s.address);
	}
	public static void main(String[] args) {
		Student jun = new Student();	//������
		StudentTest st = new StudentTest();
		jun.studentID = 20210525;
		jun.studentName = "����ȣ";
		jun.grade = 80;
		jun.address = "�λ� ������";
		jun.test();
		Student jee = new Student();
		jee.studentID = 20210526;
		jee.studentName = "����ȣ";
		jee.grade = 90;
		jee.address = "�λ� ������";
		jee.test();
		
		st.output(jun);
		st.output(jee);

	}

}
