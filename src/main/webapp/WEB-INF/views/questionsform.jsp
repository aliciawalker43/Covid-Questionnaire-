<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link href="/styles.css" rel="stylesheet" />
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Covid Questionaire</h1>
<div class= "form">
<form action="/anwsers" method="post">

<div><h5>Please Enter Your Name</h5><input type="text" name="name" placeholder="Full name"></input></div>
<div>
<br>
<p>1. Have you been sick with any of the below symtoms in past 14 days? <br>
<ul>Runny Nose</ul>
<ul>Coughing</ul>
<ul>Loss of taste</ul>
<ul>Shortness of Breath</ul>
<ul>Diarrhea</ul>
<ul>Fever</ul>
</p>
<select name= "quest1">
<option></option>
<option> yes</option>
<option>no </option>
</select>
<input type="text" name="symptoms" placeholder="Symptoms" >
</div>
<br>
<div>
<p>2. Have you been in contact with anyone with a Covid diagnosis in past 14 days?</p>
<select name= "quest2">
<option></option>
<option> yes</option>
<option>no </option>
</select>
</div>
<br>
<div>
<p>3. Have you return from traveling out of country within the past 14 days?</p>
<select name= "quest3">
<option></option>
<option> yes</option>
<option>no </option>
</select>
</div>

<div>
<p>4. Have your child taken any medication to reduce fever or cough before coming to school?</p>
<select name= "quest4">
<option></option>
<option> yes</option>
<option>no </option>
</select>
</div>
<br>
<div>
<p>5. Have you had a Covid test?</p>
<select name= "quest5">
<option></option>
<option> yes</option>
<option>no </option>
</select>

<p>What were the results?</p>
<select name= "quest6">
<option>Not applicable</option>
<option> postive</option>
<option>negative </option>
<option>Awaiting Results</option>
</select>
</div>

<div>
<p>6. Does anyone in you household have symptoms?</p>
<select name= "quest7">
<option></option>
<option> yes</option>
<option>no </option>
</select>
<input type="text" name="symptoms2" placeholder="Symptoms">
</div>

<button type="submit" class="btn btn-warning">Submit</button>
</form>
</div>
</body>
</html>