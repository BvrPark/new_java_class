package chapter3;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		/*
		 * Ű���忡 �Է��� �޽��ϴ�. i. if s. switch ������ ���ǹ��� �����ϼ���(i/s) : String selected =
		 * nextLine(); ���࿡ i�� �Է¹����� if���� ����Ͽ� ������ ó�� ���࿡ s�� �Է¹����� switch���� ����Ͽ� ������ ó��
		 * i,s�� �ƴ� �ٸ� ���� ������ <�Է¿���!>�� ���
		 * 
		 * ������ �Է����ּ��� : String grade = nextLine(); grade != A,B,C,D,E,F �� ������ �����
		 * <�Է¿���!>�� ���
		 * 
		 * grade == A�̸� score == 90~100 grade == B�̸� score == 80~89 grade == C�̸� score
		 * == 70~79 grade == D�̸� score == 60~69 grade == F�̸� score == 0~59
		 * 
		 * ó�� ��� grade����� [score�� ����]�� �Դϴ�. ex) A����� 90~100�� �Դϴ�.
		 */

		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.println("i. if");
		System.out.println("s. switch");
		System.out.print("������ ���ǹ��� �����ϼ���(i/s) : ");
		String selected = sc.nextLine();

		if (selected.equals("i") || selected.equals("s")) {
			System.out.print("������ �Է����ּ��� : ");
			String grade = sc.nextLine();

			if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
				if (selected.equals("i")) {
					if (grade.equals("A")) {
						score = 90;
					} else if (grade.equals("B")) {
						score = 80;
					} else if (grade.equals("C")) {
						score = 70;
					} else if (grade.equals("D")) {
						score = 60;
					} else {
						score = 50;
					}

				} else if (selected.equals("s")) {
					switch (grade) {
					case "A":
						score = 90;
						break;
					case "B":
						score = 80;
						break;
					case "C":
						score = 70;
						break;
					case "D":
						score = 60;
						break;
					case "F":
						score = 50;
					}
				}
				System.out.println(grade + "����� " + (grade.equals("A") ? "[" + score + " ~ " + (score + 10) + "]"
						: (grade.equals("F") ? "[0 ~ " + (score + 9) + "]" : "[" + score + " ~ " + (score + 9) + "]"))
						+ "�� �Դϴ�.");
			} else {
				System.out.println("<�Է¿���!>");
			}
		} else {
			System.out.println("<�Է¿���!>");
		}

	}
}
