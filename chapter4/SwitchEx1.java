package chapter4;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		int score = 0;
		String grade = null;
		Scanner scanner = new  Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		
		
		score = Integer.parseInt(scanner.nextLine());
		if(score >100 ||  score<0) {                                  
			System.out.println("입력하신 성적은  입력 불가능합니다.");
			
		}
		
		else {
			switch(score/10) {                                              //switch(조건)                      
			case 10 :                                                       // 문자,숫자,문자열 다됨(C는 문자열은안됨)
			case 9 :                                                        //해당하는 case문부터 밑에껄 쭉 다 실행
				grade  = "A";
				break;                                                      //break문에서 switch문에서 벗어남
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:                                                        //default = else랑 기능이 유사하다.
				grade = "F";
			}
		System.out.println("입력하신 성적의 등급은 "+grade+"입니다.");               //"+변수+"해야지 변수를 인식한다.
	   }
		
	
	
	
	
	
	
	}
	}


