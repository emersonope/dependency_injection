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
		<h3>Reader Applicant List</h3>

		<h2>Domain Classes</h2>
		<p>LibraryItem</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Dvd Name</th>
					<th>Artist</th>
					<th>Available Dvd</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="d" items="${listOfDvd}">
					<tr>
						<td>${d.dvdName}</td>
						<td>${d.artist}</td>
						<td>${d.availableDvd}</td>
						<td><a href="/dvd/${d.codeNumber}/delete">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>