package chapters12_DB;

import java.util.Scanner;

/**
 * 
 * 예외처리 -> 소스코드오류, 런타임중 오류, 컴파일도중 오류(문법적 오류 => 숫자를 0으로 나눌때, 없는 배열의 값을 가져오게 하는것)
 * 예외가 발생했을때 컴퓨터가 인지를 하고 다른 것들을 우선 실행한 후 종료하는 것.
 * 
 * Exception => 모든 예외들의 최상위 => 이것하나만 쓰면 다 해결됨.
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
		System.out.print("숫자를 입력해 주세요 : ");
		try {
			tc.arrTest();
			int i_num = Integer.parseInt(sc.nextLine());
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {	//try에서 실행을 하다가 예외가 발생시 그 즉시 catch문으로 넘어감 
			System.out.println("해당 배열은 " + 5 + "의 크기입니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {				// try든 catch든 상관없이 무조건 실행
			System.out.println("프로그램 종료");
		}
		

	}

}
