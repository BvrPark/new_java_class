package chapter6;
/*
 * Car 클래스 정의
*/

/*
 * 접근지정자(접근->변수.변수2->변수2로 접근한다.)
 * public : 모든 곳에서 접근 가능 -> 대부분  메서드들은 public으로 선언
 * protected : 동일 패키지와 상속받은 클래스 내부만 접근 가능
 * default(아무것도 없는것) : 동일 패키지 내에서만 접근 가능
 * private : 동일 클래스 내에서만 접근 가능 -> 대부분의 변수들은 private으로 선언
*/
public class Car {
	private String company; // 회사						
	private String model; // 자동차 모델
	private String color; // 색상
	private int maxSpeed; // 최대속도
	private int speed; // 현재속도

	public Car(String cp, String m, String c, int ms) {
		company = c;
		model = m;
		color = c;
		maxSpeed = ms;
		speed = 0;
	}
	
	public Car() {

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void speedUp() {
		if (speed < maxSpeed) {
			speed += 5;
			System.out.println("현재 속도 : 시속 " + speed + "km 입니다.");
		}else{
			System.out.println("더이상 속도를 올릴 수 없습니다.");
		}
	}

	void speedDown() {
		if (0 < speed) {
			speed -= 5;
			System.out.println("현재 속도 : 시속 " + speed + "km 입니다.");
		}else {
			System.out.println("차량이 정지 상태입니다.");
		}
	}


	void carInfo() {
		if (speed < maxSpeed && speed > 0) {
			System.out.println("현재 속도 : 시속 " + speed + "km 입니다.");
		}else {
			System.out.println("차량이 정지 상태입니다.");
		}
	}
}
