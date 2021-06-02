package chapter6;

/*
 * 함수종류 중에 method -> class안에 들어있는 함수를 method라고 함(자바에서만) -> because 자바는 무조건 class단위로 하기 때문에 
 * 자바외에는 함수와 method는 다름
 * ex) main
 * public의 위치는 권한을 의미한다. 따라서 public은 모두가 접근 및 수정이 가능함(다른 class활용이 가능), privite는 개인만 가능(다른 class활용이 불가능)
   
*/
public class MethodEx1 {
	
	
	public static void printf() {                          //method를 생성
		System.out.print("매서드를 실행하였습니다.");
		
	}  
	
	public static  void println() {
		System.out.println("매서드를 실행하였습니다.");
	}

	
	
	public static void main(String[] args) {
		printf();                                         //printf라는 함수를 실행해라
		println();
		

	}

}
