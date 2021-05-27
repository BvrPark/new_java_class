package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		boolean b_Ort;
		int i_Num1 = 10;
		int i_Num2 = 20;
		int i_Num3 = 30;
		
//		b_Ort = i_Num1 < i_Num2;
		b_Ort = (i_Num1 == i_Num2) && (i_Num1 != i_Num3);   //AND
		b_Ort = (i_Num1 == i_Num2) || (i_Num1 != i_Num3);    //OR
		b_Ort = !(i_Num1 != i_Num3);                        //NOT
		System.out.println(b_Ort);
		System.out.println(i_Num1 <= 10);
		System.out.println(i_Num1 <= 20);
		System.out.println(i_Num1 >= 20);
		System.out.println(i_Num1 != 20);
		System.out.println(i_Num1 == 10);

	}

}
