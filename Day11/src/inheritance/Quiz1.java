package inheritance;

import java.util.Scanner;

class User {
	private String userid, userpw, nick	;
	
	public User(String userid, String userpw, String nick) {
		this.userid = userid;
		this.userpw = userpw;
		this.nick	= nick;
	}

	public User(String userid, String userpw) {
		this(userid, userpw, null);			// this()	: 다른 생성자 호출
											// this.멤버	: 필드나 메서드를 호출
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		result = prime * result + ((userpw == null) ? 0 : userpw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		if (userpw == null) {
			if (other.userpw != null)
				return false;
		} else if (!userpw.equals(other.userpw))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return userid + " : " + userpw + " : " + nick;
	}

	public String getNick() {
		
		return nick;
	}
	
}

public class Quiz1 {
	
	static User[] dbs = new User[] {
			new User( "itbank","it","아뱅" ),
			new User( "root","qwe","관리자" ),
			new User( "user","1234","유저" )
	};
	
	static User login(User user) {
		for (int i = 0; i < dbs.length; i++) {
			if (dbs[i].equals(user)) {
				return dbs[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// 이번엔 계정 정보를 클래스로 구현해서 로그인을 구현
		Scanner sc = new Scanner(System.in);
		String userid, userpw;
		
		System.out.print("ID >> ");
		userid = sc.nextLine();
		System.out.print("pw >> ");
		userpw = sc.nextLine();
		
		User user = new User(userid, userpw);
		user = login(user);
		
		String msg = "로그인 실패, 일치하는 계정이 존재하지 않습니다";
		
		if (user != null) {
			msg = user.getNick() + "님 로그인";
		}
			
		System.out.println(msg);
				
		
		
		sc.close();
		
	}
	
	
	
}
