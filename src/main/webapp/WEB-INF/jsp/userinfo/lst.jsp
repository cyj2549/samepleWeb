<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"			prefix="c" %>

<table border="1">
	<thead>	
		<tr>		
			<td>글번호</td>
			
			<td>아이디</td>
			<td>이름</td>
			<td>제목</td>
			<td>조회수</td>
			<td>게시판구분코드</td>
			<th>-</th>
		</tr>
	</thead>
	<c:choose>
		<c:when test="${not empty userinfoLst}">
			<c:forEach items="${userinfoLst}" var="items" varStatus="status">
				<tr>
				
					
					<td>${items.num}</td>
					<td><a href="/userinfo/sel.do?num=${items.num}">${items.userID}</a></td>
					
					<td>${items.userName}</td>
					<td>${items.title}</td>
					<td>${items.readcount}</td>
					<td>${items.boardList}</td>
						
					<td><a href="/userinfo/del.do?num= ${items.num }">삭제</a></td>  
					         		
				</tr>
			</c:forEach>		
		</c:when>
		<c:otherwise>
		<tr>
			<td colspan="2">등록된 데이터가 없습니다.</td>		
		</tr>
		</c:otherwise>
	</c:choose>
</table>
<a href="/userinfo/ins.do">새글작성</a>



