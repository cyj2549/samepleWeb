<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<form name="frm1" action="/board/upd.do" method="post">
	<input type="hidden" name="cdKey" value="${boardSel.cdKey}" />
	<table border="1">

		<tr>
			<td>제목</td>
			<td><textarea name="title" rows="3">${boardSel.title}</textarea></td>
		</tr>


		<tr>
			<td>내용</td>
			<td><textarea name="detail" rows="3">${boardSel.detail}</textarea></td>
		</tr>


	</table>


	<button type="submit">수정</button>
	<a href="/board/lst.do">취소</a>