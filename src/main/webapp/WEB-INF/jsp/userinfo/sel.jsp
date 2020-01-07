<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"			prefix="c" %>

<table border="1">
	<tr>
		<td>글번호</td>
		<td>${userinfoSel.num}</td>
	</tr>

	<tr>
		<td>글쓴시간</td>
		<td>${userinfoSel.writeDay}</td>
	</tr>
	<tr>
		<td>아이디</td>
		<td>${userinfoSel.userID}</td>
	</tr>
	
	
		<tr>
		<td>이름</td>
		<td>${userinfoSel.userName}</td>
	</tr>
	
	<tr>
		<td>비밀번호</td>
		<td>${userinfoSel.pwd}</td>
	</tr>
	
	<tr>
		<td>제목</td>
		<td>${userinfoSel.title}</td>
	</tr>	
		<tr>
		<td>내용</td>
		<td>${userinfoSel.content}</td>
	</tr>	
	
		<tr>
		<td>조회수</td>
		<td>${userinfoSel.readcount}</td>
	</tr>	
	
	
		<tr>
		<td>게시판코드</td>
		<td>${userinfoSel.boardList}</td>
	</tr>
</table>

<a href="/userinfo/lst.do">목록</a>
<a href="/userinfo/upd.do?num=${userinfoSel.num}">수정11</a>

