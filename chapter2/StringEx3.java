package chapter2;

public class StringEx3 {
	//���ڿ��� ����ȯ

	public static void main(String[] args) {
		String s_Num = "10.21";
		String s_Num2 = "20.31";
		
		int i = 10;
		int j = 20;
		//int i_Num = s_Num;
		
		double d_Num, dNum2;
		
		d_Num = Double.parseDouble(s_Num);
		dNum2 = Double.parseDouble(s_Num2);
		
		System.out.println(Integer.toString(i) + Integer.toString(j));
		//System.out.println((int)Double.parseDouble(s_Num) + Integer.parseInt(s_Num2)); Integer.parseInt(),�� Double.parseDouble()���� ()�ȿ��� ������ �� �ڷ����� ��Ÿ���ߵ�
		
		System.out.println("d_Num: " + d_Num);
		System.out.println("d_Num2: " + dNum2);
		System.out.println("d_Num, d_Num2�� ���ڿ� ��: " + Double.toString(d_Num)+Double.toString(dNum2));
	}

}
