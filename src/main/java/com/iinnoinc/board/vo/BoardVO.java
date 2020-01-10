package com.iinnoinc.board.vo;

import java.sql.Timestamp;

public class BoardVO {

	private String cdKey ; 		// 게시물 번호 고유 키
	private String noticeYn ;   // 공지사항 유무(Y - 공지사항, N - 일반 게시물)
	private String title ;    // 게시물 제목
	private String userNm ;   // 작성자명
	private String detail ;   // 게시물 내용
	private String passwd ;   // 게시물 비밀번호
	private int inquiry ; 	  // 조회수
	private String delYn ;    // 삭제 유무(Y - 삭제)
	private Timestamp upddate ; // 최종수정날짜
	private Timestamp regdate ; // 최초등록날짜

	private String searchType ; // 검색필드:작성자,제목
	private String keyword  ;   // 검색 키워드
		   
    private int totalCount ;   // 게시 글 전체 수
    private int countList = 5;  // 한 화면에 출력될 게시물 수 
    private int page =1 ;  // 현재 페이지 번호  5
    
    private int rn ;    // rownum
    
    private int countPage  =5 ;  // 한 화면에 출력될 페이지 수  10 
       
     
    private boolean prev=false;//이전 페이지 화살표
    private boolean next;//다음 페이지 화살표
    
    
    public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}
	
	// private int startPage ; // 시작 페이지   
    // private int endPage  ;   // 마지막 페이지   
	
	
	public int getStartPage() {
    // ((현재페이지-1)/한 화면에 출력될 게시물 수) *(한 화면에 출력될 게시물 수)+1
    // startPage=  (3-1) / 5 * 5+1             
    	
	//	return ((int)(page-1) /countList) * countList+1 ;
    	return ((int)(page-1) ) * countList +1;
	}
	
	public int getEndPage() {	
		return getStartPage()+countPage-1;
	}

	
	
	
	public int getCountPage() {
		return countPage;
	}

	public void setCountPage(int countPage) {
		this.countPage = countPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCountList() {
		return countList;
	}

	public void setCountList(int countList) {
		this.countList = countList;
	}



	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}


	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String toSting() {
		return super.toString() + "BoardVO [searchType=" + searchType + ", keyword" + keyword + "]";
	}
///////////////////////////
	
	public String getCdKey() {
		return cdKey;
	}

	public void setCdKey(String cdKey) {
		this.cdKey = cdKey;
	}

	public String getNoticeYn() {
		return noticeYn;
	}

	public void setNoticeYn(String noticeYn) {
		this.noticeYn = noticeYn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getInquiry() {
		return inquiry;
	}

	public void setInquiry(int inquiry) {
		this.inquiry = inquiry;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public Timestamp getUpddate() {
		return upddate;
	}

	public void setUpddate(Timestamp upddate) {
		this.upddate = upddate;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public int getRn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

}


// startPage = ((page - 1) / 10) * 10 + 1;
// endPage = startPage + countPage - 1;
// 위 링크에도 언급했지만 엄밀히 말하면 저 공식은 "((int) (page / 10)) * 10 + 1" 와 동일합니다.
// 수학에서는
// (4/10)*10+1 = 0.4*10+1 = 4+1 = 5
// 가 되겠지만, 컴퓨터는
// (int)(4/10)*10+1 = 0*10+1 = 0+1 = 1
// 이 됩니다. int 와 int 가 연산하면 int, 즉 정수로 계산되고 소수점은 버려집니다.
