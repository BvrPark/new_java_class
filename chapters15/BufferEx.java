package chapters15;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferEx {

	public static void main(String[] args) throws IOException{
		FileReader fin = null;
		
		fin = new FileReader("C:\\김준일강사수업\\웹개발210512\\java\\박지호 8841\\src\\chapters15\\hangul.txt");
		BufferedOutputStream out = new BufferedOutputStream(System.out, 5);	//5글자씩 잘라서 출력
		int input;
		while((input = fin.read()) != -1) {
			out.write(input);												//버퍼에 1개씩 저장하는 것
		}
		new Scanner(System.in).nextLine();
		out.flush();
		fin.close();
		out.close();
	}

}
