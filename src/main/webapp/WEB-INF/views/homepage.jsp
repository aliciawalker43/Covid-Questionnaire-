<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link href="/styles.css" rel="stylesheet" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div> ${message }</div>

<div class= "home"><h1> Welcome </h1></div>

<div class= "form">
 <h4>Please click the link to enter Covid Questionaire.</h4>
<h3><a href="/questions"> Covid Question Form</a></h3>
</div>

<div><a href="/results"> Admin Only</a></div>
</body>
</html>