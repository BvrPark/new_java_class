package chapter3;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//키보드에 입력을 받습니다.
		/*int rank = nextLine();
		 * 해당값만 입력가능(1, 2, 3) -> 아니면 <입력오류!>
		 * swwitch case를 쓴다.
		 * switcch 기준은 rank
		 * 1등은 금메달
		 * 2등은 은메달
		 * 3등은 동메달
		 * char medalColor ='금','은','동'의 값이 들어갈 수 있다.
		 * 
		 * 출력
		 * rank등은 medalColor메달입니다.
		 * 
		*/
		
		Scanner sc = new Scanner(System.in);
		int rank = Integer.parseInt(sc.nextLine());
		char medalColor = ' ';
		switch(rank) {
			case 1:
				medalColor = '금';
				break;
			case 2:
				medalColor = '은';
				break;
			case 3:
				medalColor = '동';
				break;
			default:
				System.out.println("<입력오류!>");
				
		}
		System.out.println(rank+"등은 "+medalColor+"메달입니다.");
	}

}
