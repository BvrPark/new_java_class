package chapter3;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		String str2 = "����ȣ";
		
		str = sc.nextLine();
		
		if(str == "����ȣ") {
			System.out.println("���� �̸��� "+str+"�Դϴ�.");
		}
		else {
			System.out.println("�̸��� ��ġ���� �ʽ��ϴ�.");
		}
		

	}

}
