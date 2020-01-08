<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- jsp문서에서 jstl을 사용하기 위한 선언 방법 -->

<table border="6" summary="게시판 목록">
	<h2>게시판 목록</h2>



	<h3>총 게시물 수 ${totalCount}</h3>
	<%-- <caption><b>게시판 목록</b></caption> --%>
	<colgroup>
		<col width="40px" />
		<col width="200px" />
	</colgroup>

	<thead>

		<tr>
			<td>글번호</td>
			<td>공지사항(Y-공지,N-일반)</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>최초등록날짜</td>
			<td>ㅡ</td>
		</tr>
		
	</thead>
	<c:choose>
		<c:when test="${not empty boardLst}">
		<!-- items-boardlst 객체
             var- 사용할 변수		
		 -->
			<c:forEach items="${boardLst}" var="items" varStatus="status">

				<tr>

					<td><a href="/board/sel.do?cdKey=${items.cdKey}">${items.rn}</a></td>
					<td><c:choose>
							<c:when test="${items.noticeYn eq 'Y'}">공지사항</c:when>
							<c:otherwise>일반 게시물</c:otherwise>
						</c:choose></td>

					<td><c:if test="${not empty items.passwd }">
							<strong> [비밀글] </strong>
						</c:if>${items.title}</td>

					<td>${items.userNm}</td>
					<td>${items.inquiry}</td>
					<td>${items.regdate}</td>

					<td><a href="/board/del.do?cdKey= ${items.cdKey }">삭제</a></td>
				</tr>

			</c:forEach>
		</c:when>
		<c:otherwise>

			<tr>
				<td colspan="7">등록된 데이터가 없습니다.</td>
			</tr>
		</c:otherwise>
	</c:choose>

	<!-- 페이징////////////////////////////////////////  -->
			      <!-- totalCount   // 게시 글 전체 수  
		           countList    // 한 화면에 출력될 게시물 수
		           page         // 현재 페이지 번호        -->
<!-- 	 when이 if문이고 otherwise가 else -->
	<!-- 페이징////////////////////////////////////////  -->
	<tr>
		<td colspan="7" align="center">--- 페이징 ---
		<div id="paging">
		<!-- 1~10까지 있는 페이지의 페이징 -->
		<!-- var 사용할 변수 -->
		<c:url var="action"  value="/board/lst.do" />
		
			<c:if test="${param.page}-1">
				<a href="${action}?page=${param.page}-1&countList=5">[이전페이지]</a>
			</c:if>
			
			<c:forEach begin="1" end="${end}" step="1" var="index">
				
			<c:choose>
					<c:when test="${param.page==index}">${index}
       				 </c:when>
       				 
					<c:otherwise>
						<a href="${action}?page=${index}&countList=5">${index}</a>
					</c:otherwise>
					
			</c:choose>
			</c:forEach>
			
				<c:if test="${param.page}+1">
				<a href="${action}?page=${param.page}+1&countList=5">[다음페이지]</a>
				</c:if>
			</div>
		</td>
	</tr>
	
	<!-- 페이징//////////////////////////////////////  -->



</table>
<h4>
	<a href="/board/ins.do">새글작성</a> <a href="/board/lst.do">목록으로</a>
</h4>

</tr>

<!-- //////////////////////////////////////// 검색 -->

<tr>
	<table border="5">
		<td colspan="7"><br />

			<form name="search" action="/board/lst.do" method="get">


				<select name="searchType" id="searchType">
					<option value="0" >----선택----</option>
					<option value="title"
						<c:if test="${param.searchType eq 'title' }">selected </c:if>>제목</option>
					<option value="userNm"
						<c:if test="${param.searchType eq 'userNm'}">selected </c:if>>작성자</option>
					<option value="all"
						<c:if test="${param.searchType eq 'all'}">selected </c:if>>제목+작성자</option>
				</select> <input type="text" name="keyword" id="search" placeholder="입력하세요"
					value="${param.keyword}" /> <input type="submit" value="검색" />
			</form></td>




		<form name="search2" action="/board/lst.do" method="get">

			    <input type="radio" name="noticeYn" value="YN">			
				<c:if test="${param.search eq 'YN'}">checked</c:if> 공지+일반글 
				
				<input type="radio" name="noticeYn" value="Y" >				
				<c:if test="${ param.search eq 'Y'}">checked</c:if> 공지글
				
				<input type="radio" name="noticeYn" value="N">
				<c:if test="${ param.search eq 'N'}">checked</c:if> 일반글
				 <input type="submit" value="조회" /><br>
			<br>
		</form>
		
		
	</table>
	<br>
</tr>




<%-- 		<input type="radio" name="noticeYn" value="YN"   <c:if test="${param.search eq 'YN'}">checked</c:if>/>공지+일반글 --%>
<%-- 		<input type="radio" name="noticeYn" value="Y" <c:if test="${ param.search eq 'Y'}">checked</c:if> />공지글 --%>
<%-- 		<input type="radio" name="noticeYn" value="N"   <c:if test="${ param.search eq 'N'}">checked</c:if> />일반글 --%>



<%-- 		<input type="radio" name="newSex" value="m" <c:if test="${requestScope.sex eq 'm'}">checked</c:if>>남 --%>
<%--         <input type="radio" name="newSex" value="w" <c:if test="${requestScope.sex eq 'w'}">checked</c:if>>여 --%>

<!-- 		<input type="submit" value="조회" /><br><br> -->




<!--
<<script type="text/javascript">
<!--
function submit(){
	var submit = $('input[name=noticeYn]').val();
	console.log(submit);
}


</script>

//-->