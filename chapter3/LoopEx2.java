package chapter3;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = null;
		boolean mLoop = true;
		boolean sLoop = true;

		while (mLoop) {
			System.out.println("i. if");
			System.out.println("s. switch");
			System.out.println("q. ���α׷� ����");
			System.out.print("���ǹ��� �����ϼ��� : ");
			select = sc.nextLine();
			System.out.println("");

			if (select.equals("i") || select.equals("s") || select.equals("q")) {
				if (select.equals("q")) {
					mLoop = false;
				} else if (select.equals("i") || select.equals("s")) {
					sLoop = true;
					while (sLoop) {
						System.out.println("1. �����Է�");
						System.out.println("b. �ڷΰ���");
						System.out.println("q. ���α׷� ����");
						System.out.print("����� �����ϼ��� : ");
						String select2 = sc.nextLine();
						System.out.println("");

						if (select2.equals("1")) {
							System.out.print("������ �Է��� �ּ���. : ");
							String grade = sc.nextLine();
							int score = 0;
							if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
								if (select.equals("i")) {
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

								} else if (select.equals("s")) {
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
										+ "�� �Դϴ�.\n");
							}
							else {
								System.out.println("<�Է¿���!>\n");
							}

						} else if (select2.equals("b")) {
							sLoop = false;
						} else if (select2.equals("q")) {
							sLoop = false;
							mLoop = false;
						} else {
							System.out.println("<�Է¿���!>");
						}
					}
				}

			} else {
				System.out.println("<�Է¿���!>");
				System.out.println("���ǹ��� �ٽ� ����.");
			}

		}
		System.out.println("<���α׷��� ����Ǿ����ϴ�.>");
	}

}
