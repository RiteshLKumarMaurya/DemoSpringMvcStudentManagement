<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="add-student" method="post">
			<input type="number"  placeholder="Enterv student id" name="studentId">
			<input type="text"  placeholder="Enterv student name" name="studentName">
			<input type="email"  placeholder="Enterv student email" name="studentEmail">
			<input type="number"  placeholder="Enterv student age" name="studentAge">
			<input type="number"  placeholder="Enterv student marks" name="studentMarks">
						
			<button type="submit">Add</button>
		</form>
	</div>
</body>
</html>