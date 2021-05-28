package chapter4;

import java.util.Scanner;                            //ctrl+shift+o = 단축키

public class School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean mRoop =  true;
		boolean sRoop1 =  true;
		boolean sRoop2 =  true;
		
		
		
		String  select1 =  null;
		String  select2 =  null;
		String  select3 =  null;
		
		while(mRoop) {
			System.out.println("1. 프로그램 계속 실행");                               //sysout작성 후 ctrl+space누르면  만들어짐
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 선택하세요: ");
			
			select1  = sc.next();
			
			if(select1.equals("1")) {
				sRoop1  = true;
				while(sRoop1) {
					System.out.println("1. 프로그램  계속 실행");
					System.out.println("b. 뒤로가기");                               
					System.out.println("q. 프로그램 종료");
					System.out.print("명령을 선택하세요: ");
					
					select2  = sc.next();
					
					if(select2.equals("1")) {
						sRoop2 = true;
						
						while(sRoop2) {
							
							System.out.println("b. 뒤로가기");                               
							System.out.println("q. 프로그램 종료");
							System.out.print("명령을 선택하세요: ");
							
							select3  = sc.next();
							
							if(select3.equals("b")) {
								sRoop2 = false;
							}
							else if(select3.equals("q")) {
								sRoop2 = false;
								sRoop1 = false;
								mRoop = false;
							}
							else {
								System.out.println("<입력오류!> : b 또는 q를 입력하셔야 합니다.");
							}
							
						}
						
						
						
					}
					
					else if(select2.equals("b")) {
						sRoop1 = false;
					
					}
					else if(select2.equals("q")) {
						mRoop = false;
						sRoop1 = false;
						
					}
					else {
						System.out.println("<입력오류!>: 1 또는 b 또는 q만 입력이 가능합니다.");
					}
				}
				
			}
			else if(select1.equals("q")) {
				mRoop = false;                                                   //break를 걸어줘도 됨 하지만 좋은 방법이 아님
				
			}
			else {
				System.out.println("<입력오류!>: 1 또는 q만 입력이 가능합니다.");
			}
			
		}
		
		System.out.println("프로그램이 종료되었습니다.");

	}

}
