package chapter3;

public class WhileEx2 {

	public static void main(String[] args) {
		int i = 2;

		while (i <= 9) {
			System.out.println("<" + i + "��>");
			int j = 1;

			while (j <= 9) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;
			}
			i++;
			System.out.println("");
		}

	}

}
