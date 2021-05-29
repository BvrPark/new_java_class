package chapter5;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		String[] bookName;                      //배열선언
		bookName = new String[5];               //배열생성
		
		bookName[0] = "자바 입문";
		bookName[1] = "C언어 기초";
		bookName[2] = "프로그래밍 기초";
		bookName[3] = "컴퓨터 개론";
		bookName[4] = "데이터  베이스 기초";                       //배열 초기화
		
		//배열 선언과 생성과 초기화를 동시에 하는 방법
		String[] bookName2 = {"자바입문","C언어 기초", "프로그래밍 기초","컴퓨터 개론", "데이터 베이스 기초"};

	}

}
