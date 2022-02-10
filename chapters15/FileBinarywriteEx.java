package chapters15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBinarywriteEx {

	public static void main(String[] args) throws IOException {
		byte[] b = { 7, 51, 3, 4, -1, 24 };

		FileOutputStream fout = new FileOutputStream(
				"C:\\�����ϰ������\\������210512\\java\\����ȣ 8841\\src\\chapters15\\test.bin"); // ������ ������ ����, ������ �����
		for (int i = 0; i < b.length; i++) {
			fout.write(b[i]);
		}
		fout.close();

		byte[] b2 = new byte[6];

		FileInputStream fin = new FileInputStream("C:\\�����ϰ������\\������210512\\java\\����ȣ 8841\\src\\chapters15\\test.bin");
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
