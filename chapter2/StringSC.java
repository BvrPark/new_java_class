package chapter2;

import java.util.Scanner;

//next() 문자열이지만 공백을 포함하지 않는다.
//nextLine() 문자열 내의 모든 공백을 표현할 수 있다.

public class StringSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		
		int a = Integer.parseInt(str1) + Integer.parseInt(str2);
		double b = a * Double.parseDouble(str3);
		
		System.out.println("str1 + str2 = "+a );
		System.out.println("(str1 + str2) * str3 = "+b);
		

	}

}
