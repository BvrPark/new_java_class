package chapter8;

/**
 * 
 * �߻�Ŭ������ ��ɵ��� �����ϱ� ���� ����� �� ��.
 * �߻�Ŭ������ �޸� ���谡 ���� interface���� ����� �ʿ��� �� ��������(�������� ����)-> ���� ������ ����
 * extends ��� implements�� ���
 * ��, ����� �ƴ� �����̴�.
 * ���� ��Ӱ� ���� ������ �����Ѵ�.
 * �⺻������ method�� ���´� (abstract) method �̴�. -> �׳� �����ص� abstract�� �����Ǿ� �����Ƿ� ������ abstract�� method�� ����ȴ�.
 * �Ϲ� method�� �����ϰ� ���� ��� default�� ����Ͽ� �����Ѵ�.
 * �⺻������ ������ ��� ����� ����ȴ�.
 * static ���� ������ �Ǿ� �ִ�.
 * static �޼ҵ嵵 ������ �����ϴ�.
 * �ڹ� 9�������ʹ� private �޼ҵ嵵 ����� �����ϴ�.
 * 
 *
 */

public interface InterfaceEx {		//interface �Ű�ü, ������
	public void test();
	public default void test2() {
		System.out.println("������ �޼ҵ�");
	}
}
