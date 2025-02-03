<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>서비스 에러</title>
			<link rel="stylesheet" href="../resources/css/reset.css">
        <link rel="stylesheet" href="../resources/css/header.css">
        <link rel="stylesheet" href="../resources/css/footer.css">
        <link rel="stylesheet" href="../resources/css/error.css">
	</head>
	<body>
	 	<div id="container">
	 			 	<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
	 	
	 	<main>
			<div id="error-container">
	 	
		<h1 class="error-title">404</h1>
		<p class="error=message">요청하신 서비스가 완료되지 않았습니다.</p>
		<a href ="/" class="home-button">홈으로 돌아가기</a>
		</div>
		 	</main>
		 	<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
		</div>
	</body>
</html>