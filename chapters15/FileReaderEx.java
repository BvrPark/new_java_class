package chapters15;

import java.io.FileReader;
import java.io.IOException;
		
public class FileReaderEx {					//������ �о���°�
	
	public static void main(String[] args) {
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int input;
			while((input = fin.read()) != -1) {				//���⼭ -1�� ������ ���� �˷��ִ� -1�̹Ƿ� 4byte�� read()�� �о���� ������ �ִ� -1�� char���̰� 2byte�̴�.
				System.out.print((char)input);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}
