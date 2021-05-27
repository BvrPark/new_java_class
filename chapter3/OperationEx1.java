package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {
		
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("총점은: " +totalScore);    
		//160문자임  숫자랑문자랑 더해지면 문자로 변함, int는 정수형이므로 2.0들어가면 안됨
		
		double avgScore = totalScore/2;              //double은 실수형이라 2대신 2.0들어가도 상관없음
		double d_Score  = totalScore%3;
		System.out.println("평균은: " +avgScore);
		System.out.println("3으로 나눈 나머지는: "+d_Score);
		

	}

}
