<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
		<title>Add Todo Page</title>
	</head>
	<body>
		<div class="container">
		
			<h1>Enter Todo Details</h1>
			<form method="post">
				Desctiption: <input type="text" name="description"/>
				<input type="submit" class="btn btn-success"/>
			</form>
		</div>
		<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
		<script src="resources/webjars/jquery/3.6.2/dist/jquery.min.js"></script>
		
	</body>
</html>