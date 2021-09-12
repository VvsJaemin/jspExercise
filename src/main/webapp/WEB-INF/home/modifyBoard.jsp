<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>modifyBoard</h1>
	<form method="post"
		action="${pageContext.request.contextPath}/modifyBoard">
		<div>
			no : <input type="text" name="no" value="${board.no}"
				readonly="readonly">
		</div>
		<div>
			title : <input type="text" name="title" value="${board.title}">
		</div>
		<div>
			content :
			<textarea name="content" rows="5" cols="50">${board.content}</textarea>
		</div>
		<div>
			writer : <input type="text" name="writer" value="${board.writer}"
				readonly="readonly">
		</div>
		<div>
			<button type="submit">modify</button>
		</div>
	</form>
</body>
</html>