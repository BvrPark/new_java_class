package chapter3;

public class StringEx2 {

	public static void main(String[] args) {
		String s_Date = "20210420";
				int i_Date = Integer.parseInt(s_Date);          
				/*String은  클래스이기 때문에 형변환이 안되서 Integer이라는 클래스를 사용해서 형변환을 시켜줘야한다.
				  s_Date값이 int로 바뀌면서 들어가게됨 */
				
				double  d_Date =  Double.parseDouble(s_Date);  // double형도 마찬가지
				float  f_date  = Float.parseFloat(s_Date);     
				boolean b_Bool = Boolean.parseBoolean("true");
				// int,double,float등 뒤에.찍고 parse쓰면 그게 String형을 다른 자료형으로 변환하는 것이다.
				
				
				int i_Num = 20210420;
				double  d_Num = 20210420.0;
				String s_Num = Integer.toString(i_Num);        //int형을 String으로 바꾸어 주는것
				s_Num =Double.toString(d_Num);
				//parse와  toString을 자주 쓴다.
				
				System.out.println(i_Date);
				
				/* String에서 다른 걸로 변환할때는 그 변수에parse를 쓰면 그 변수로 치환되지만
				 * 변수에서 String으로 치환시킬때는 그 변수에  toString을 써야한다.
				 * 결론은 형변환시킬때  그 변환시킬 변수의 자료형을쓰면 된다. 				 
				 */

	}
}

