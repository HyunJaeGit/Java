package jdbc;

import java.util.List;

import dto.EmployeeVO;
import model.StudentDAO;

public class Ex06_test_sut_view {
	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		List<EmployeeVO> list = dao.selectAllview();		// StudentDAO -> selectAllview
//		System.out.println(list.getClass());
		
		for (EmployeeVO stu: list) {
			String msg = "%s %d %d %d %d %.2f";
			msg = String.format(msg, stu.getName(),
					stu.getKor(), stu.getEng(), stu.getMat(),
					stu.getTotal(), stu.getAvg());
			
			System.out.println(msg);
			
		}
		

		
		
	}
}
