<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
    <h1>add programmer</h1>
	<form action="addProgrammer">
	<input type="text" name="pId"><br>
	<input type="text" name="pName"><br>
	<input type="text" name="tech"><br>
	<input type="submit"><br>
	</form>
	<hr>
	<h1>fetch programmer</h1>
	<form action="getProgrammer">
	<input type="text" name="pId"><br>
	<input type="submit"><br>
	</form>`
	<hr>
	<h1>delete Peogrammer</h1>
	<form action="deleteProgrammer">
	<input type="text" name="pId"><br>
	<input type="submit"><br>
	</form>
	<hr>
	<h1>update Peogrammer</h1>
	<form action="updateProgrammer">
	<input type="text" name="pId"><br>
	<input type="text" name="pName"><br>
	<input type="text" name="tech"><br>
	<input type="submit"><br>
	</form>

</body>
</html>