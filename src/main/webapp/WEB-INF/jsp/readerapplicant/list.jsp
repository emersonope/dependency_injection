<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
		<h3>User List</h3>

		<h2>Domain Classes</h2>
		<p>LibraryItem</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Field</th>
					<th>Type</th>
					<th>Notes</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="r" items="${listOfReadersApplicant}">
					<tr>
						<td>${r.name}</td>
						<td>${r.cpf}</td>
						<td>${r.email}</td>
						<td><a href="/readerapplicant/${r.cpf}/delete">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>