package chapter2;

public class OperationEx5_3 {

	public static void main(String[] args) {
		char select = 'y';
		//char select = 'n';
		
		System.out.println((select == 'y'? select : (select == 'n'? select : "<입력오류!>")));

	}

}
