package chapter7_3;

public class TestTest {

	public static void main(String[] args) {
		//Test2 t2;
		//t2 = (Test2)t;
		//Test t2 = new Test2();				//��ĳ���� -> Test2()������ �θ��� Test()�� ���� �����ǹǷ� Test t2�� ����
		//Test3 t3 = (Test3)new Test();		//�ٿ�ĳ���� -> ����� ����ȯ -> Test3,Test�Ѵ� ������.
		
		Test t = new Test();
		Test2 t2 = (Test2)new Test();
		Test t3 = new Test3();
		
		t.test();
		t2.test();
		t2.show();
		t3.test();
		
		
		
		
		

}
}
