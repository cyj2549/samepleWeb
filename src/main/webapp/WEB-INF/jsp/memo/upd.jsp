<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"			prefix="c" %>


<form name="frm1" action="/memo/upd.do" method="post">
	<input type="hidden" name="codeKey" value="${memoSel.codeKey}" />
	<table border="1">
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="${memoSel.title}" /></td>
		</tr>
		<tr>
			<td>메모</td>
			<td><textarea name="memo" rows="3">${memoSel.memo}</textarea></td>
		</tr>
	</table>
	
	<button type="submit">수정</button>
</form>