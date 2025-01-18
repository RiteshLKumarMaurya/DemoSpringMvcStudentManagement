<%@page import="com.lilijini.spring.student_management.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%Student student=(Student)request.getAttribute("student"); %>
	<div>
	<h2>Update the students</h2>
		<form action="save-update-student" method="post">
			<input type="number" value="<%=student.getStudentId() %>" name="studentId" readonly="readonly"><br> <br>
			<input type="text"  value="<%=student.getStudentName() %>"  name="studentName"><br> <br>
			<input type="email"  value="<%=student.getStudentEmail() %>"  name="studentEmail"> <br> <br>
			<input type="number" value="<%=student.getStudentAge() %>"   name="studentAge"> <br> <br>
			<input type="number"  value="<%=student.getStudentMarks() %>"  name="studentMarks"> <br><br>
						
			<button type="submit">UPDATE</button>
		</form>
	</div>
</body>
</html>