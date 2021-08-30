package chapter7;

/**
 * 상속(extends)
 * Class, 상속을 받을(자식) 클래스명, extends, 상속을 해줄(부모) 클래스명 형식으로 사용
 * 부모클래스를 지칭하는 예약어는 super.
 *  
**/
public class ExtendsEx {
	public static void main(String[] args) {
		VIPCustomer vip = new VIPCustomer(10010, "박지호" , 12345);
		
		System.out.println(vip.showCustomerInfo());
		
	}
	
	

}
