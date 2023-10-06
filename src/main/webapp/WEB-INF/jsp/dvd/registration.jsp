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
		<h2>DVD Registration</h2>
		<form action="/dvd/insert" method="post">
			<div class="mb-3 mt-3">
				<label for="dvdName">DVD Name:</label> <input type="text"
					class="form-control" value="Flores do Luan" id="dvdName" placeholder="Enter DVD name"
					name="dvdName">
			</div>
			<div class="mb-3 mt-3">
				<label for="artist">Artist:</label> <input type="text"
					class="form-control" value="Luan Santana" id="artist" placeholder="Enter Artist"
					name="artist">
			</div>
			<div class="mb-3">
				<label for="availableDvd">Is It Available:</label> <input type="checkbox"
					class="form-control" value="true" id="availableDvd" placeholder="Insert Availability"
					name="availableDvd">
			</div>
			
			<button type="submit" class="btn btn-primary">Register</button>
		</form>
	</div>
</body>
</html>