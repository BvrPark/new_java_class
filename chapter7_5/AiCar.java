package chapter7_5;

public class AiCar extends Car {
	@Override
	public void drive() {
		System.out.println("자율 주행을 시작합니다.");
		System.out.println("자동차가 자율 주행 시스템을 사용하여 코너링 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자율 주행을 종료합니다.");
	}

}
