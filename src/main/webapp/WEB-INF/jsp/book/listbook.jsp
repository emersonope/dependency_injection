<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>	

	<div class="container-fluid mt-3">
		<h3>Book List</h3>
		<td><a href="/book/registration">New</a></td>
		<table class="table table-striped">
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