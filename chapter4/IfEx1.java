package chapter4;

public class IfEx1 {

	public static void main(String[] args) {
		String s = "비가 온다";
		
		if (s.equals("비가 온다")) {System.out.println("우산을 챙긴다");}     
		//문자열끼리 비교할땐 ==대신 .equals를 쓴다.
		//if(조건문){조건에 맞으면 이 문장 실행}조건이 맞든 아니든 그다음 문장 실행
		
		System.out.println("가방을 챙겨 학원으로 간다.");

	}

}
