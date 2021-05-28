package chapter4;

import java.util.Scanner;
/*
 * [입력]
 * 조건문을 선택하세요.
 * i. if문
 * s. switch case문
 * 등급을입력하세요;
 * 
 * [if else]
 * [switch case]
 * 
 * [출력]
 * []문을 사용하여 결과를 출력합니다.
 * A등급은 90~100점  입니다.
 */
public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score=0;
		String selected = null;
		String grade = null;
		
		
		System.out.println("조건문을 선택하세요 : ");
		System.out.println("i. if문");
		System.out.println("s. swithch case문");
		selected = scanner.nextLine();
		
		
		if(selected.equals("i")||selected.equals("s")) {
		if(selected.equals("i")) {
			System.out.print("등급을 입력하세요 : ");
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
					System.out.println("입력오류");
				
				}
			
		}
		else if(selected.equals("s")) {
			System.out.print("등급을 입력하세요 : ");
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
					System.out.println("입력오류");
			}
		}
			
			else {
				System.out.println("입력오류");
			}
			
		if(selected.equals("A")||selected.equals("B")||selected.equals("C")||selected.equals("D")) {
		System.out.println('['+selected+']'+"문을 사용하여 결과를 출력합니다.");
		System.out.println(grade+"등급은"+score+'~'+(score+10)+"점 입니다");
		}
		else if(selected.equals("F")) {
		System.out.println('['+selected+']'+"문을 사용하여 결과를 출력합니다.");
		System.out.println(grade+"등급은"+score+"점이하입니다");
		}
			else {
				System.out.println("입력오류");
			}
		
		
}
}
}