package chapter2;

public class OperationEx5_2 {

	public static void main(String[] args) {

		int schoolYear = 5;

		char schoolYearkr = (schoolYear == 1) ? '일' : (schoolYear == 2) ? '이' : (schoolYear == 3) ? '삼' : 'X';

		System.out.println("저의 학년은 " + schoolYearkr + "학년 입니다.");

		int type = 3;

		int lowSize = 100;
		int calSize = 200;

		boolean trueFalse = (type == 1 ? (lowSize > calSize) : (type == 2 ? (lowSize < calSize) : false));

		System.out.println("type : " + type +"\n"+ "결과 : " + trueFalse);
		
		int type2 = 1;
		
		
		System.out.println((type2 == 1 ? "축구" :(type2 == 2 ? "농구" : (type2 == 3 ? "골프" : false))));

	}

}
