package chapters12_DB;

public class LoginTest {

	public static void main(String[] args) {
		UserMgr userMgr = new UserMgr();
		
		boolean flag = userMgr.loginCheck("wlxh9595", "1234");
		if(flag ==true) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
	}

}
