package chapter5;

import java.util.Scanner;

public class MethodEx5 {

	int arrayIndex(int[] array, int inputArray) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == inputArray) {
				return i;
			}
		}
		return array.length;
	}
	
	int[] arrayReverse(int[] array) {
		int[] reverseArray = new int[10];
		int j = array.length-1;
		for(int i =0;i<array.length;i++,j--) {
			reverseArray[j] = array[i];
		}
		return reverseArray;
	}
	
	// 2개의 배열을 받을 수 있는 매개변수를 가진다.
	/* method의 이름은 arrayCmp
	 * 반환형은 boolean
	 * 2개의 배열을 받아서 서로 비교를 하는 메소드
	 * 결과값은 두개가 같으면 true
	 * 다르면 false
	 * 기준은 for문을 통해서 index가 0부터 해당배열의 끝까지 반복하면서
	 * 동일한 index의 값을 비교한다.
	*/
	boolean arrayCmp(int[] arr1, int[] arr2) {
		for(int i = 0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		MethodEx5 m = new MethodEx5();
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arr3 = new int[10];
		System.out.print("정수 1~10중 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(m.arrayIndex(arr, input) == arr.length) {
			System.out.println("해당 정수는 arr베열에 없는 값입니다.");
		}
		else {
			System.out.println("입력한 값의 배열 Index는 "+m.arrayIndex(arr, input)+"입니다.");
		}

		arr3 = m.arrayReverse(arr);
		for(int i : arr3) {				//arr3의 첫번째 값부터 마지막 값들을 다 i에 대입
			System.out.println(i);
		}
		System.out.println(m.arrayCmp(arr2,arr3));
	}

}
