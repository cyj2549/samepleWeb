<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"			prefix="c" %>


<table border="1">
	<thead>
		<tr>
			<td>제목</td>
			<td>작성일</td>
			<td>비고</td>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${not empty memoLst}">
				<c:forEach items="${memoLst}" var="items" varStatus="status">
				<tr>
					<td><a href="/memo/sel.do?codeKey=${items.codeKey}">${items.title}</a></td>
					<td>${items.regdate}</td>
					<td><a href="/memo/del.do?codeKey=${items.codeKey}">삭제</a></td>
				</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="3">등록된 데이터가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</tbody>
</table>
<a href="/memo/ins.do">새글작성</a>