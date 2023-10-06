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
		<form action="/cd/insert" method="post">
			<div class="mb-3 mt-3">
				<label for="cdName">CD Name:</label> <input type="text"
					class="form-control" value="Twiligh 2" id="cdName" placeholder="Enter CD name"
					name="cdName">
			</div>
			<div class="mb-3 mt-3">
				<label for="numberOfTracks">Number Of Tracks:</label> <input type="text"
					class="form-control" value=10 id="numberOfTracks" placeholder="Enter Number Of Tracks"
					name="numberOfTracks">
			</div>
			<div class="mb-3 mt-3">
				<label for="director">Director:</label> <input type="text"
					class="form-control" value="Cd diresctor" id="director" placeholder="Enter Director Name"
					name="director">
			</div>
			<div class="mb-3">
				<label for="availableCd">Is It Available:</label> <input type="checkbox"
					class="form-control" value="false" id="availableCd" placeholder="Insert Availability"
					name="availableCd">
			</div>
			
			<button type="submit" class="btn btn-primary">Register</button>
		</form>
	</div>
</body>
</html>