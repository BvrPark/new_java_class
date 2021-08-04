package chapter6;

/*클래스 자신을 가르키는 명령(연산자) this 예약어
 * 
*/
public class ClassThis {
	public int iNum;
	public int iNum2;
	public String str;
	public String str2;

	public ClassThis() {
		this(0, 0, "이름", "이름2");			//ClassThis( , , , )랑 같음
		System.out.println("디폴트 생성자");
		
	}

	public ClassThis(int iNum, int iNum2, String str, String str2) {

		this.iNum = iNum; // 동일한 변수가 존재할 시
		this.iNum2 = iNum2;
		this.str = str;
		this.str2 = str2;
		this.test();

	}
	
	public void test() {
		System.out.println("test");
	}

}
