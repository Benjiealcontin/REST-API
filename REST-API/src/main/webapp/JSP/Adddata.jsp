<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/api/Adddata" method="POST">
		<div class="form-group">
			<label for="inputEmail">Firstname</label> <input type="text"
				name="firstname" class="form-control" id="inputEmail"
				placeholder="Firstname" required>
		</div>
		<div class="form-group">
			<label for="inputPassword">Lastname</label> <input type="text"
				name="lastname" class="form-control" id="inputPassword"
				placeholder="Lastname" required>
		</div>
		<div class="form-group">
			<label for="inputEmail">Age</label> <input type="text" name="age"
				class="form-control" id="inputEmail" placeholder="Age" required>
		</div>
		<button type="submit" class="btn btn-primary">add</button>
	</form>
</body>
</html>