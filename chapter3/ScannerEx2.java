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
		d_Num = Double.parseDouble(s2);                     //�� ��ȯ��Ű����?
		trueFalse = Boolean.parseBoolean(s3);
		
		
		/*
		 * i_Num = scanner.nextInt(); 
		 * d_Num = scanner.nextDouble(); 
		 * trueFalse = scanner.nextBoolean();
		 */
		//�ٷ� ��ȯ���Ѽ�  �Է½�Ű�� �� �� ������

		System.out.println(i_Num);
		System.out.println(d_Num);
		System.out.println(trueFalse);
	}

}
