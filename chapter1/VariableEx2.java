package chapter1;

public class VariableEx2 {

	public static void main(String[] args) {
		char c1 = '��';
		char c2 = '��';
		char c3 = '��';
		char c4 = '��';
		char c5 = '��';

		System.out.println("" + c1 + c2 + c3 + c4 + c5 + ".");		// ���ڿ��� ���ڿ����̿� ���ڵ��� ���� �����ڵ�� ġȯ���ϰ� �״�� �����(�����ȣ������)
		
		char name1 = '��';
		char name2 = '��';
		char name3 = 'ȣ';
		int year = 1995;
		int month = 8;
		int day = 8;
		
		
		System.out.println(""+name1+name2+name3+"�� ������ "+String.format("%04d", year)+"."+
		String.format("%02d", month)+"."+String.format("%02d", day)+"�Դϴ�.");
		
		System.out.println(name1);

	}

}
