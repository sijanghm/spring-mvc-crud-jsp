<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a new Student</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<h3 class="text-center py-3">Update A Student</h3>
	<div class="container">
		<div class="row">
		<div class = "col-md-12">
			<form action="/students" method = "POST">
			<input type="text" value = "${updateStudent.id }" name = "id" style="display:none;"/>

				<div class="form-group">
					<label for="name">Name</label> <input type="text"
						class="form-control"
						 id="name"
						 placeholder="Enter Name"
						 name="name"
						 value = "${updateStudent.name} ">
				</div>
				<div class="form-group">
					<label for="email">Email</label> <input type="email"
						class="form-control" id="email" placeholder="Enter Email" name="email"
						value = "${updateStudent.email} ">
				</div>
				<div class="form-group">
					<label for="address">Address</label> <input type="text"
						class="form-control" id="address" placeholder="Enter Address" name ="address"
						value = "${updateStudent.address} ">
				</div>


				<button type="submit" class="btn btn-primary">Update</button>
			</form>
		
		</div>

		

		</div>

	</div>

</body>
</html>