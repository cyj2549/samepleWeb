<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<form name="frm1" action="/board/ins.do" method="post">
	<table border="1">
	<script language="javascript"> // 자바 스크립트 시작

			function Insert()

			{

				var frm1 = document.form;
				if (!frm1.title.value) {
					alert("글제목을 적어주세요");
					frm1.title.focus();
					return ;
				}

				if (!frm1.detail.value) {
					alert("글내용을 적어주세요");
					frm1.detail.focus();
					return  ;
				}

				frm1.submit();
			}
		</script>
		
<h2>새글작성</h2>	
	<tr>
		<td colspan="2" align="center"><b>글을 적어주세요</b></td>
	</tr>
	
		<tr>
			<td>공지사항체크박스할거임</td>
			<td>
			
			<input type='radio' name='noticeYn' value='Y' />공지글
			<input type='radio' name='noticeYn' value='N' />일반글
			
<!-- 			<input type='checkbox' name='noticeYn' value='Y' />공지글 -->
<!-- 			type이 radio 이면 하나만 체크할수 있고 checkbox이면 여러개 체크가능 -->
			
		
			
			</td>
			
		</tr>

		
		<tr>
			<td>작성자</td>
			<td><input type="text" name="userNm"   autofocus ="" /></td>
		</tr>

		<tr>
			<td>제목</td>
			<td><input type="text" name="title"  /></td>
		</tr>


		<tr>
			<td align="center">내용</td>

			
			<td><textarea name="detail" cols="50" rows="10"></textarea></td>
			
<!-- 			<td><input type="text" name="detail"   /></td> -->
		</tr>


		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="passwd" size="15" /></td>
		</tr>


		
		<tr>
			<td>삭제유무</td> <!--notnull이라 일단넣음 나중에 수정하기!! -->
			<td><input type="text" name="delYn" size="15" /></td>
		</tr>
	<td colspan="3" align="center">
	<button type="submit">저장</button>
	<a href="/board/lst.do">취소</a>
	
</td>

	</table>

<!-- 	<button type="submit">저장</button> -->
<!-- 	<a href="/board/lst.do">취소</a> -->
</form>