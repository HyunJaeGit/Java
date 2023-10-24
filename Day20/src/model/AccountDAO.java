package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.AccountVO;

public class AccountDAO extends DAO {

	public List<AccountVO> selectAll() {
		
		String sql = "select * from Account";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<AccountVO> list = new ArrayList<AccountVO>();
			
			while (rs.next()) {
				AccountVO acc = new AccountVO();
			
				acc.setEmail(rs.getString("email"));
				acc.setIDX(rs.getInt("idx"));
				acc.setUserid(rs.getString("userid"));
				acc.setUserpw(rs.getString("userpw"));
				acc.setNick(rs.getString("nick"));
				acc.setJoin_date(rs.getDate("join_date"));
				
				
				list.add(acc);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("예외 : " + e.getMessage());
		} finally {
			close();
		}
		

		
		return null;

		
	}
	
}
