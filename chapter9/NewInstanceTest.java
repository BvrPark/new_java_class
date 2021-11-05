package chapter9;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("chapter9.Person");
		Person person2 = (Person)pClass.newInstance();
		person2.setName("¹ÚÁöÈ£");
		System.out.println(person2.getName());
	}

}
