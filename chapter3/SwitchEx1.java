package chapter3;

public class SwitchEx1 {

	public static void main(String[] args) {
		int score = 0;

		String grade = "A";

		switch (grade) {
			case "A":
				System.out.println("90 ~ 100��");
				break;
			case "B":
				System.out.println("80 ~ 89��");
				break;
			case "C":
				System.out.println("70 ~ 79��");
				break;
			case "D":
				System.out.println("60 ~ 69��");
				break;
			case "F":
				System.out.println("0 ~ 59��");
				break;
			default:
				System.out.println("�ش� ����� ����� �� ���� ����Դϴ�.");

		}

	}

}
