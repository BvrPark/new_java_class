package chapter3;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// Ű���忡 �Է��� �޴´�.
		// �Է¹��� ���� �������� ����Ѵ�.
		// int num = �Է¹��� ����
		// num�� ������ - ���
		// num X 1 = num*1 ����

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �������� �ܼ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println("");
		

		System.out.println("<������ " + num + "��>");
		if (num <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " X " + i + " = " + (num * i));
			}
		} else {
			for (int i = 1; i <= 12; i++) {
				System.out.println(num + " X " + i + " = " + (num * i));
			}
		}

	}

}
