package chapters15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBinarywriteEx {

	public static void main(String[] args) throws IOException {
		byte[] b = { 7, 51, 3, 4, -1, 24 };

		FileOutputStream fout = new FileOutputStream(
				"C:\\김준일강사수업\\웹개발210512\\java\\박지호 8841\\src\\chapters15\\test.bin"); // 파일이 없으면 생성, 있으면 덮어쓰기
		for (int i = 0; i < b.length; i++) {
			fout.write(b[i]);
		}
		fout.close();

		byte[] b2 = new byte[6];

		FileInputStream fin = new FileInputStream("C:\\김준일강사수업\\웹개발210512\\java\\박지호 8841\\src\\chapters15\\test.bin");
		int input, count = 0;
		while ((input = fin.read()) != -1) {
			b2[count] = (byte) input;
			count++;
		}
		for (byte temp : b2) {
			System.out.println(temp);
		}
		fin.close();
	}

}
