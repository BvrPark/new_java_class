package chapters14;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 
 * 람다식(함수형 프로그래밍) -> : 에로우라는 연산자가 들어감(인터페이스만 가능함)
 * 
 * Consumer<T>
 * Function<T,R>
 * 
 * 
 *
 */
/*
 * class TempRandaTest extends RamdaTest2{ 이 과정이 필요없이 바로 new로 생성해서 사용이 가능함.
 * 
 * }
 */

public class RamdaEx {

	public static void main(String[] args) {
		RamdaTest o2 = (a) -> { // 아무런 입력값이 없는 인터페이스를 실행하는 것
			a += 10;
			System.out.println(a);
		};
		o2.test(100);

		RamdaTest2 o = new RamdaTest2() {
			@Override
			String test(String str) {
				System.out.println("test");
				return "안녕하세요";
			}
		};
		o.test("반갑습니다.");

		Consumer<Integer> c = (a) -> System.out.println(a);
		c.accept(10);
		Consumer<String> s = (str) -> System.out.println(str);
		s.accept("안녕하세요");
		
		Function<String, String> f = (str) -> {
			return str;							//str = R
		};
		String str = f.apply("안녕하세요. 반갑습니다.");
		
		System.out.println(str);
	}
}
