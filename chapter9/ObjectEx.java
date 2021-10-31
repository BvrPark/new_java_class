package chapter9;

/**
 * 
 * 기본 클래스
 * Object Class
 * 모든 클래스에 extends가 생략되어 있음 (단,extends를 사용하여 상속했을 경우는 사용이 안됨.)
 * toString 같은 경우 생략이 가능함 그래서 String형 변수에 생략해서 프린트한것
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
