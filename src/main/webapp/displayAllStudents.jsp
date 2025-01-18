<%@page import="com.lilijini.spring.student_management.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>All students are</h2>
	<%List<Student> students=(List)request.getAttribute("students");%>
	
	<table border="1">
		<tr>
			<td>StudentId</td>
			<td>StudentName</td>
			<td>StudentEmail</td>
			<td>StudentMarks</td>
			<td>StudentAge</td>
			<td>StudentUpdate</td>
			<td>StudentDeleted</td>
		</tr>
		
		<%for(Student s:students){ %>
		<tr>
			<td><%=s.getStudentId() %></td>
			<td><%=s.getStudentName() %></td>
			<td><%=s.getStudentEmail() %></td>
			<td><%=s.getStudentMarks() %></td>
			<td><%=s.getStudentAge() %></td>
			<td ><a href="update-student?studentId=<%=s.getStudentId()%>"><button style="background: blue; color: white;">update</button></a></td>
			<td ><a href="delete-student?studentId=<%=s.getStudentId()%>"><button style="background: red; color: white;">delete</button></a></td>
			
			
			
		</tr>
		<%} %>
	</table>
	
</body>
</html>