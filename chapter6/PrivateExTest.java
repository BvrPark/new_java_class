package chapter6;

public class PrivateExTest {
	
	public void output(PrivateEx p) {
		System.out.println(p.getiNum());
		System.out.println(p.getiNum2());
		System.out.println(p.getStr());
		System.out.println(p.getStr2());
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		PrivateExTest t = new PrivateExTest();
		
		PrivateEx pe = new PrivateEx(100,200,"������","�ȴ��");
		PrivateEx pe2 = new PrivateEx(300,400,"��ȿ��","�ڿ��");

		
		t.output(pe);
		t.output(pe2);
		
		
	}

}
