package chapter5;

public class ArrayEx3 {

	public static void main(String[] args) {
		//String[][] 이중배열 앞이 첫번째  뒤가 -?번쨰로 생각하면 됨. ex) 1-1,1-2
		String[][] arrayEx =  new String[2][5];                    //배열 선언과 생성
		arrayEx[0][0] = "자바 시리즈 1";
		arrayEx[0][1] = "자바 시리즈 2";
		arrayEx[0][2] = "자바 시리즈 3";
		arrayEx[0][3] = "자바 시리즈 4";
		arrayEx[0][4] = "자바 시리즈 5";
		arrayEx[1][0] = "자바 중급 시리즈 1";
		arrayEx[1][1] = "자바 중급 시리즈 2";
		arrayEx[1][2] = "자바 중급 시리즈 3";
		arrayEx[1][3] = "자바 중급 시리즈 4";
		arrayEx[1][4] = "자바 중급 시리즈 5";
		
	
		
		
		
		for(int i=0;i<arrayEx.length;i++) {                  //전체크기 즉 앞자리[]을 반환한다.
			
			for(int j=0;j<arrayEx[i].length;j++) {           //arrayEx[i].length하면 뒤쪽 []을 반환한다.
				System.out.println(arrayEx[i][j]);
			}
				
		}
		
			
		
		
	}

}


