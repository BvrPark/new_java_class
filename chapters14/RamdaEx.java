package chapters14;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 
 * ���ٽ�(�Լ��� ���α׷���) -> : ���ο��� �����ڰ� ��(�������̽��� ������)
 * 
 * Consumer<T>
 * Function<T,R>
 * 
 * 
 *
 */
/*
 * class TempRandaTest extends RamdaTest2{ �� ������ �ʿ���� �ٷ� new�� �����ؼ� ����� ������.
 * 
 * }
 */

public class RamdaEx {

	public static void main(String[] args) {
		RamdaTest o2 = (a) -> { // �ƹ��� �Է°��� ���� �������̽��� �����ϴ� ��
			a += 10;
			System.out.println(a);
		};
		o2.test(100);

		RamdaTest2 o = new RamdaTest2() {
			@Override
			String test(String str) {
				System.out.println("test");
				return "�ȳ��ϼ���";
			}
		};
		o.test("�ݰ����ϴ�.");

		Consumer<Integer> c = (a) -> System.out.println(a);
		c.accept(10);
		Consumer<String> s = (str) -> System.out.println(str);
		s.accept("�ȳ��ϼ���");
		
		Function<String, String> f = (str) -> {
			return str;							//str = R
		};
		String str = f.apply("�ȳ��ϼ���. �ݰ����ϴ�.");
		
		System.out.println(str);
	}
}
