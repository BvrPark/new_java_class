package chapter7_5;

/**
 * 
 * 템플릿 메서드(추상클래스)
 * Template
 * 
 *
 */

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public void startCar() {
		System.out.println("차량의 시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("차량의 시동을 끕니다.");
		System.out.println();
	}
	
	final public void run() {					//template 메서드  -> 상속값을 마음대로 못바꾸게 하는것(override를 불가하게 만드는 것)
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
