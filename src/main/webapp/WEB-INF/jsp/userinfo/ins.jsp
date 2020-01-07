<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<form name="frm1" action="/userinfo/ins.do" method="post">
	<table border="1">

		<tr>
			<td>아이디</td>
			<td><input type="text" name="userID" /></td>
		</tr>

		<tr>
			<td>이름</td>
			<td><input type="text" name="userName" /></td>
		</tr>


		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="pwd" /></td>
		</tr>


		<tr>
			<td>제목</td>
			<td><input type="text" name="title" /></td>
		</tr>


		<tr>
			<td>내용</td>
			<td><input type="text" name="content" /></td>
		</tr>

	<tr>
			<td>조회수</td>
			<td><input type="text" name="readcount" /></td>
		</tr>


	<tr>
			<td>게시판구분코드</td>
			<td><input type="text" name="boardList" /></td>
		</tr>


	</table>

	<button type="submit">저장</button>
	<a href="/userinfo/lst.do">취소</a>
</form>