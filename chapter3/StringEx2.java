package chapter3;

public class StringEx2 {

	public static void main(String[] args) {
		String s_Date = "20210420";
				int i_Date = Integer.parseInt(s_Date);          
				/*String��  Ŭ�����̱� ������ ����ȯ�� �ȵǼ� Integer�̶�� Ŭ������ ����ؼ� ����ȯ�� ��������Ѵ�.
				  s_Date���� int�� �ٲ�鼭 ���Ե� */
				
				double  d_Date =  Double.parseDouble(s_Date);  // double���� ��������
				float  f_date  = Float.parseFloat(s_Date);     
				boolean b_Bool = Boolean.parseBoolean("true");
				// int,double,float�� �ڿ�.��� parse���� �װ� String���� �ٸ� �ڷ������� ��ȯ�ϴ� ���̴�.
				
				
				int i_Num = 20210420;
				double  d_Num = 20210420.0;
				String s_Num = Integer.toString(i_Num);        //int���� String���� �ٲپ� �ִ°�
				s_Num =Double.toString(d_Num);
				//parse��  toString�� ���� ����.
				
				System.out.println(i_Date);
				
				/* String���� �ٸ� �ɷ� ��ȯ�Ҷ��� �� ������parse�� ���� �� ������ ġȯ������
				 * �������� String���� ġȯ��ų���� �� ������  toString�� ����Ѵ�.
				 * ����� ����ȯ��ų��  �� ��ȯ��ų ������ �ڷ��������� �ȴ�. 				 
				 */

	}
}

