package chapter4;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		// ���� ���� ����� �Է��ϼ���.
		/*
		 * 1�� å ���� : ��ǰ �ڹ� /*2�� å ���� : �ڹ��� ���� /*3�� å ���� : ���� �ڹ� ���α׷��� �п��� ��������� �Է��ϼ���.
		 * 1�� å ���� : ��ǰ �ڹ�2 /*2�� å ���� : �ڹ��� ����2 /*3�� å ���� : ���� �ڹ� ���α׷���2 2���� �迭 bookName
		 * 
		 * ���� ������� �п��� �������
		 */
		Scanner sc = new Scanner(System.in);
		String[][] bookName = new String[2][3];
		for (int i = 0; i < bookName.length; i++) {
			System.out.println((i == 0 ? "��" : "�п�") + "�� ���� ����� �Է��ϼ���.");
			for (int j = 0; j < bookName[0].length; j++) {
				System.out.print((j + 1) + "�� å ����: ");
				bookName[i][j] = sc.nextLine();
			}
			System.out.println("");
		}

		for (int i = 0; i < bookName.length; i++) {
			System.out.println("<" + (i == 0 ? "��" : "�б�") + "�� �������>");
			for (int j = 0; j < bookName[0].length; j++) {
				System.out.println((j + 1) + ". " + bookName[i][j]);
			}
			System.out.println("");
		}

	}

}
