package chapter3;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �� �´�.");
		System.out.println("2. �� ���� �ʴ´�.");
		System.out.print("������ ������ ������ �ּ��� : ");
		String rain = sc.nextLine();

		switch (rain) {
		case "1":
			System.out.println("������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.");
			break;
		case "2":
			System.out.println("������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�.");
			break;
		default:
			System.out.println("���� ������ �߸��ϼ̽��ϴ�.");
		}

	}

}
