package chapter4;

public class IfEx3 {

	public static void main(String[] args) {
		int age = 15;
		
		if(age>=14) {
			System.out.println("���б� ����");
		}
		else if(age>=8) {                                  //if���ǹ��� �ƴϸ� else if ���ǹ� ���� �װ͵� �ƴϸ� else����
			System.out.println("�ʵ��б� ����");
		}
		else if(age>=3) {                                  // else�� if�� �и��� �����ε�  else�� ��ȣ�� ���������ؼ� else if�� ���
			System.out.println("��ġ��  ����");
		}
		else {                                             // else���� ��� ������ ����
			System.out.println("�Ż���");
		}
		

	}

}
