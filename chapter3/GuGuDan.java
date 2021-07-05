package chapter3;

public class GuGuDan {

	public static void main(String[] args) {
		/* 첫번째 반복 = 2~9단 표시
		 * 두번째 반복에서는 1~9까지 곱한다.
		 * 
		 * 결과
		 * 2 x 1 =2 ~~~~~~~ 9 x 9 = 81
		 * 각 단의 시작시 ?단을 표시해줌
		*/
		for(int i =2;i<10;i++) {
			System.out.println("<"+i+"단>");
			for(int j=1;j<10;j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
			System.out.println("");
		}
	}

}
