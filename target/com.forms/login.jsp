<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="styles.css" />
</head>
<body>
	<center>
		<form action="checkUser" method="post" id="form">
			<label for="fname">User Name:</label>
			<input type="text" id="fname" name="fname" class="inp" required><br><br><br>
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" class="inp" required><br><br><br>
			<input type="submit" id="submit" name="Login">
		</form>
	</center>
</body>
</html>