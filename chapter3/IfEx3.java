package chapter3;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		// 키보드의 입력을 받는다.
		/* 1. 비가온다.
		 * 2. 비가 오지 않는다.
		 * 
		 * 비가 오면은 지하철을 탄다
		 * 비가 오지 않으면 버스를 탄다
		 * 
		 * 출력 - 오늘은 비가 오기 때문에 지하철을 타겠습니다.
		 * 출력 - 오늘은 비가 오지 않기 때문에 버스를 타겠습니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 비가 온다.");
		System.out.println("2. 비가 오지 않는다.");
		System.out.print("선택해주세요(1/2) : ");
		String input = sc.nextLine();
		
		if(input.equals("1")) {
			System.out.println("오늘은 비가 오기 때문에 지하철을 타겠습니다.");
		}
		else if(input.equals("2")) {
			System.out.println("오늘은 비가 오지 않기 때문에 버스를 타겠습니다.");
		}
		else {
			System.out.println("<입력오류!>");
		}
	}

}
