package chapter2;

import java.util.Scanner;

//next() ���ڿ������� ������ �������� �ʴ´�.
//nextLine() ���ڿ� ���� ��� ������ ǥ���� �� �ִ�.

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
