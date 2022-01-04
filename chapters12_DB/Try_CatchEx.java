package chapters12_DB;

import java.util.Scanner;

/**
 * 
 * ����ó�� -> �ҽ��ڵ����, ��Ÿ���� ����, �����ϵ��� ����(������ ���� => ���ڸ� 0���� ������, ���� �迭�� ���� �������� �ϴ°�)
 * ���ܰ� �߻������� ��ǻ�Ͱ� ������ �ϰ� �ٸ� �͵��� �켱 ������ �� �����ϴ� ��.
 * 
 * Exception => ��� ���ܵ��� �ֻ��� => �̰��ϳ��� ���� �� �ذ��.
 *
 */

public class Try_CatchEx {
	
	public void arrTest() throws ArrayIndexOutOfBoundsException{
		for (int i = 0; i <= 5; i++) {
			int[] arr = new int[5];
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Try_CatchEx tc = new Try_CatchEx();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		

		/*
		for (int i = 0; i <= 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		*/
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		try {
			tc.arrTest();
			int i_num = Integer.parseInt(sc.nextLine());
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {	//try���� ������ �ϴٰ� ���ܰ� �߻��� �� ��� catch������ �Ѿ 
			System.out.println("�ش� �迭�� " + 5 + "�� ũ���Դϴ�.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {				// try�� catch�� ������� ������ ����
			System.out.println("���α׷� ����");
		}
		

	}

}
