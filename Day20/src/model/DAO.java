package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
	DAO : Data Access Object
	- DB의 정보를 가지고 접근할 객체
	- Ex01에서 사용한 코드를 재사용 하기 위한 객체
*/

public class DAO {
	protected String driver 	= "oracle.jdbc.driver.OracleDriver";
	protected String url 		= "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	protected String user 	= "c##itbank";
	protected String password	= "it";
	
	protected Connection conn;
	protected Statement stmt;
	protected ResultSet rs;
	
	public DAO() {
		try {
			Class.forName(driver);		// 생략가능 - 유지보수를 위해서 사용가능(라이브러리 체크용)
		} catch (ClassNotFoundException e) {
			System.err.println("생성자 예외 : " + e.getMessage());
		}
	}
	
	protected void close() {		// 이 메서드는 DAO 클래스 안에서만 사용하려함 -> private 메서드
		try {					// - (가독성을 위한 메서드)
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		} catch (Exception e) {}
	}
	
	
	public String test() {	
		try {
			String sql = "select banner from v$version";
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();		// 한줄 띄워주시고
			
			return rs.getString("banner");
			
		} catch (SQLException e) {
			System.err.println("test 예외 : " + e.getMessage());
		} finally {			// 꼭 마지막에 닫아줘야함 -> DB서버 재시작해야하는 경우가 생김
			close();		// 가독성을 위해 -> close() 메서드를 만들어서 사용
		}

		return null;
	}
	
	
	
	
}
