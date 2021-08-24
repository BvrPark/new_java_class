package chapter6_3;

import java.util.Scanner;

public class ArrayClass {
	
	public static void main(String[] args) {
		Student[] s = new Student[4]; 							// 클래스 배열 선언

		Scanner sc = new Scanner(System.in);
		System.out.println("<학생 정보 입력>");
		System.out.println();
		
		for(int i = 0; i<s.length;i++) {
			s[i] = new Student();
			s[i].setStudentName("박지호" + i);
			s[i].setStudentAge(15+i);
			s[i].setStudentGrade("A");
		}
		
		
		/*
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();								//생성자 선언
			System.out.println((i+1) + "번째 입력");
			System.out.print("학번 : ");
			s[i].setStudentID(Integer.parseInt(sc.nextLine()));
			System.out.print("이름 : ");
			s[i].setStudentName(sc.nextLine());
			System.out.print("나이 : ");
			s[i].setStudentAge(Integer.parseInt(sc.nextLine()));
			System.out.print("성적 : ");
			s[i].setStudentGrade(sc.nextLine());
		}
		*/
		for (int i = 0;i<s.length;i++) {
			System.out.println(s[i].getStudentName() + "학생의 정보");
			System.out.println("학번 : " + s[i].showID());
			System.out.println("나이 : " + s[i].getStudentAge());
			System.out.println("성적 : " + s[i].getStudentGrade());
			System.out.println();
		}
		
	}
}