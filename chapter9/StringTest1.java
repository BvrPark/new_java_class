package chapter9;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");		//���ο� ������ ����� "abc"�� �ִ´�.
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";					//"abc"�� ����ִ� ��ü�� �ּҰ��� str3�� �ѱ��.
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
