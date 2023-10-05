<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>	

	<div class="container-fluid mt-3">
		<h3>Reader Applicant List</h3>

		<h2>Domain Classes</h2>
		<p>LibraryItem</p>
		<table class="table">
			<thead>
				<tr>
					<th>Book Name</th>
					<th>Writer</th>
					<th>Is Available</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${listOfBook}">
					<tr>
						<td>${b.bookName}</td>
						<td>${b.writer}</td>
						<td>${b.availableBook}</td>
						<td><a href="/book/${b.codeNumber}/delete">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>