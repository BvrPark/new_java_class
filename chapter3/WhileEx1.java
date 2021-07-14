package chapter3;

public class WhileEx1 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum2 = 0;

		while (i < 10) {
			i++;
			sum += i;

		}
		for (int j = 1; j < 10; j++) {
			sum2 += j;
		}

		do {
			System.out.println("do while");
		} while (sum2 != 0);

		System.out.println(sum);
		System.out.println(sum2);

	}

}
