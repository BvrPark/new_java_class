package chapter3;

public class GameSwitch {
	

	public static void main(String[] args) {
		int round = 1;
		boolean dead = false;

		switch (round) {
		case 1:
			System.out.println("���� ����");
			if(dead ==true) {
				System.out.println(round + "�� Ŭ�������� ���Ͽ����ϴ�.");
				System.out.println("ó���� �ٽ� �����մϴ�.");
				break;
			}
			else {
				System.out.println(round + "���带 Ŭ���� �Ͽ����ϴ�.\n");
				round++;
			}
		case 2:
			System.out.println(round + "round ����");
			if(dead ==true) {
				System.out.println(round + "�� Ŭ�������� ���Ͽ����ϴ�.");
				System.out.println("ó���� �ٽ� �����մϴ�.");
				break;
			}
			else {
				System.out.println(round + "���带 Ŭ���� �Ͽ����ϴ�.\n");
				round++;
			}
			
		case 3:
			System.out.println(round + "round ����");
			if(dead ==true) {
				System.out.println(round + "�� Ŭ�������� ���Ͽ����ϴ�.");
				System.out.println("ó���� �ٽ� �����մϴ�.");
				break;
			}
			else {
				System.out.println(round + "���带 Ŭ���� �Ͽ����ϴ�.\n");
				round++;
			}
			
		case 4:
			System.out.println(round + "round ����");
			if(dead ==true) {
				System.out.println(round + "�� Ŭ�������� ���Ͽ����ϴ�.");
				System.out.println("ó���� �ٽ� �����մϴ�.");
				break;
			}
			else {
				System.out.println(round + "���带 Ŭ���� �Ͽ����ϴ�.\n");
				round++;
			}
			
		case 5:
			System.out.println(round + "round ����");
			if(dead ==true) {
				System.out.println(round + "�� Ŭ�������� ���Ͽ����ϴ�.");
				System.out.println("ó���� �ٽ� �����մϴ�.");
				break;
			}
			else {
				System.out.println("���� Ŭ����");
				break;
			}
			
		default:
			System.out.println("ĳ������ ���尡 �߸� ����Ǿ����ϴ�.");
			round = 1;

		}

	}

}
