package chapter3;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// 키보드에 입력을 받는다.
		// 입력받은 수의 구구단을 출력한다.
		// int num = 입력받은 변수
		// num의 구구단 - 출력
		// num X 1 = num*1 로직

		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단의 단수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("");
		

		System.out.println("<구구단 " + num + "단>");
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
