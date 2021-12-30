package chapters10_2;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();		//가지형태를 가진다 최초의 입력값을 기준
		
		ts.add(23);
		ts.add(10);
		ts.add(48);
		ts.add(15);
		ts.add(7);
		ts.add(22);
		ts.add(56);
		
		System.out.println(ts);
		
		
	}

}
