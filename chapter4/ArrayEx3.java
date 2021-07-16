package chapter4;

public class ArrayEx3 {

	public static void main(String[] args) {
		/* 배열문제
		 * string형 배열
		 * bookName
		 * 자바 입문, C언어 기초, 프로그래밍 기초, 명품 자바 프로그래밍, 자바의 정석
		 * 초기화
		 * for문으로 5권의 책을 출력
		*/
		String[] bookName = {"자바 입문","C언어 기초","프로그래밍 기초", "명품 자바 프로그래밍","자바의 정석"};
		System.out.println("우리 도서목록의 책은 총 "+bookName.length+"권이며 책의 리스트는 아래와 같습니다.");
		for(int i = 0;i<bookName.length;i++) {
			System.out.println((i+1)+". "+bookName[i]);
		}
	}

}
