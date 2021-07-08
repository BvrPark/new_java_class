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
			System.out.println("q. 프로그램 종료");
			System.out.print("조건문을 선택하세요 : ");
			select = sc.nextLine();
			System.out.println("");

			if (select.equals("i") || select.equals("s") || select.equals("q")) {
				if (select.equals("q")) {
					mLoop = false;
				} else if (select.equals("i") || select.equals("s")) {
					sLoop = true;
					while (sLoop) {
						System.out.println("1. 성적입력");
						System.out.println("b. 뒤로가기");
						System.out.println("q. 프로그램 종료");
						System.out.print("명령을 선택하세요 : ");
						String select2 = sc.nextLine();
						System.out.println("");

						if (select2.equals("1")) {
							System.out.print("성적을 입력해 주세요. : ");
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
								System.out.println(grade + "등급은 " + (grade.equals("A") ? "[" + score + " ~ " + (score + 10) + "]"
										: (grade.equals("F") ? "[0 ~ " + (score + 9) + "]" : "[" + score + " ~ " + (score + 9) + "]"))
										+ "점 입니다.\n");
							}
							else {
								System.out.println("<입력오류!>\n");
							}

						} else if (select2.equals("b")) {
							sLoop = false;
						} else if (select2.equals("q")) {
							sLoop = false;
							mLoop = false;
						} else {
							System.out.println("<입력오류!>");
						}
					}
				}

			} else {
				System.out.println("<입력오류!>");
				System.out.println("조건문을 다시 선택.");
			}

		}
		System.out.println("<프로그램이 종료되었습니다.>");
	}

}
