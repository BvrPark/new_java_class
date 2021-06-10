package chapter2;

public class OperationEx2 {
	//증,감 연산자

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore = ++gameScore;
		System.out.println("<gameScore>: " + gameScore);
		System.out.println("<lastScore>: " + lastScore);
		System.out.println("lastScore: " + ++lastScore);
		System.out.println("lastScore: " + lastScore++);
		System.out.println("lastScore: " + lastScore);
		
		System.out.println("gameScore: " + --gameScore);
		System.out.println("gameScore: " + gameScore--);
		System.out.println("gameScore: " + gameScore);
		
		

	}

}
