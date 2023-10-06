<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Applicant registration</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Applicant registration</h2>
		<form action="/readerapplicant/insert" method="post">

			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" value="Emerson Pereira" id="name"
					placeholder="Enter Name" name="name">
			</div>


			<div class="form-group">
				<label for="cpf">CPF:</label> <input type="text"
					class="form-control" value="12345678989" id="cpf"
					placeholder="Enter CPF" name="cpf">
			</div>

			<div class="form-group">
				<label for="email">Email:</label> <input type="text"
					class="form-control" value="emerson@emerson.com" id="email"
					placeholder="Enter Email" name="email">
			</div>
			<div class="mb-3 mt-3">
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</form>

	</div>
</body>
</html>