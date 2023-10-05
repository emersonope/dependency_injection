<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Library App</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h2>Authentication</h2>
		<form action="/validate" method="post">
			<div class="mb-3 mt-3">
				<label for="email">Email:</label> <input type="email"
					class="form-control" value="emerson.oliveira@infnet.com.br" id="email" placeholder="Enter email"
					name="email">
			</div>
			<div class="mb-3">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" value="emerson.oliveira@infnet.com.br" id="pwd" placeholder="Enter password"
					name="pswd">
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>