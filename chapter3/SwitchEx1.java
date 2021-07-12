package chapter3;

public class SwitchEx1 {

	public static void main(String[] args) {
		int score = 0;

		String grade = "A";

		switch (grade) {
			case "A":
				System.out.println("90 ~ 100점");
				break;
			case "B":
				System.out.println("80 ~ 89점");
				break;
			case "C":
				System.out.println("70 ~ 79점");
				break;
			case "D":
				System.out.println("60 ~ 69점");
				break;
			case "F":
				System.out.println("0 ~ 59점");
				break;
			default:
				System.out.println("해당 등급은 사용할 수 없는 등급입니다.");

		}

	}

}
