package chapter5;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[] bookName = {"자바입문","C언어 기초", "프로그래밍 기초","컴퓨터 개론", "데이터 베이스 기초"};
		
		for(int i = 0; i<bookName.length;i++) {                //bookName의 배열길이 값을 불러오는것 = length
			System.out.println(bookName.length);
			System.out.println(bookName[i]);
		}

	}

}
