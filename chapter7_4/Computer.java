package chapter7_4;

// �߻�Ŭ����
// �߻������� Ŭ������ ����(�Ⱦ��� Ŭ������ �������ִ°�), �߻�Ŭ������ ���� �Ұ���
// abstract(�߻�)

public abstract class Computer {			//�߻� Ŭ����
	public abstract void display();			//�߻� �޼���
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	public Computer() {
	System.out.println("Computer() �޼���");
	}
	
	
	
}
