package chapters15;

import java.io.FileReader;
import java.io.IOException;
		
public class FileReaderEx {					//파일을 읽어오는것
	
	public static void main(String[] args) {
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int input;
			while((input = fin.read()) != -1) {				//여기서 -1은 파일의 끝을 알려주는 -1이므로 4byte고 read()로 읽어오는 문서에 있는 -1은 char형이고 2byte이다.
				System.out.print((char)input);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
