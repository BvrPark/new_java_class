package chapter3;
import java.util.Scanner;
public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int  i_Num;
		double d_Num;
		boolean trueFalse;
		
	
		String s = scanner.nextLine();
		String s2 = scanner.nextLine();
		String s3 = scanner.nextLine();
		
		i_Num = Integer.parseInt(s);
		d_Num = Double.parseDouble(s2);                     //왜 변환시키는지?
		trueFalse = Boolean.parseBoolean(s3);
		
		
		/*
		 * i_Num = scanner.nextInt(); 
		 * d_Num = scanner.nextDouble(); 
		 * trueFalse = scanner.nextBoolean();
		 */
		//바로 변환시켜서  입력시키는 것 잘 사용안함

		System.out.println(i_Num);
		System.out.println(d_Num);
		System.out.println(trueFalse);
	}

}
