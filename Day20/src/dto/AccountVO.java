package dto;

import java.sql.Date;

/*
	IDX			NOT NULL	NUMBER			PK, SEQ
	USERID		NOT NULL	VARCHAR2(20)	UK
	USERPW		NOT NULL	VARCHAR2(20)	
	NICK		NOT NULL	VARCHAR2(100)	UK
	EMAIL		NOT NULL	VARCHAR2(100)	
	JOIN_DATE				NUMBER			Sysdate
*/

public class AccountVO {

	private int IDX;
	private String userid;
	private String userpw;
	private String nick;
	private String email;
	private Date join_date;
	
	public int getIDX() {
		return IDX;
	}
	public void setIDX(int iDX) {
		IDX = iDX;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	
	
}
