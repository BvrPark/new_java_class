package chapter1;

public class VariableEx1 {

	public static void main(String[] args) {
		int level;
		level = 10;
		level = 20;
		int year = 1995;
		int month = 8;
		int day = 8;
		
		System.out.println("level변수의 값은 "+level+"입니다.");
		
		System.out.println("저의 생년월일은 " + year + "." +String.format("%02d", month)+"."+String.format("%02d", day)+"입니다.");
		System.out.print("오늘의 날짜는 ");
		System.out.print(year);
		System.out.print(".");
		System.out.print(String.format("%02d", month));
		System.out.print(".");
		System.out.print(String.format("%02d", day));
		System.out.println("입니다.");
		System.out.println("공포 영화 입니다....");

	}

}
