package chapter3;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		// Ű������ �Է��� �޴´�.
		/* 1. �񰡿´�.
		 * 2. �� ���� �ʴ´�.
		 * 
		 * �� ������ ����ö�� ź��
		 * �� ���� ������ ������ ź��
		 * 
		 * ��� - ������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.
		 * ��� - ������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �� �´�.");
		System.out.println("2. �� ���� �ʴ´�.");
		System.out.print("�������ּ���(1/2) : ");
		String input = sc.nextLine();
		
		if(input.equals("1")) {
			System.out.println("������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.");
		}
		else if(input.equals("2")) {
			System.out.println("������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�.");
		}
		else {
			System.out.println("<�Է¿���!>");
		}
	}

}
