package chapter6_3;

import java.util.Scanner;

public class ArrayClass {
	
	public static void main(String[] args) {
		Student[] s = new Student[4]; 							// Ŭ���� �迭 ����

		Scanner sc = new Scanner(System.in);
		System.out.println("<�л� ���� �Է�>");
		System.out.println();
		
		for(int i = 0; i<s.length;i++) {
			s[i] = new Student();
			s[i].setStudentName("����ȣ" + i);
			s[i].setStudentAge(15+i);
			s[i].setStudentGrade("A");
		}
		
		
		/*
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();								//������ ����
			System.out.println((i+1) + "��° �Է�");
			System.out.print("�й� : ");
			s[i].setStudentID(Integer.parseInt(sc.nextLine()));
			System.out.print("�̸� : ");
			s[i].setStudentName(sc.nextLine());
			System.out.print("���� : ");
			s[i].setStudentAge(Integer.parseInt(sc.nextLine()));
			System.out.print("���� : ");
			s[i].setStudentGrade(sc.nextLine());
		}
		*/
		for (int i = 0;i<s.length;i++) {
			System.out.println(s[i].getStudentName() + "�л��� ����");
			System.out.println("�й� : " + s[i].showID());
			System.out.println("���� : " + s[i].getStudentAge());
			System.out.println("���� : " + s[i].getStudentGrade());
			System.out.println();
		}
		
	}
}