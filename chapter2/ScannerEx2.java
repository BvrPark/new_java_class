package chapter2;

import java.util.Scanner;

public class ScannerEx2 {
	
	public static String i_test() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	public static void o_test(int i) {
		System.out.print(i+" ��° �� �Է�: ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str[] = new String[6]; 
		
		for(int i=0;i<6;i++) {
			o_test(i+1);
			str[i] = i_test();
		}
		
		
		int plus = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
		int mul = Integer.parseInt(str[2])*Integer.parseInt(str[3]);
		int res = Integer.parseInt(str[4])%Integer.parseInt(str[5]);
		
		System.out.println("ù��° ���� �ι�° ���� ���� " +plus+"�Դϴ�.");
		System.out.println("����° ���� �׹�° ���� ���� "+mul+"�Դϴ�.");
		System.out.println("�ټ���° ������ ������° ���� ���� �������� "+res+"�Դϴ�.");

	}

}
