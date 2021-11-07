package chapter9;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");		//새로운 공간을 만들어 "abc"를 넣는다.
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";					//"abc"가 들어있는 자체의 주소값을 str3에 넘긴다.
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
