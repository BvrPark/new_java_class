package chapter4;
import java.util.Scanner;
public class IfEx4 {

	public static void main(String[] args) {
		/*
		 * [����Ȯ��] 
		 * ������ 0~100�Է� 
		 * ���� : score  �Է��� String
		 * ��� : grade
		 * 90~100 A 
		 * 80~89 B 
		 * 70~79 C 
		 * 60~69 D 
		 * 0~59 F 
		 * 
		 * [���]
		 * �Է��Ͻ� ������ ����� []�Դϴ�.
		 * */
		
		int score = 0;
		String grade = null;
		Scanner scanner = new  Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		
		score = Integer.parseInt(scanner.nextLine());
		if(score >100 ||  score<0) {                                  
			System.out.println("�Է��Ͻ� ������  �Է� �Ұ����մϴ�.");
			
		}
		
		else {
			if (score>=90) {
			grade = "A";
		    }
		    else if(score>=80){
			grade = "B";
		    }
		    else if(score>=70) {
			grade = "C";
		    }
		    else if(score>=60) {
			grade= "D";
		    }
		    else {
			grade = "F";
		    }
		System.out.println("�Է��Ͻ� ������ ����� "+grade+"�Դϴ�.");               //"+����+"�ؾ��� ������ �ν��Ѵ�.
	   }
		}

}
