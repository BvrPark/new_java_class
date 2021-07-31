package chapter6;
/*
 * Car Ŭ���� ����
*/

/*
 * ����������(����->����.����2->����2�� �����Ѵ�.)
 * public : ��� ������ ���� ���� -> ��κ�  �޼������ public���� ����
 * protected : ���� ��Ű���� ��ӹ��� Ŭ���� ���θ� ���� ����
 * default(�ƹ��͵� ���°�) : ���� ��Ű�� �������� ���� ����
 * private : ���� Ŭ���� �������� ���� ���� -> ��κ��� �������� private���� ����
*/
public class Car {
	private String company; // ȸ��						
	private String model; // �ڵ��� ��
	private String color; // ����
	private int maxSpeed; // �ִ�ӵ�
	private int speed; // ����ӵ�

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
			System.out.println("���� �ӵ� : �ü� " + speed + "km �Դϴ�.");
		}else{
			System.out.println("���̻� �ӵ��� �ø� �� �����ϴ�.");
		}
	}

	void speedDown() {
		if (0 < speed) {
			speed -= 5;
			System.out.println("���� �ӵ� : �ü� " + speed + "km �Դϴ�.");
		}else {
			System.out.println("������ ���� �����Դϴ�.");
		}
	}


	void carInfo() {
		if (speed < maxSpeed && speed > 0) {
			System.out.println("���� �ӵ� : �ü� " + speed + "km �Դϴ�.");
		}else {
			System.out.println("������ ���� �����Դϴ�.");
		}
	}
}
