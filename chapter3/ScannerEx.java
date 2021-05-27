package chapter3;
import java.util.Scanner;                       //Scanner은 자바 자체에 들어있지 않기때문에 따로 import로 Scan유틸을 참조를 해줘야됨

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   //입력하는 기능을 Scanner 클래스에 새로 생성해라(입력이므로 in을 쓴다)
		
		String name = null;                         //name에 아무것도 넣지마라,null은 안써도  되지만 무슨값이 들어가있을지 모른다.
		String name2 = null;
		
		System.out.print("이름을 입력해 주세요: ");      
		//println은 그줄을 출력한 뒤 자동으로 한줄밑으로 내려가고 print는 그줄에 멈춰있다.
		
		name = scanner.next();   
		name = scanner.next();
		name = scanner.next();                        //next는 문자열을입력하고 space를 입력하기 전까지 모든수가 다 저장되고 space를 누르고 난뒤 초기화가  된다.
		name = scanner.next();                        // 12345를 각각엔터를 치면 왜 nextLine만 건너뛰는지?
		name = scanner.next();
		name2 = scanner.nextLine();
		//nextLine은 띄워쓰기  붙여쓰기 다 되고 next는붙여쓰기만 가능하다 scanner기능안에 자체적으로 들어있는 것이다.
		
		System.out.println(name);
		System.out.println(name2);
		
		
		
		
		
		
	
	}

}
