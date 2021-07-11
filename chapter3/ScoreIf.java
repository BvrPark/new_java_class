package chapter3;

import java.util.Scanner;

public class ScoreIf {

	// String name = 본인의 이름;
	// int scoreKR = 국어점수;
	// int scoreEng = 영엊ㅁ수;
	// int scoreMath = 수학점수;
	// <입력오류!> 프로그램 종료
	// int totalScore = 총점
	// int avgScore = 평균
	// char grade = 등급(90~100 = A/ 80~89 = B/ 70~79 = C/ 60~69 = D / 0~59 = F)
	/*
	 * 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();

		System.out.print("국어점수를 입력해 주세요 : ");
		int scoreKR = Integer.parseInt(sc.nextLine());

		System.out.print("영어점수를 입력해 주세요 : ");
		int scoreEng = Integer.parseInt(sc.nextLine());

		System.out.print("수학점수를 입력해 주세요 : ");
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
			System.out.println(name + "의 성적");
			System.out.println("국어: " + scoreKR);
			System.out.println("영어: " + scoreEng);
			System.out.println("수학: " + scoreMath);
			System.out.println("총점: " + totalScore);
			System.out.println("평균: " + String.format("%.2f", avgScore));
			System.out.println("등급: " + grade);
		} else {
			System.out.println("<입력오류!>");
			System.out.println("프로그램 종료");
		}

	}

}
