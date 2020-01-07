<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<form name="frm1" action="/userinfo/upd.do" method="post">
	<input type="hidden" name="num" value="${userinfoSel.num}" />
	<table border="1">





		<tr>
			<td>제목</td>
			<td><textarea name="title" rows="3">${userinfoSel.title}</textarea></td>
		</tr>


		<tr>
			<td>내용</td>
			<td><textarea name="content" rows="3">${userinfoSel.content}</textarea></td>
		</tr>


	</table>


	<button type="submit">수정</button>
	<a href="/userinfo/lst.do">취소</a>