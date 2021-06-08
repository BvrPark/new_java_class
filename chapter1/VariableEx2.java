package chapter1;

public class VariableEx2 {

	public static void main(String[] args) {
		char c1 = '안';
		char c2 = '녕';
		char c3 = '하';
		char c4 = '세';
		char c5 = '요';

		System.out.println("" + c1 + c2 + c3 + c4 + c5 + ".");		// 문자열과 문자열사이에 문자들이 들어가면 유니코드로 치환안하고 그대로 출력함(연산기호때문에)
		
		char name1 = '박';
		char name2 = '지';
		char name3 = '호';
		int year = 1995;
		int month = 8;
		int day = 8;
		
		
		System.out.println(""+name1+name2+name3+"의 생일은 "+String.format("%04d", year)+"."+
		String.format("%02d", month)+"."+String.format("%02d", day)+"입니다.");
		
		System.out.println(name1);

	}

}
