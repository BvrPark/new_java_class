package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 55;
		int motherAge = 57;
		
		fatherAge += 1;
		motherAge -= 2;
		//���� ���� ������
		char ch;
		int i;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		i = (fatherAge > motherAge) ? 10 : 20;
		//���� ������
		System.out.println(ch);
		System.out.println(i);

	}

}
