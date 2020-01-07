<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table border="1">
<h2>상세페이지</h2>


<tr>
		<td>글번호</td>
		<td>${boardSel.rn}</td>

		<td>조회수</td>
		<td>${boardSel.inquiry}</td>
	


	<tr>
		<td>작성자</td>
		<td colspan="3">${boardSel.userNm}</td>
	</tr>
	<tr>
		<td>제목</td>
		<td colspan="3">${boardSel.title}</td>
	</tr>
	
	<tr>
		<td align="center">내용</td>
		<td colspan="3">${boardSel.detail}</td>
	</tr>
	
	<tr>
		<td>비밀번호</td>
		<td colspan="3">${boardSel.passwd}</td>
	</tr>
	</tr>
	
</table>

<a href="/board/lst.do">목록</a>
<a href="/board/upd.do?cdKey=${boardSel.cdKey}">수정</a>
