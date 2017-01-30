<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><tiles:getAsString name="title" /></title>
	<link href="<c:url value="/" />/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="<c:url value="/" />/resources/css/shop.css" rel="stylesheet">
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div id="main" class="container">
		<tiles:insertAttribute name="body" />
	</div>
<script src="<c:url value="/" />/resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>