package chapter7_5;

public class CarTest {
	
	public void runTest(Car c) {
		c.run();
		System.out.println("차량에 대한 정보");
		c.drive();
		c.stop();
		System.out.println();
	}

	public static void main(String[] args) {
		CarTest ct = new CarTest();
		System.out.println("== 자율주행 자동차 ==");
		Car ai = new AiCar();							//Car클래스 전부 사용가능, AiCar클래스는 Car와 겹치는 메서드만 실행가능
		ct.runTest(ai);

		System.out.println("== 사람이 운전하는 자동차 ==");
		Car mc = new ManualCar();
		ct.runTest(mc);
	}

}
