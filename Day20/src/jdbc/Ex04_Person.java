package jdbc;

import java.util.List;

import dto.PersonVO;
import model.PersonDAO;

public class Ex04_Person {
	public static void main(String[] args) {
		
		PersonDAO dao = new PersonDAO();
		
		
		String version = dao.test();
		System.out.println("version : " + version);
		
		List<PersonVO> list = dao.selectAll();
		
		System.out.println("이름\t 신상\t 생년월일");
		System.out.println("--------------------------");
		
		for (PersonVO row : list) {
			System.out.printf("%s\t %.1f\t %s\n",
					row.name, row.height, row.birth);
		}
	}
}
