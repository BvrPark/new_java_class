package chapter4;

import java.util.Scanner;
/*
 * [�Է�]
 * ���ǹ��� �����ϼ���.
 * i. if��
 * s. switch case��
 * ������Է��ϼ���;
 * 
 * [if else]
 * [switch case]
 * 
 * [���]
 * []���� ����Ͽ� ����� ����մϴ�.
 * A����� 90~100��  �Դϴ�.
 */
public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score=0;
		String selected = null;
		String grade = null;
		
		
		System.out.println("���ǹ��� �����ϼ��� : ");
		System.out.println("i. if��");
		System.out.println("s. swithch case��");
		selected = scanner.nextLine();
		
		
		if(selected.equals("i")||selected.equals("s")) {
		if(selected.equals("i")) {
			System.out.print("����� �Է��ϼ��� : ");
			grade = scanner.nextLine();
				if(grade.equals("A")) {
					score = 90;
					
					}
				else if(grade.equals("B")) {
					score = 80;
					
				}
				else if(grade.equals("C")) {
					score = 70;
				}
				else if(grade.equals("D")) {
					score = 60;
				}
			
				else if(grade.equals("F")) {
					score = 50;
				}
				else {
					System.out.println("�Է¿���");
				
				}
			
		}
		else if(selected.equals("s")) {
			System.out.print("����� �Է��ϼ��� : ");
			grade = scanner.nextLine(); 
			switch(grade) {
			case "A":
				score = 90;
				break;
			case "B":
				score = 80;
				break;
			case "C":
				score = 70;
				break;
			case "D":
				score = 60;
			case "F":
				score = 50;	
				break;
			default:
					System.out.println("�Է¿���");
			}
		}
			
			else {
				System.out.println("�Է¿���");
			}
			
		if(selected.equals("A")||selected.equals("B")||selected.equals("C")||selected.equals("D")) {
		System.out.println('['+selected+']'+"���� ����Ͽ� ����� ����մϴ�.");
		System.out.println(grade+"�����"+score+'~'+(score+10)+"�� �Դϴ�");
		}
		else if(selected.equals("F")) {
		System.out.println('['+selected+']'+"���� ����Ͽ� ����� ����մϴ�.");
		System.out.println(grade+"�����"+score+"�������Դϴ�");
		}
			else {
				System.out.println("�Է¿���");
			}
		
		
}
}
}