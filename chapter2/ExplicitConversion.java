package chapter2;

public class ExplicitConversion {                          //다운캐스팅

	public static void main(String[] args) {
		
		double d_Num = 1.2;
		float f_Num = 0.9f;
		
		int i_Num = (int)d_Num +(int)f_Num;
		int i_Num2 = (int)(d_Num + f_Num);
		
		System.out.println(i_Num);
		System.out.println(i_Num2);
		

	}

}
