package jdbc;

import java.util.List;

import dto.EmployeeVO;
import model.StudentDAO;

public class Ex05_Student {
	public static void main(String[] args) {
		// 아래 코드 실행되게 구현
		// 1. test_student 테이블 목록을 모두 가져온다
		StudentDAO dao = new StudentDAO();
		
		List<EmployeeVO> list = dao.selectAll();
		
		// 2. 그 후 모두 출력
		// 단, 간격은 크게 신경쓰지 말자
		
		System.out.println("name\t kor\t eng\t mat\t");
		System.out.println("---------------------------------------------");
		
		
		
		for (EmployeeVO stu : list) {
			String msg = "%s\t %d\t %d\t %d\t";
			msg = String.format(msg, 
					stu.getName(),stu.getKor(),
					stu.getEng(), stu.getMat()
					);
			
			System.out.println(msg);
		}
	}
}
