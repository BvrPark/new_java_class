package chapter3;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		/*
		 * 키보드에 입력을 받습니다. i. if s. switch 실행할 조건문을 선택하세요(i/s) : String selected =
		 * nextLine(); 만약에 i를 입력받으면 if문을 사용하여 성적을 처리 만약에 s를 입력받으면 switch문을 사용하여 성적을 처리
		 * i,s가 아닌 다른 값이 들어오면 <입력오류!>를 출력
		 * 
		 * 성적을 입력해주세요 : String grade = nextLine(); grade != A,B,C,D,E,F 이 범위를 벗어나면
		 * <입력오류!>를 출력
		 * 
		 * grade == A이면 score == 90~100 grade == B이면 score == 80~89 grade == C이면 score
		 * == 70~79 grade == D이면 score == 60~69 grade == F이면 score == 0~59
		 * 
		 * 처리 결과 grade등급은 [score의 범위]점 입니다. ex) A등급은 90~100점 입니다.
		 */

		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.println("i. if");
		System.out.println("s. switch");
		System.out.print("실행할 조건문을 선택하세요(i/s) : ");
		String selected = sc.nextLine();

		if (selected.equals("i") || selected.equals("s")) {
			System.out.print("성적을 입력해주세요 : ");
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
				System.out.println(grade + "등급은 " + (grade.equals("A") ? "[" + score + " ~ " + (score + 10) + "]"
						: (grade.equals("F") ? "[0 ~ " + (score + 9) + "]" : "[" + score + " ~ " + (score + 9) + "]"))
						+ "점 입니다.");
			} else {
				System.out.println("<입력오류!>");
			}
		} else {
			System.out.println("<입력오류!>");
		}

	}
}
