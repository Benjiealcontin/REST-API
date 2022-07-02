<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/api/getdataById/" method="GET">
		<div class="form-group">
			<label for="inputEmail">ID</label> <input type="text"
				name="id" class="form-control" id="inputEmail"
				placeholder="Firstname" required>
		</div>
		<button type="submit" class="btn btn-primary">find by id</button>
	</form><br><br>
	<form action="/api/getdataByName/" method="GET">
		<div class="form-group">
			<label for="inputEmail">Name</label> <input type="text"
				name="firstname" class="form-control" id="inputEmail"
				placeholder="Firstname" required>
		</div>
		<button type="submit" class="btn btn-primary">find by name</button>
	</form>
	${data}
</body>
</html>