package chapter6;

/*
 * 
 * 함수의 반환형 사용하기
 * return
 * 
*/



public class MethodEx3 {
	
	public static String make(String a, String b) {
		
		String ab = "딸기 라떼";
		
		return ab;
	}
	
	public static int add(int a, int b) {                              //여기서 두개를 설정해줬으면
		
		
		return a+b;
	}

	public static void main(String[] args) {
		int sum = 0;
		String c = make("딸기", "우유");
		System.out.println(c);
		
		sum = add(120,150);                                            //여기 add에서도 2개를 입력하여야 한다.반드시!(호출한다.)
		System.out.println(sum);

	}

}
