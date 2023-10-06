<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Lending List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

	<div class="container-fluid mt-3">
		<h3>Lending List</h3>
		<td><a href="/lending/registration">New</a></td>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Description</th>
					<th>Data</th>
					<th>Web</th>
					<th>Applicant</th>
					<th>LibraryItems</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="l" items="${listOfLending}">
					<tr>
						<td>${l.description}</td>
						<td>${l.data}</td>
						<td>${l.web}</td>
						<td>${l.readerApplicant}</td>
						<td>${l.libraryItems}</td>
						<td><a href="/lending/${c.data}/delete">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>