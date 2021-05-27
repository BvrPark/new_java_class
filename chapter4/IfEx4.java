package chapter4;
import java.util.Scanner;
public class IfEx4 {

	public static void main(String[] args) {
		/*
		 * [성적확인] 
		 * 점수는 0~100입력 
		 * 점수 : score  입력은 String
		 * 등급 : grade
		 * 90~100 A 
		 * 80~89 B 
		 * 70~79 C 
		 * 60~69 D 
		 * 0~59 F 
		 * 
		 * [출력]
		 * 입력하신 성적의 등급은 []입니다.
		 * */
		
		int score = 0;
		String grade = null;
		Scanner scanner = new  Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		
		
		score = Integer.parseInt(scanner.nextLine());
		if(score >100 ||  score<0) {                                  
			System.out.println("입력하신 성적은  입력 불가능합니다.");
			
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
		System.out.println("입력하신 성적의 등급은 "+grade+"입니다.");               //"+변수+"해야지 변수를 인식한다.
	   }
		}

}
