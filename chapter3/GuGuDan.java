package chapter3;

public class GuGuDan {

	public static void main(String[] args) {
		/* ù��° �ݺ� = 2~9�� ǥ��
		 * �ι�° �ݺ������� 1~9���� ���Ѵ�.
		 * 
		 * ���
		 * 2 x 1 =2 ~~~~~~~ 9 x 9 = 81
		 * �� ���� ���۽� ?���� ǥ������
		*/
		for(int i =2;i<10;i++) {
			System.out.println("<"+i+"��>");
			for(int j=1;j<10;j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
			System.out.println("");
		}
	}

}
