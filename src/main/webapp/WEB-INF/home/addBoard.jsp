<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>addBoard</h1>
	<form method="post" action="${pageContext.request.contextPath}/addBoard">
		<div>
			title : 
			<input type="text" name="title">
		</div>
		<div>
			content : 
			<textarea name="content" rows="5" cols="50"></textarea>
		</div>
		<div>
			writer : 
			<input type="text" name="writer">
		</div>
		<div>
			<button type="submit">add</button>
		</div>
	</form>
</body>
</html>
