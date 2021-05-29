package chapter5;

public class MethodEx3 {
	String sum(String a, String b) {
		return a+b;
	}
	double sum(double a , double b) {
		return a+b;
	}
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
		MethodEx3 m = new MethodEx3();
		System.out.println("20, 30ÀÇ ÇÕ : "+ m.sum(20,30));
		System.out.println("20, 30ÀÇ ÇÕ : "+ m.sum(20.5,30.5));
		System.out.println("20, 30ÀÇ Â÷ : "+ m.sub(20,30));
		System.out.println("20, 30ÀÇ °ö : "+ m.times(20,30));
		System.out.println("20, 30ÀÇ ¸ò : "+ m.div(20,30));

	}

}
