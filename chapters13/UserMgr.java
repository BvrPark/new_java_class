package chapters13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserMgr {
	private DBConnectionMgr pool;

	private UserBeans uBeans = new UserBeans();

	public UserMgr() {
		pool = DBConnectionMgr.getInstance();
	}

	public int loginCheck(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int flag = 0;

		try {
			con = pool.getConnection();		//데이터 베이스와 연결
			sql = "select user_id ,user_pwd from user_mst where user_id = ? and user_pwd = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();				//Query의 결과를 set형태로 정렬시키는 것
			while(rs.next()) {						//id에 해당되는 것
				String user_id = rs.getString(1);
				String user_pwd = rs.getString(2);
				if(user_id.equals(id)) {
					if(user_pwd.equals(pwd)) {
						flag = 2;
						break;
				}
					flag = 1;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();					//에러메시지 출력
		} finally {
			pool.freeConnection(con, pstmt, rs);	//데이터 베이스와 연결해제
		}
		return flag;

	}
	
	public String welcomeName(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;						//
		String sql = null;
		String name = "";

		try {
			con = pool.getConnection();		
			sql = "SELECT\r\n" + 
					"	ud.user_name\r\n" + 
					"FROM\r\n" + 
					"	user_dtl as ud\r\n" + 
					"	inner JOIN user_mst as um ON(um.user_id = ud.user_id AND um.user_pwd = ?)\r\n" + 
					"WHERE\r\n" + 
					"	ud.user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pwd);
			pstmt.setString(2, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				name = rs.getString(1);
				System.out.println(name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();					
		} finally {
			pool.freeConnection(con, pstmt, rs);	
		}
		return name;

	}

}
