package chapter9;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass();		//getClass() -> 해당 person 클래스의 정보들을 클래스 형태로 반환시키고 Class라고 하는 클래스 안에 정보를 넣어줄 수 있게끔 해주는 것
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter9.Person");
		System.out.println(pClass3.getName());
	}

}
