<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>boardList</h1>
	<table border="1">
		<tr>
			<th>no</th>
			<th>title</th>
			<th>content</th>
			<th>writer</th>
			<th>삭제</th>
			<th>수정</th>
		</tr>
		<c:forEach var="b" items="${page.content}">
			<tr>
				<td>${b.no}</td>
				<td>${b.title}</td>
				<td>${b.content}</td>
				<td>${b.writer}</td>
				<td><a href="${pageContext.request.contextPath}/removeBoard?no=${b.no}">[삭제]</a></td>
				<td><a href="${pageContext.request.contextPath}/modifyBoard?no=${b.no}">[수정]</a></td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<c:if test="${page.number > 0}">
			<a href="${pageContext.request.contextPath}/boardList?currentPage=${page.number - 1}">[이전]</a>
		</c:if>
		<c:if test="${page.hasNext()}">
			<a href="${pageContext.request.contextPath}/boardList?currentPage=${page.number + 1}">[다음]</a>
		</c:if>
	</div>
</body>
</html>
