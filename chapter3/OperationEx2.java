package chapter3;

public class OperationEx2 {//����������

	public static void main(String[] args) {
		int gameScore =150;
		
		int lastScore = ++gameScore;
		System.out.println(lastScore);
		System.out.println(lastScore++);
		System.out.println(lastScore++);
		System.out.println(++lastScore);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		System.out.println(lastScore2--);
		System.out.println(lastScore2--);
		System.out.println(lastScore2);
		
		
		for(int i = 0; i<=5; i++) {
			System.out.println(i+"��°");
		}
int i = 0;
		while(i<=5) {
			i++;
			System.out.println(i+"��°");
		}
	}

}
