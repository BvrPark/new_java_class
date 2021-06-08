package chapter1;

public class ConstantEx {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM = 0;
		int i_Num = MIN_NUM + 10;

		System.out.println("최대값 : " + (MAX_NUM + 100));
		System.out.println("최소값 : " + (MIN_NUM + 10));
		System.out.println(i_Num);

	}

}
