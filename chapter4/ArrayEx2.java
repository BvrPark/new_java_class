package chapter4;

public class ArrayEx2 {
	//배열의 인덱스는 배열의 크기 -1
	
	public static void main(String[] args) {
		int[] i_num = {1,2,3,4,5,6,7,8,9,10};
		
		int[] i_num2 = new int[10];
		
		for(int i : i_num) {
			System.out.println(i);
		}
		for(int i =0 ; i<i_num.length;i++) {
			System.out.println(i_num[i]);
		}
		
		System.out.println(i_num[0]);
		System.out.println(i_num[9]);

	}

}
