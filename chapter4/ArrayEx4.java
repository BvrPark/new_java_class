package chapter4;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] bookName = new String[3];
		for(int i = 0 ; i<bookName.length;i++) {
			bookName[i] = sc.nextLine();
		}
		for(int i = 0 ; i<bookName.length;i++) {
			System.out.println(bookName);
		}
	}

}
