<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제주의 꿈-공지사항 목록</title>
</head>
<body>
	
	<h1>공지사항</h1>
	<table>
		<thead>
			<tr>
				<th>번호</th>	
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>			
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${nList}" var="notice">
			
			<tr>
				<td>${notice.noticeNo }</td>
				<td>${notice.noticeSubject }</td>
				<td>${notice.noticeWriter }</td>
				<td>${notice.writeDate }</td>
				<td>${notice.viewCount }</td>
			</tr>
			</c:forEach>
		
		</tbody>
		
	</table>
	
	
</body>
</html>