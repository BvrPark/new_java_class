package chapter6;

import java.util.Scanner;

public class MethodEx4 {
	
	public static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		return sc.nextLine();
	}
	
	public static void output(String[] name) {
		for(int i=0;i<name.length;i++) {
			System.out.println((i+1)+"번째 사용자의 이름은 : "+name[i]);
		}
	
	}

	public static void main(String[] args) {
		String name[] = new String[5];
		for(int i= 0; i<name.length;i++) {
			name[i] = input();
		}
		
		output(name);

	}

}
