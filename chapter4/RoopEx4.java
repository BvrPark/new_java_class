package chapter4;

public class RoopEx4 {

	public static void main(String[] args) {

		int sum = 0;		
		int i = 0;
		
		do {
			/*sum   i
			 * 0    0
			 * 1    1
			 * 3    2
			 * 6    3
			 * 10   4
			 * 15   5
			 */
			sum += i;
			System.out.println(sum);
			i++;
		} while(sum < 10);                              //do  while만 while뒤에 ; 찍힘

		while(sum < 100) {
			sum += i;
			
			if(i == 4) {continue;}
			
			System.out.println(sum);
			i++;
		}
		// break = 반복문을 빠져나감
		// continue = 만나면 남은 명령 무시하고 다시 반복으로 들어감
	}

}
