package chapter6_2;

public class Subway {
	private String lineNumber; // 몇호선?
	private int passengerCount;
	private int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
		passengerCount = 0;
		money = 0;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void getOff() {
		System.out.println("<박지호가 지하철에서 내립니다.>");
		passengerCount--;
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고 수입은 " + money + "원 입니다.");
	}

}
