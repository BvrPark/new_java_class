package chapter6;

/*
 * 
 * �Լ��� ��ȯ�� ����ϱ�
 * return
 * 
*/



public class MethodEx3 {
	
	public static String make(String a, String b) {
		
		String ab = "���� ��";
		
		return ab;
	}
	
	public static int add(int a, int b) {                              //���⼭ �ΰ��� ������������
		
		
		return a+b;
	}

	public static void main(String[] args) {
		int sum = 0;
		String c = make("����", "����");
		System.out.println(c);
		
		sum = add(120,150);                                            //���� add������ 2���� �Է��Ͽ��� �Ѵ�.�ݵ��!(ȣ���Ѵ�.)
		System.out.println(sum);

	}

}
