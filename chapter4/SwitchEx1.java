package chapter4;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		int score = 0;
		String grade = null;
		Scanner scanner = new  Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		
		score = Integer.parseInt(scanner.nextLine());
		if(score >100 ||  score<0) {                                  
			System.out.println("�Է��Ͻ� ������  �Է� �Ұ����մϴ�.");
			
		}
		
		else {
			switch(score/10) {                                              //switch(����)                      
			case 10 :                                                       // ����,����,���ڿ� �ٵ�(C�� ���ڿ����ȵ�)
			case 9 :                                                        //�ش��ϴ� case������ �ؿ��� �� �� ����
				grade  = "A";
				break;                                                      //break������ switch������ ���
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:                                                        //default = else�� ����� �����ϴ�.
				grade = "F";
			}
		System.out.println("�Է��Ͻ� ������ ����� "+grade+"�Դϴ�.");               //"+����+"�ؾ��� ������ �ν��Ѵ�.
	   }
		
	
	
	
	
	
	
	}
	}


