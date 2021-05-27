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
			System.out.println("1. 성적 입력\n2. 성력 조회\nq. 프로그램 종료\n--------------------------");
			System.out.print("메뉴를 선택하세요:");
			roopSelect = sc.next();

			if (roopSelect.equals("1") || roopSelect.equals("2") || roopSelect.equals("q")) {

				if (roopSelect.equals("1")) {
					clearScreen();
					System.out.println("i. if\ns.switch\n--------------------------------");
					System.out.print("조건문을 선택하세요(i/s):");
					selected = sc.next();

					if (selected.equals("i") || selected.equals("s")) { // 조건문 표준입력 검사
						clearScreen();
						System.out.println((selected.equals("i") ? "if" : "switch") + "문을 사용하여 결과를 출력합니다.\n<A, B, C, D, F 만 입력 가능>\n--------------------------------");
					
						System.out.print("학점을 입력하세요:");

						grade = sc.next();

						if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D")
								|| grade.equals("F")) { // 등급 표준입력 검사

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
							System.out.println("<입력오류!>\n학점은 A, B, C, D, F 중 하나만 입력 가능합니다.");
						}

					} else {
						clearScreen();
						System.out.println("<입력오류!>\ni 또는 s만 입력 가능합니다.");
					}

				}

				else if (roopSelect.equals("2")) {
					clearScreen();
					
					if (grade.equals("A")) {
						System.out.println(grade + "등급은 " + score + " ~ " + (score + 10) + "점입니다.");
					} else if (grade.equals("F")) {
						System.out.println(grade + "등급은 " + score + " ~ " + (score + 59) + "점입니다.");
					} else {
						System.out.println(grade + "등급은 " + score + " ~ " + (score + 9) + "점입니다.");
					}

				} else {
					break;
				}

			} else {
				clearScreen();
				System.out.println("<입력오류>");
			}

		}

	}

}