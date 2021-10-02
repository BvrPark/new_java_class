package chapter7_4;

// 추상클래스
// 추상적으로 클래스를 설계(안쓰는 클래스를 정리해주는것), 추상클래스는 생성 불가능
// abstract(추상)

public abstract class Computer {			//추상 클래스
	public abstract void display();			//추상 메서드
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public Computer() {
	System.out.println("Computer() 메서드");
	}
	
	
	
}
