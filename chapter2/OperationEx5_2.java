package chapter2;

public class OperationEx5_2 {

	public static void main(String[] args) {

		int schoolYear = 5;

		char schoolYearkr = (schoolYear == 1) ? '��' : (schoolYear == 2) ? '��' : (schoolYear == 3) ? '��' : 'X';

		System.out.println("���� �г��� " + schoolYearkr + "�г� �Դϴ�.");

		int type = 3;

		int lowSize = 100;
		int calSize = 200;

		boolean trueFalse = (type == 1 ? (lowSize > calSize) : (type == 2 ? (lowSize < calSize) : false));

		System.out.println("type : " + type +"\n"+ "��� : " + trueFalse);
		
		int type2 = 1;
		
		
		System.out.println((type2 == 1 ? "�౸" :(type2 == 2 ? "��" : (type2 == 3 ? "����" : false))));

	}

}
