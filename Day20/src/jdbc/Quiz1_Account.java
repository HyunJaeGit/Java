package jdbc;

import java.util.List;

import dto.AccountVO;
import model.AccountDAO;

public class Quiz1_Account {
	public static void main(String[] args) {
		// Account 테이블 모두 출력
		
		AccountDAO acc_dao = new AccountDAO();
		
		List<AccountVO> list = acc_dao.selectAll();
		
		System.out.println("계정번호\t 아이디\t 패스워드\t \t닉네임\t 이메일\t\t\t 가입일자");
		System.out.println("------------------------------"
				+"------------------------------------------");
		
		
		
		for (AccountVO acc : list) {
			String msg = "%d\t %s\t %s\t %s\t %s \t %s";
			msg = String.format(msg, acc.getIDX(), acc.getUserid(), acc.getUserpw()
					, acc.getNick(), acc.getEmail(), acc.getJoin_date());
			
			System.out.println(msg);
		}
	}
}
