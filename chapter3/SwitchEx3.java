package chapter3;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//Ű���忡 �Է��� �޽��ϴ�.
		/*int rank = nextLine();
		 * �ش簪�� �Է°���(1, 2, 3) -> �ƴϸ� <�Է¿���!>
		 * swwitch case�� ����.
		 * switcch ������ rank
		 * 1���� �ݸ޴�
		 * 2���� ���޴�
		 * 3���� ���޴�
		 * char medalColor ='��','��','��'�� ���� �� �� �ִ�.
		 * 
		 * ���
		 * rank���� medalColor�޴��Դϴ�.
		 * 
		*/
		
		Scanner sc = new Scanner(System.in);
		int rank = Integer.parseInt(sc.nextLine());
		char medalColor = ' ';
		switch(rank) {
			case 1:
				medalColor = '��';
				break;
			case 2:
				medalColor = '��';
				break;
			case 3:
				medalColor = '��';
				break;
			default:
				System.out.println("<�Է¿���!>");
				
		}
		System.out.println(rank+"���� "+medalColor+"�޴��Դϴ�.");
	}

}
