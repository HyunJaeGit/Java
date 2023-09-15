package inheritance;

import java.util.Scanner;

public class Quiz4 {
	static String[] ids = new String[] { "itbank", "root", "user" };
	static String[] pws = new String[] { "it", "qwe", "1234" };
	
	static String login(String userid, String userpw) {
		
		for (int i=0; i < ids.length; i++) {
			boolean sameId = ids[i].equals(userid);
			boolean samePw = pws[i].equals(userpw);
			if ( sameId && samePw ) {
				String result = "결과 : " + userid + " 님 로그인";
				return result;
			}
		}
		return "결과 : " + userid + " 님 로그인 실패";
		
	}
	
	public static void main(String[] args) {
		// 사용자에게 로그인을 입력 받아서 위에 생성해둔 계정정보와 비교
		// 일치하면 로그인 성공, 없으면 실패
		// ※ 같은 index의 데이터가 한 쌍의 계정 정보
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID >> ");
		String userid = sc.nextLine();
		System.out.print("pw >> ");
		String userpw = sc.nextLine();

		String loginResult = login(userid, userpw);
        System.out.println(loginResult);
		
		sc.close();
		
		
	}
	
	
	
}
