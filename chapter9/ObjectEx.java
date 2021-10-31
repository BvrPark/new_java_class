package chapter9;

/**
 * 
 * �⺻ Ŭ����
 * Object Class
 * ��� Ŭ������ extends�� �����Ǿ� ���� (��,extends�� ����Ͽ� ������� ���� ����� �ȵ�.)
 * toString ���� ��� ������ ������ �׷��� String�� ������ �����ؼ� ����Ʈ�Ѱ�
 * 
 */

public class ObjectEx {
	private String str;
	public ObjectEx(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return str;
	}
	
	public static void main(String[] args) {
		ObjectEx oe = new ObjectEx("test");
		System.out.println(oe.toString());
		System.out.println(oe
				);
	}
}
