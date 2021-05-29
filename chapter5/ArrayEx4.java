package chapter5;

public class ArrayEx4 {

	public static void main(String[] args) {
		//String[][] arrayEx = new String[?][];   -> 이경우 반드시 큰값 즉 ? 값은 설정을 해줘야한다.  ->2차원 이상일 경우 제일 뒷값말고는 다 설정을 해줘야된다.
		
		
		String[][] arrayEx = {{"자바 입문 시리즈1"},{"자바 입문 시리즈2"},{"자바 입문 시리즈3"},{"자바 입문 시리즈4"},{"자바 입문 시리즈5"},
		                      {"자바 중급 시리즈1"},{"자바 중급 시리즈2"},{"자바 중급 시리즈3"},{"자바 중급 시리즈4"},{"자바 중급 시리즈5"}
		                      };
		for(int i=0; i<arrayEx.length;i++) {
			for(int j=0;j<arrayEx[i].length;j++) {
				System.out.println(arrayEx[i][j]);
			}
		}

	}

}
