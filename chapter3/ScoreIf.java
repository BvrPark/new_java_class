package chapter3;

import java.util.Scanner;

public class ScoreIf {

	// String name = ������ �̸�;
	// int scoreKR = ��������;
	// int scoreEng = ��������;
	// int scoreMath = ��������;
	// <�Է¿���!> ���α׷� ����
	// int totalScore = ����
	// int avgScore = ���
	// char grade = ���(90~100 = A/ 80~89 = B/ 70~79 = C/ 60~69 = D / 0~59 = F)
	/*
	 * 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();

		System.out.print("���������� �Է��� �ּ��� : ");
		int scoreKR = Integer.parseInt(sc.nextLine());

		System.out.print("���������� �Է��� �ּ��� : ");
		int scoreEng = Integer.parseInt(sc.nextLine());

		System.out.print("���������� �Է��� �ּ��� : ");
		int scoreMath = Integer.parseInt(sc.nextLine());
		System.out.println("");

		int totalScore = scoreKR + scoreEng + scoreMath;
		double avgScore = totalScore / 3.0;
		char grade = ' ';

		if (scoreKR >= 0 && scoreKR <= 100 && scoreEng >= 0 && scoreEng <= 100 && scoreMath >= 0 && scoreMath <= 100) {
			if (avgScore >= 90) {
				grade = 'A';
			} else if (avgScore >= 80) {
				grade = 'B';
			} else if (avgScore >= 70) {
				grade = 'C';
			} else if (avgScore >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println(name + "�� ����");
			System.out.println("����: " + scoreKR);
			System.out.println("����: " + scoreEng);
			System.out.println("����: " + scoreMath);
			System.out.println("����: " + totalScore);
			System.out.println("���: " + String.format("%.2f", avgScore));
			System.out.println("���: " + grade);
		} else {
			System.out.println("<�Է¿���!>");
			System.out.println("���α׷� ����");
		}

	}

}
