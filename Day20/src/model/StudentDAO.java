package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.EmployeeVO;

public class StudentDAO extends DAO {
	
	public List<EmployeeVO> selectAll() {
		
		
		String sql = "select * from test_student";
//		String sql = "select * from test_stu_view";		// view 가상 테이블을 가져와도 된다 (total,avg 를 표시할수있음)
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmployeeVO> list = new ArrayList<EmployeeVO>();
			
			while (rs.next()) {
				EmployeeVO stu = new EmployeeVO();
				
				stu.setName(rs.getString("name"));
				stu.setKor(rs.getInt("kor"));
				stu.setEng(rs.getInt("eng"));
				stu.setMat(rs.getInt("mat"));
				
				list.add(stu);
			}
		
			return list;
			
		} catch (SQLException e) {
			System.err.println("예외 : " + e.getMessage());
			
		} finally {
			close();
			
		}
		return null;
	
		
		
	}
	
	

	public List<EmployeeVO> selectAllview() {
		
		String sql = "select * from test_stu_view order by total desc";		// view 가상 테이블을 가져와도 된다 (total,avg 를 표시할수있음)
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmployeeVO> list = new ArrayList<EmployeeVO>();
			
			while (rs.next()) {
				EmployeeVO stu = new EmployeeVO();
				
				stu.setName(rs.getString("name"));
				stu.setKor(rs.getInt("kor"));
				stu.setEng(rs.getInt("eng"));
				stu.setMat(rs.getInt("mat"));
				stu.setTotal(rs.getInt("total"));
				stu.setAvg(rs.getDouble("avg"));
				
				list.add(stu);
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
