package chapter4;

import java.util.Scanner;                            //ctrl+shift+o = ����Ű

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
			System.out.println("1. ���α׷� ��� ����");                               //sysout�ۼ� �� ctrl+space������  �������
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �����ϼ���: ");
			
			select1  = sc.next();
			
			if(select1.equals("1")) {
				sRoop1  = true;
				while(sRoop1) {
					System.out.println("1. ���α׷�  ��� ����");
					System.out.println("b. �ڷΰ���");                               
					System.out.println("q. ���α׷� ����");
					System.out.print("����� �����ϼ���: ");
					
					select2  = sc.next();
					
					if(select2.equals("1")) {
						sRoop2 = true;
						
						while(sRoop2) {
							
							System.out.println("b. �ڷΰ���");                               
							System.out.println("q. ���α׷� ����");
							System.out.print("����� �����ϼ���: ");
							
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
								System.out.println("<�Է¿���!> : b �Ǵ� q�� �Է��ϼž� �մϴ�.");
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
						System.out.println("<�Է¿���!>: 1 �Ǵ� b �Ǵ� q�� �Է��� �����մϴ�.");
					}
				}
				
			}
			else if(select1.equals("q")) {
				mRoop = false;                                                   //break�� �ɾ��൵ �� ������ ���� ����� �ƴ�
				
			}
			else {
				System.out.println("<�Է¿���!>: 1 �Ǵ� q�� �Է��� �����մϴ�.");
			}
			
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}

}
