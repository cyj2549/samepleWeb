<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"	prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="ko" class="default-style">

	<head>
		<title>dev</title>
		<tiles:insertAttribute name="header" />
	</head>
	<body>
		<tiles:insertAttribute name="body" />
	</body>
</html>
