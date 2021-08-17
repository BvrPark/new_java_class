package chapter6_2;

public class Bus {
	private String busNumber;
	private int passengerCount;
	private int money;

	public Bus(String busNumber) {
		this.busNumber = busNumber;
		passengerCount = 0; // �°���
		money = 0; // ����
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void getOff() {
		System.out.println("<����ȣ�� �������� �����ϴ�.>");
		passengerCount--;
	}

	public void showInfo() {
		System.out.println("���� " + busNumber + "�� �°��� " + passengerCount + "���̰� ������ " + money + "�� �Դϴ�.");
	}
}
