<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
		<title>List Todos Page</title>
	</head>
	<body>
		<div>Welcome ${name}</div>
		<hr>
		<h1>Your Todos</h1>
		<div>Your Todos are </div>
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Id Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
		<script src="resources/webjars/jquery/3.6.2/dist/jquery.min.js"></script>
		
	</body>
</html>