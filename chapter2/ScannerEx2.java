package chapter2;

import java.util.Scanner;

public class ScannerEx2 {
	
	public static String i_test() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	public static void o_test(int i) {
		System.out.print(i+" 번째 수 입력: ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str[] = new String[6]; 
		
		for(int i=0;i<6;i++) {
			o_test(i+1);
			str[i] = i_test();
		}
		
		
		int plus = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
		int mul = Integer.parseInt(str[2])*Integer.parseInt(str[3]);
		int res = Integer.parseInt(str[4])%Integer.parseInt(str[5]);
		
		System.out.println("첫번째 수와 두번째 수의 합은 " +plus+"입니다.");
		System.out.println("세번째 수와 네번째 수의 곱은 "+mul+"입니다.");
		System.out.println("다섯번째 수에서 여섯번째 수를 나눈 나머지는 "+res+"입니다.");

	}

}
