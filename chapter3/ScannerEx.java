package chapter3;
import java.util.Scanner;                       //Scanner�� �ڹ� ��ü�� ������� �ʱ⶧���� ���� import�� Scan��ƿ�� ������ ����ߵ�

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   //�Է��ϴ� ����� Scanner Ŭ������ ���� �����ض�(�Է��̹Ƿ� in�� ����)
		
		String name = null;                         //name�� �ƹ��͵� ��������,null�� �Ƚᵵ  ������ �������� �������� �𸥴�.
		String name2 = null;
		
		System.out.print("�̸��� �Է��� �ּ���: ");      
		//println�� ������ ����� �� �ڵ����� ���ٹ����� �������� print�� ���ٿ� �����ִ�.
		
		name = scanner.next();   
		name = scanner.next();
		name = scanner.next();                        //next�� ���ڿ����Է��ϰ� space�� �Է��ϱ� ������ ������ �� ����ǰ� space�� ������ ���� �ʱ�ȭ��  �ȴ�.
		name = scanner.next();                        // 12345�� �������͸� ġ�� �� nextLine�� �ǳʶٴ���?
		name = scanner.next();
		name2 = scanner.nextLine();
		//nextLine�� �������  �ٿ����� �� �ǰ� next�ºٿ����⸸ �����ϴ� scanner��ɾȿ� ��ü������ ����ִ� ���̴�.
		
		System.out.println(name);
		System.out.println(name2);
		
		
		
		
		
		
	
	}

}
