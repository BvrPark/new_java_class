package chapter4;

import java.util.Scanner;

public class GradeEx2 {

	public static void clearScreen() {

		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	
	public static void main(String[] args) {

		String selected = null;
		String roopSelect = null;
		String grade = null;
		
		int score = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. ���� �Է�\n2. ���� ��ȸ\nq. ���α׷� ����\n--------------------------");
			System.out.print("�޴��� �����ϼ���:");
			roopSelect = sc.next();

			if (roopSelect.equals("1") || roopSelect.equals("2") || roopSelect.equals("q")) {

				if (roopSelect.equals("1")) {
					clearScreen();
					System.out.println("i. if\ns.switch\n--------------------------------");
					System.out.print("���ǹ��� �����ϼ���(i/s):");
					selected = sc.next();

					if (selected.equals("i") || selected.equals("s")) { // ���ǹ� ǥ���Է� �˻�
						clearScreen();
						System.out.println((selected.equals("i") ? "if" : "switch") + "���� ����Ͽ� ����� ����մϴ�.\n<A, B, C, D, F �� �Է� ����>\n--------------------------------");
					
						System.out.print("������ �Է��ϼ���:");

						grade = sc.next();

						if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D")
								|| grade.equals("F")) { // ��� ǥ���Է� �˻�

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
									score = 0;
								}

							} else {
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
									score = 0;
								}

							}

						}

						else {
							clearScreen();
							System.out.println("<�Է¿���!>\n������ A, B, C, D, F �� �ϳ��� �Է� �����մϴ�.");
						}

					} else {
						clearScreen();
						System.out.println("<�Է¿���!>\ni �Ǵ� s�� �Է� �����մϴ�.");
					}

				}

				else if (roopSelect.equals("2")) {
					clearScreen();
					
					if (grade.equals("A")) {
						System.out.println(grade + "����� " + score + " ~ " + (score + 10) + "���Դϴ�.");
					} else if (grade.equals("F")) {
						System.out.println(grade + "����� " + score + " ~ " + (score + 59) + "���Դϴ�.");
					} else {
						System.out.println(grade + "����� " + score + " ~ " + (score + 9) + "���Դϴ�.");
					}

				} else {
					break;
				}

			} else {
				clearScreen();
				System.out.println("<�Է¿���>");
			}

		}

	}

}