package chapter8;

/**
 * 
 * 추상클래스의 기능들을 보완하기 위해 만들어 진 것.
 * 추상클래스와 달리 관계가 없이 interface안의 기능이 필요할 시 구현가능(여러개도 가능)-> 다중 구현이 가능
 * extends 대신 implements를 사용
 * 즉, 상속이 아닌 구현이다.
 * 다중 상속과 다중 구현을 지원한다.
 * 기본적으로 method의 형태는 (abstract) method 이다. -> 그냥 선언해도 abstract가 생략되어 있으므로 무조건 abstract형 method만 선언된다.
 * 일반 method를 정의하고 싶을 경우 default를 사용하여 정의한다.
 * 기본적으로 변수는 모두 상수로 선언된다.
 * static 예약어도 생략이 되어 있다.
 * static 메소드도 구현이 가능하다.
 * 자바 9버전부터는 private 메소드도 사용이 가능하다.
 * 
 *
 */

public interface InterfaceEx {		//interface 매개체, 전달자
	public void test();
	public default void test2() {
		System.out.println("디폴드 메소드");
	}
}
