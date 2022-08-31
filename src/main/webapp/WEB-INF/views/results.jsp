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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>
<div><h1>Results</h1></div>
<div>
<table class="table table-striped">
<thead>
	<tr>
<th>Date</th><th>Name of Child</th><th>Quest1<br>(Are you sick?)</th><th>Symptoms</th><th>Quest2<br>(Come in contact?)</th><th>Quest3<br>(Traveling?)</th><th>Quest4<br>(Medication?)</th><th>Quest5<br>(Tested?)</th><th>Quest6<br>(Test results)</th><th>Quest7<br>(Household sickness?)</th><th>Symptoms</th>
</tr>
	</thead>
<tbody>
<c:forEach var= "result" items="${results }">
<tr>
<td>${result.date }</td>
<td>${result.name }</td>
<td>${result.quest1 }</td>
<td>${result.symptoms }</td>
<td>${result.quest2 }</td>
<td>${result.quest3 }</td>
<td>${result.quest4 }</td>
<td>${result.quest5 }</td>
<td>${result.quest6 }</td>
<td>${result.quest7 }</td>
<td>${result.symptoms2 }</td>
<td><a href="results/delete?id=${result.id}">Delete</a>"</td>
</tr>
</c:forEach>
</tbody>
</table>
<div><a href="/delete/all"> Delete All</a></div>
</div>
<div><a href="/"> Return Home</a></div>
</body>
</html>