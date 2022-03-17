package chapters15;

import java.io.IOException;
import java.io.InputStream; //이진처리(바이너리)(byte)
import java.io.InputStreamReader; //Reader붙으면 무조건 문자처리(char)
import java.io.OutputStream; //이진처리(바이너리)(byte)
import java.io.Reader; //문자처리(char)
import java.io.Writer; //문자처리(char)

/**
 * 
 * 스트림(Stream) 데이터의 흐름 in -> out 
 * out -> in 무조건 단방향의 데이터 전달 
 * read(); =>결과값으로 데이터의 갯수를 반환하는 것(바이트수)
 * 
 * 스트림의 최상위 => InputStream, OutputStream, Reader, Writer
 * 
 */

public class StreamEx {

	public static void main(String[] args) throws IOException {
		InputStream s;
		OutputStream o;
		Reader r;
		Writer w;

		InputStreamReader rd = new InputStreamReader(System.in);
		
		while (true) {
			int input = rd.read();
				System.out.println(input);
			
		}

	}

}
