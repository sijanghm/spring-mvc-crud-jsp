<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Students</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css">
<script src="/js/app.js"></script>
</head>
<body>
<div class="container">
<div>
<h2 class="text-center">Student List</h2>
</div>
<a class = "btn btn-primary" href = "new">Add Students</a>
<br>
<br>
	<table class="table table-bordered">
		<thead class="thead-dark">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${students}" var="student">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.address}</td>
					<td><a href="/update/${student.id}" class="btn btn-primary" style="margin-right:1rem;">Update </a>
					<a href="/delete/${student.id} " class="btn btn-danger">Delete </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>