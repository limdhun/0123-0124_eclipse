<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
	
	<ul>
	<c:forEach items="${balls}" var="ball">
		<li>
		 <c:out value="${ball}"/>
		</li>
	</c:forEach>
	</ul>
	
</div>

</body>
</html>