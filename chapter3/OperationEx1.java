package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {
		
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("������: " +totalScore);    
		//160������  ���ڶ����ڶ� �������� ���ڷ� ����, int�� �������̹Ƿ� 2.0���� �ȵ�
		
		double avgScore = totalScore/2;              //double�� �Ǽ����̶� 2��� 2.0���� �������
		double d_Score  = totalScore%3;
		System.out.println("�����: " +avgScore);
		System.out.println("3���� ���� ��������: "+d_Score);
		

	}

}
