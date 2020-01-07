package com.iinnoinc.userinfo.vo;

import java.sql.Timestamp;

public class UserinfoVO {

	private int num  ;
	private Timestamp  writeDay ;
	private String userID ="";
	private String userName = "" ;
	private String pwd = "" ;
	private String title = "" ;
	private String content = "" ;
	private int readcount ;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Timestamp getWriteDay() {
		return writeDay;
	}
	public void setWriteDay(Timestamp writeDay) {
		this.writeDay = writeDay;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public String getBoardList() {
		return boardList;
	}
	public void setBoardList(String boardList) {
		this.boardList = boardList;
	}
	private String boardList ;
	
	
	
	
	


	

}
