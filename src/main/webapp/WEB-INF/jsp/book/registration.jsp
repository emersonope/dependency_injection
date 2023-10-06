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
		<h2>Book Registration</h2>
		<form action="/book/insert" method="post">
			<div class="mb-3 mt-3">
				<label for="name">Book Name:</label> <input type="text"
					class="form-control" value="Twiligh 2" id="bookName" placeholder="Enter Book name"
					name="bookName">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">Writer:</label> <input type="text"
					class="form-control" value="Escritora de Twilight" id="writer" placeholder="Enter Writer"
					name="writer">
			</div>
			<div class="mb-3">
				<label for="pwd">Is It Available:</label> <input type="checkbox"
					class="form-control" value="true" id="availableBook" placeholder="Insert Availability"
					name="availableBook">
			</div>
			
			<button type="submit" class="btn btn-primary">Register</button>
		</form>
	</div>
</body>
</html>