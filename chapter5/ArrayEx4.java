package chapter5;

public class ArrayEx4 {

	public static void main(String[] args) {
		//String[][] arrayEx = new String[?][];   -> �̰�� �ݵ�� ū�� �� ? ���� ������ ������Ѵ�.  ->2���� �̻��� ��� ���� �ް������ �� ������ ����ߵȴ�.
		
		
		String[][] arrayEx = {{"�ڹ� �Թ� �ø���1"},{"�ڹ� �Թ� �ø���2"},{"�ڹ� �Թ� �ø���3"},{"�ڹ� �Թ� �ø���4"},{"�ڹ� �Թ� �ø���5"},
		                      {"�ڹ� �߱� �ø���1"},{"�ڹ� �߱� �ø���2"},{"�ڹ� �߱� �ø���3"},{"�ڹ� �߱� �ø���4"},{"�ڹ� �߱� �ø���5"}
		                      };
		for(int i=0; i<arrayEx.length;i++) {
			for(int j=0;j<arrayEx[i].length;j++) {
				System.out.println(arrayEx[i][j]);
			}
		}

	}

}
