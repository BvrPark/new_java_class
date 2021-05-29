package chapter5;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		boolean mRoop = true;
		boolean sRoop = true;
		boolean sRoop1 = true;
		
		String selected = null;
		String selected2 = null;
		String selected3 = null;
		
		String[][] bookName = new String[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		
		while(mRoop) {
			System.out.println("i. 도서입력");
			System.out.println("o. 도서목록 조회");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을  입력하세요:");
			selected = sc.nextLine();
			
			
			if(selected.equals("i")) {
				sRoop = true;
				while(sRoop) {
					System.out.println("[도서입력 메뉴]");
					System.out.println("h. 집의 도서 입력");
					System.out.println("s. 학교의 도서 입력");
					System.out.println("b. 뒤로가기");
					System.out.print("명령을  입력하세요:");
					selected2 = sc.nextLine();
					
					if(selected2.equals("h")) {
						for(int i  =0; i<bookName[0].length;i++) {
							System.out.print((i+1)+"번쨰 책 제목을 입력하세요:");
							bookName[0][i] = sc.nextLine();
						}
						
					}
					else if(selected2.equals("s")) {
						for(int j  =0; j<bookName[1].length;j++) {
							System.out.print((j+1)+"번쨰 책 제목을 입력하세요:");
							bookName[1][j] = sc.nextLine();
						}
					}
					else if(selected2.equals("b")) {
						sRoop = false;
						
					}
					else {
						System.out.println("<입력오류!> : h,s,b만 입력할 수 있습니다.");
					}
				}
				
			}
			else if(selected.equals("o")) {
				sRoop1 = true;
				
				while(sRoop1) {
				System.out.println("[도서목록 조회 메뉴]");
				System.out.println("h. 집의 도서 목록");
				System.out.println("s. 학교의 도서 목록");
				System.out.println("e. 전체 도서 목록");
				System.out.println("b. 뒤로가기");
				System.out.print("명령을 입력하세요.");
				selected3 = sc.nextLine();
				
				if(selected3.equals("h")) {
					System.out.println("["+"집의 도서 목록"+"]");
					for(int i = 0; i<bookName[0].length;i++) {
						System.out.println((i+1)+". "+bookName[0][i]);
					}
				}
				else if(selected3.equals("s")) {
					System.out.println("["+"학교의 도서 목록"+"]");
					for(int i = 0; i<bookName[1].length;i++) {
						System.out.println((i+1)+". "+bookName[1][i]);
					}
				}
				else if(selected3.equals("e")) {
					System.out.println("["+"전체 도서 목록"+"]");
					for(int i =0; i<bookName.length;i++) {
						for(int j=0; j<bookName[i].length;j++) {
							System.out.println(((i==0)?(i+j+1):(i+j+3))+". "+bookName[i][j]);
						}
						
					}
				}
				else if(selected3.equals("b")) {
					sRoop1 = false;
				}
				else {
					System.out.println("<입력오류!> : h,s,e,b 만 입력할 수 있습니다.");
				}
			}
				
			}
			else if(selected.equals("q")) {
				mRoop  = false;
			}
			else {
				System.out.println("<입력오류!>: i 또는 o만 입력 가능합니다.");
			}
			
		}
		
		System.out.println("도서입력 프로그램을 종료합니다.");

	}

}
