package chapter5;

public class ArrayEx3 {

	public static void main(String[] args) {
		//String[][] ���߹迭 ���� ù��°  �ڰ� -?������ �����ϸ� ��. ex) 1-1,1-2
		String[][] arrayEx =  new String[2][5];                    //�迭 ����� ����
		arrayEx[0][0] = "�ڹ� �ø��� 1";
		arrayEx[0][1] = "�ڹ� �ø��� 2";
		arrayEx[0][2] = "�ڹ� �ø��� 3";
		arrayEx[0][3] = "�ڹ� �ø��� 4";
		arrayEx[0][4] = "�ڹ� �ø��� 5";
		arrayEx[1][0] = "�ڹ� �߱� �ø��� 1";
		arrayEx[1][1] = "�ڹ� �߱� �ø��� 2";
		arrayEx[1][2] = "�ڹ� �߱� �ø��� 3";
		arrayEx[1][3] = "�ڹ� �߱� �ø��� 4";
		arrayEx[1][4] = "�ڹ� �߱� �ø��� 5";
		
	
		
		
		
		for(int i=0;i<arrayEx.length;i++) {                  //��üũ�� �� ���ڸ�[]�� ��ȯ�Ѵ�.
			
			for(int j=0;j<arrayEx[i].length;j++) {           //arrayEx[i].length�ϸ� ���� []�� ��ȯ�Ѵ�.
				System.out.println(arrayEx[i][j]);
			}
				
		}
		
			
		
		
	}

}


