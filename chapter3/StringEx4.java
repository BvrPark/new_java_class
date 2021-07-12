package chapter3;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		String str2 = "박지호";
		
		str = sc.nextLine();
		
		if(str == "박지호") {
			System.out.println("저의 이름은 "+str+"입니다.");
		}
		else {
			System.out.println("이름이 일치하지 않습니다.");
		}
		

	}

}
