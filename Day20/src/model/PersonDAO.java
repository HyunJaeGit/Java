package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.PersonVO;

// 복사-붙여넣기 하지말고 상속받으면 됨 
// : (DAO -> private -> protected 치환해줘야함)
public class PersonDAO extends DAO {	
	
	public List<PersonVO> selectAll() {
		
		try {
			String sql = "select * from person";
			// 연결
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonVO> list = new ArrayList<PersonVO>();
			
			// mapping (DB의 정보를 자바로)
			while (rs.next()) {
				PersonVO row = new PersonVO();
				
				row.name = rs.getString("name");
				row.height = rs.getDouble("height");
				row.birth = rs.getDate("birth");
				
				list.add(row);
			}
			// 읽은 하나의 리스트를 리턴
			return list;
		
		
		} catch (SQLException e) {
			System.err.println("selectAll 예외 : " + e.getMessage());
		} finally {
			close();
		}
		return null;
	
	}	
}
