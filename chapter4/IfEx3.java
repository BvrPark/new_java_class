package chapter4;

public class IfEx3 {

	public static void main(String[] args) {
		int age = 15;
		
		if(age>=14) {
			System.out.println("중학교 입학");
		}
		else if(age>=8) {                                  //if조건문이 아니면 else if 조건문 실행 그것도 아니면 else실행
			System.out.println("초등학교 입학");
		}
		else if(age>=3) {                                  // else랑 if가 분리된 형태인데  else는 괄호를 생략가능해서 else if로 사용
			System.out.println("유치원  입학");
		}
		else {                                             // else뒤의 모든 문장을 실행
			System.out.println("신생아");
		}
		

	}

}
