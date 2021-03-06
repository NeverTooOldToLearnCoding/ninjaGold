<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style>
	*{
		margin:0px;
		padding:0px;
	}
	div.container {
		padding:20px;
		border:2px solid black;
		text-align:center;
		width:250px;
		height:300px;
		display:inline-block;
	}
	div.text {
		width:1150px;
		height:150px;
		overflow-y:scroll;
		border:2px solid black;
	}
	div.score{
		width:100px;
		border:2px solid black;
	}
	p.green{
		color:green;
	}
	p.red{
		color:red;
	}

	</style>
</head>
<body>
	<div class = 'score'>
		Your Score: <%=session.getAttribute("gold")%>
	</div>
	<div class='container'>
		<h1>Farm</h1>
		<p>(earns 10-20 golds)</p>
		<form action='/processgold' method='post'>
			<input type="hidden" name="building" value="farm">
			<button type='submit' value='Submit'>Find Gold!</button>
		</form>
	</div>
	<div class='container'>
		<h1>Cave</h1>
		<p>(earns 5-10 golds)</p>
		<form action='/processgold' method='post'>
			<input type="hidden" name="building" value="cave">
			<button type='submit' value='Submit'>Find Gold!</button>
		</form>
	</div>
	<div class='container'>
		<h1>House</h1>
		<p>(earns 2-5 golds)</p>
		<form action='/processgold' method='post'>
			<input type="hidden" name="building" value="house">
			<button type='submit' value='Submit'>Find Gold!</button>
		</form>
	</div>
	<div class='container'>
		<h1>Casino</h1>
		<p>(earns 0-50 golds)</p>
		<form action='/processgold' method='post'>
			<input type="hidden" name="building" value="casino">
			<button type='submit' value='Submit'>Find Gold!</button>
		</form>
	</div>
	<h2>Activities:</h2>
	<div class="text">		
		<%= session.getAttribute("activities")%>
	</div>
</body>
</html>