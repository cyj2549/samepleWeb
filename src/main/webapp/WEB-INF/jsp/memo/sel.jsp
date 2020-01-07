<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"			prefix="c" %>

<table border="1">
	<tr>
		<td>제목</td>
		<td>${memoSel.title}</td>
	</tr>
	<tr>
		<td>메모</td>
		<td>${memoSel.memo}</td>
	</tr>
	<tr>
		<td>작성일</td>
		<td>${memoSel.regdate}</td>
	</tr>
</table>

<a href="/memo/lst.do">목록</a>
<a href="/memo/upd.do?codeKey=${memoSel.codeKey}">수정</a>
