<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to the O/p page!</h2><br><br>
	<%=request.getAttribute("id")%>
	<%=request.getAttribute("name") %>

</body>
</html>