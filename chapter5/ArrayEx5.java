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
			System.out.println("i. �����Է�");
			System.out.println("o. ������� ��ȸ");
			System.out.println("q. ���α׷� ����");
			System.out.print("�����  �Է��ϼ���:");
			selected = sc.nextLine();
			
			
			if(selected.equals("i")) {
				sRoop = true;
				while(sRoop) {
					System.out.println("[�����Է� �޴�]");
					System.out.println("h. ���� ���� �Է�");
					System.out.println("s. �б��� ���� �Է�");
					System.out.println("b. �ڷΰ���");
					System.out.print("�����  �Է��ϼ���:");
					selected2 = sc.nextLine();
					
					if(selected2.equals("h")) {
						for(int i  =0; i<bookName[0].length;i++) {
							System.out.print((i+1)+"���� å ������ �Է��ϼ���:");
							bookName[0][i] = sc.nextLine();
						}
						
					}
					else if(selected2.equals("s")) {
						for(int j  =0; j<bookName[1].length;j++) {
							System.out.print((j+1)+"���� å ������ �Է��ϼ���:");
							bookName[1][j] = sc.nextLine();
						}
					}
					else if(selected2.equals("b")) {
						sRoop = false;
						
					}
					else {
						System.out.println("<�Է¿���!> : h,s,b�� �Է��� �� �ֽ��ϴ�.");
					}
				}
				
			}
			else if(selected.equals("o")) {
				sRoop1 = true;
				
				while(sRoop1) {
				System.out.println("[������� ��ȸ �޴�]");
				System.out.println("h. ���� ���� ���");
				System.out.println("s. �б��� ���� ���");
				System.out.println("e. ��ü ���� ���");
				System.out.println("b. �ڷΰ���");
				System.out.print("����� �Է��ϼ���.");
				selected3 = sc.nextLine();
				
				if(selected3.equals("h")) {
					System.out.println("["+"���� ���� ���"+"]");
					for(int i = 0; i<bookName[0].length;i++) {
						System.out.println((i+1)+". "+bookName[0][i]);
					}
				}
				else if(selected3.equals("s")) {
					System.out.println("["+"�б��� ���� ���"+"]");
					for(int i = 0; i<bookName[1].length;i++) {
						System.out.println((i+1)+". "+bookName[1][i]);
					}
				}
				else if(selected3.equals("e")) {
					System.out.println("["+"��ü ���� ���"+"]");
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
					System.out.println("<�Է¿���!> : h,s,e,b �� �Է��� �� �ֽ��ϴ�.");
				}
			}
				
			}
			else if(selected.equals("q")) {
				mRoop  = false;
			}
			else {
				System.out.println("<�Է¿���!>: i �Ǵ� o�� �Է� �����մϴ�.");
			}
			
		}
		
		System.out.println("�����Է� ���α׷��� �����մϴ�.");

	}

}
