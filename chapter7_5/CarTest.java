package chapter7_5;

public class CarTest {
	
	public void runTest(Car c) {
		c.run();
		System.out.println("������ ���� ����");
		c.drive();
		c.stop();
		System.out.println();
	}

	public static void main(String[] args) {
		CarTest ct = new CarTest();
		System.out.println("== �������� �ڵ��� ==");
		Car ai = new AiCar();							//CarŬ���� ���� ��밡��, AiCarŬ������ Car�� ��ġ�� �޼��常 ���డ��
		ct.runTest(ai);

		System.out.println("== ����� �����ϴ� �ڵ��� ==");
		Car mc = new ManualCar();
		ct.runTest(mc);
	}

}
