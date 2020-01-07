<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<form name="frm1" action="/memo/ins.do" method="post">
	<table border="1">
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" /></td>
		</tr>
		<tr>
			<td>메모</td>
			<td><textarea name="memo" rows="3"></textarea></td>
		</tr>
	</table>
	
	<button type="submit">저장</button>
</form>