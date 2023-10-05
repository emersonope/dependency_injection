<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Lending Page</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Lending Page</h2>
	  <form action="/pedido/incluir" method="post">
	    <div class="form-group">
	      <label>Description:</label>
	      <input type="text" class="form-control" placeholder="Enter description" name="description">
	    </div>
	    <div class="form-group">
	      <label>Data:</label>
	      <input type="datetime-local" class="form-control" name="dateLending">
	    </div>
	    <div class="form-group">
	      <label>Web:</label>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="web" value="true"> Web
			  <label class="form-check-label"></label>
			</div>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="web" value="false"> Store
			  <label class="form-check-label"></label>
			</div>
	    </div>

	    <div class="form-group">
	      <label>Reader Applicant:</label>
	      <select name="readerApplicant" class="form-control">
	      	<c:forEach var="r" items="${readerApplicants}">
	      		<option value="${s.id}">${r.name}</option>
	      	</c:forEach>
	      </select>
	    </div>

	    <div class="form-group">
	      <label>Products:</label>
	      	<c:forEach var="l" items="${libraryItems}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="produtos" value="$l.id}">
				  <label class="form-check-label"> ${l.name}</label>
				</div>	   
			</c:forEach>   
	    </div>

	    <button type="submit" class="btn btn-default">Register</button>
	  </form>
  
	</div>
</body>
</html>