package chapter4;

public class ArrayEx3 {

	public static void main(String[] args) {
		/* �迭����
		 * string�� �迭
		 * bookName
		 * �ڹ� �Թ�, C��� ����, ���α׷��� ����, ��ǰ �ڹ� ���α׷���, �ڹ��� ����
		 * �ʱ�ȭ
		 * for������ 5���� å�� ���
		*/
		String[] bookName = {"�ڹ� �Թ�","C��� ����","���α׷��� ����", "��ǰ �ڹ� ���α׷���","�ڹ��� ����"};
		System.out.println("�츮 ��������� å�� �� "+bookName.length+"���̸� å�� ����Ʈ�� �Ʒ��� �����ϴ�.");
		for(int i = 0;i<bookName.length;i++) {
			System.out.println((i+1)+". "+bookName[i]);
		}
	}

}
