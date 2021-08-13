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
		
		PrivateEx pe = new PrivateEx(100,200,"김준일","안대양");
		PrivateEx pe2 = new PrivateEx(300,400,"손효현","박용수");

		
		t.output(pe);
		t.output(pe2);
		
		
	}

}
