package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 55;
		int motherAge = 57;
		
		fatherAge += 1;
		motherAge -= 2;
		//복합 대입 연산자
		char ch;
		int i;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		i = (fatherAge > motherAge) ? 10 : 20;
		//삼항 연산자
		System.out.println(ch);
		System.out.println(i);

	}

}
