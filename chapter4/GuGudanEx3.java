package chapter4;

public class GuGudanEx3 {

	public static void main(String[] args) {
		
		int j = 1;
		
		int i = 2;
		while(i < 10) {
			System.out.println(i + "´Ü");
			
			j = 1;
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;
			}
					
			i++;
		}

	}

}
