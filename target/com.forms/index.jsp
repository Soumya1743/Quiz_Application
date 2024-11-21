<html>
<head>
	<link rel="stylesheet" href="styles.css" />
</head>
<body>
	<center>
		<h1>REGISTRATION FORM</h1>
		<form action="saveUser" method="post" id="form">
			<label for="fname">User Name:</label>
			<input type="text" id="fname" name="fname" class="inp" required><br><br><br>
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" class="inp" required><br><br><br>
			<input type="submit" id="submit">
		</form>
		
		<br><br>
		
		<p id="check">Already a User?</p>
		<a href="login.jsp">Login</a>
	</center>
</body>
</html>
