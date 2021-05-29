package chapter5;

public class MethodEx1 {
	int sum(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		MethodEx1 m = new MethodEx1();
		int sumNum = 0;
		sumNum = m.sum(10,20);
		System.out.println("10 + 20 = " + sumNum);
		

	}

}
