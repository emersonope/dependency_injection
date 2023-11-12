<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>CD List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

	<div class="container-fluid mt-3">
		<h3>CD List</h3>
		<td><a href="/cd/registration">New</a></td>
		<table class="table table-striped">
			<thead>
				<tr>
					<td>ID</td>
					<th>Cd Name</th>
					<th>Number Of Tracks</th>
					<th>Director</th>
					<th>Availability</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${listOfCd}">
					<tr>
						<td>${c.id}</td>
						<td>${c.cdName}</td>
						<td>${c.numberOfTracks}</td>
						<td>${c.director}</td>
						<td>${c.availableCd}</td>
						<td><a href="/cd/${c.id}/delete">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>