package chapter1;

public class VariableEx1 {

	public static void main(String[] args) {
		int level;
		level = 10;
		level = 20;
		int year = 1995;
		int month = 8;
		int day = 8;
		
		System.out.println("level������ ���� "+level+"�Դϴ�.");
		
		System.out.println("���� ��������� " + year + "." +String.format("%02d", month)+"."+String.format("%02d", day)+"�Դϴ�.");
		System.out.print("������ ��¥�� ");
		System.out.print(year);
		System.out.print(".");
		System.out.print(String.format("%02d", month));
		System.out.print(".");
		System.out.print(String.format("%02d", day));
		System.out.println("�Դϴ�.");
		System.out.println("���� ��ȭ �Դϴ�....");

	}

}
