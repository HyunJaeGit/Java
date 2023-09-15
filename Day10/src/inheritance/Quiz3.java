package inheritance;

import java.util.Scanner;

public class Quiz3 {
	static String id = "itbank";
	static String pw = "it";
	
	static String login(String userid, String userpw) {
		boolean sameId = id.equals(userid);
		boolean samepw = pw.equals(userpw);
		
		String result = "로그인 실패";
		
		if (sameId && samepw) {
            result = id + "님 로그인";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// ID, PW를 문자열로 입력 받아서 아래 정보와
		// 동일하면 로그인 성공을 출력
		// 하나라도 다르면 로그인 실패

		Scanner sc = new Scanner(System.in);
	
		System.out.print("ID >> ");
		String userid = sc.nextLine();
		System.out.print("pw >> ");
		String userpw = sc.nextLine();

		String result = login(userid, userpw);
		System.out.println(result);
		
		sc.close();
	}
}
