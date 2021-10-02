package chapter7_4;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();			//추상 클래스는 생성이 불가
		Computer c2 = new Notebook();
		//Computer c3 = new DeskTop();
		Computer c4 = new DeskTop2();
		
		c2.display();
		
	}

}
