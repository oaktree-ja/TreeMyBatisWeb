<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		   <link rel="stylesheet" href="../resources/css/reset.css">
    <link rel="stylesheet" href="../resources/css/header.css">
     <link rel="stylesheet" href="../resources/css/footer.css">
<link rel="stylesheet" href="../resources/css/write.css">
		<title>제주의 꿈 공지사항</title>
	</head>
	<body>
	<div id="container">
	  <jsp:include page="/WEB-INF/views/include/header.jsp"/>
		<h1>공지사항 작성</h1>
			<main>
			<form class="notice-form" action ="/notice/write" method="post">
			<h2>공지사항 작성</h2>
			<div class="form-group">
				<label>제목</label>
				<input type="text" name="noticeSubject">
			</div>
				<div class="form-group">
				<label>내용</label> 
				<textarea name="noticeContent"></textarea>
				</div>
					<div class="form-group">
				<label>첨부파일 </label> 
				<input type="file" name="attachmentName">
					</div>
				<button type="submit" class="save-btn">저장</button>
			</form>
		
			</main>
			<jsp:include page="/WEB-INF/views/include/footer.jsp"/>
	</div>
	</body>
</html>