package chapter7_3;

public class TestTest {

	public static void main(String[] args) {
		//Test2 t2;
		//t2 = (Test2)t;
		//Test t2 = new Test2();				//업캐스팅 -> Test2()생성시 부모인 Test()도 같이 생성되므로 Test t2가 가능
		//Test3 t3 = (Test3)new Test();		//다운캐스팅 -> 명시적 형변환 -> Test3,Test둘다 생성됨.
		
		Test t = new Test();
		Test2 t2 = (Test2)new Test();
		Test t3 = new Test3();
		
		t.test();
		t2.test();
		t2.show();
		t3.test();
		
		
		
		
		

}
}
