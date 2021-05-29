package chapter5;

public class MethodEx2 {
	int sum(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	int times(int a, int b) {
		return a * b;
	}

	int div(int a, int b) {
		if (b == 0) {
			return 0;
		} else {
			return a / b;
		}

	}

	public static void main(String[] args) {
		MethodEx2 m = new MethodEx2();
		System.out.println("20, 30ÀÇ ÇÕ : "+ m.sum(20,30));
		System.out.println("20, 30ÀÇ Â÷ : "+ m.sub(20,30));
		System.out.println("20, 30ÀÇ °ö : "+ m.times(20,30));
		System.out.println("20, 30ÀÇ ¸ò : "+ m.div(20,30));
	}

}
