package com.iinnoinc.memo.vo;

import java.sql.Timestamp;

public class MemoVO {

	private String codeKey		= "";		// 코드 고유키
	private String title		= "";		// 제목
	private String memo			= "";		// 메모
	private Timestamp regdate	= null;		// 작성일
	
	
	public String getCodeKey() {
		return codeKey;
	}
	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
}
