package chapter6;

/*
 * �Լ����� �߿� method -> class�ȿ� ����ִ� �Լ��� method��� ��(�ڹٿ�����) -> because �ڹٴ� ������ class������ �ϱ� ������ 
 * �ڹٿܿ��� �Լ��� method�� �ٸ�
 * ex) main
 * public�� ��ġ�� ������ �ǹ��Ѵ�. ���� public�� ��ΰ� ���� �� ������ ������(�ٸ� classȰ���� ����), privite�� ���θ� ����(�ٸ� classȰ���� �Ұ���)
   
*/
public class MethodEx1 {
	
	
	public static void printf() {                          //method�� ����
		System.out.print("�ż��带 �����Ͽ����ϴ�.");
		
	}  
	
	public static  void println() {
		System.out.println("�ż��带 �����Ͽ����ϴ�.");
	}

	
	
	public static void main(String[] args) {
		printf();                                         //printf��� �Լ��� �����ض�
		println();
		

	}

}
