package chapter7_5;

/**
 * 
 * ���ø� �޼���(�߻�Ŭ����)
 * Template
 * 
 *
 */

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public void startCar() {
		System.out.println("������ �õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ �õ��� ���ϴ�.");
		System.out.println();
	}
	
	final public void run() {					//template �޼���  -> ��Ӱ��� ������� ���ٲٰ� �ϴ°�(override�� �Ұ��ϰ� ����� ��)
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
