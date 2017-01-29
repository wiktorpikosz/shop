<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<link
	href="<c:url value="/" />/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<c:url value="/" />/resources/css/style.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="container">
		<div class="col-md-4 col-md-offset-4">
			<c:if test="${param.error != null}">
                <div class="alert alert-danger">
                    <p>Invalid username and password.</p>
                </div>
            </c:if>
			<form class="form-signin" method="POST" action="<c:url value="/login" />">
				<h2 class="form-signin-heading">Logowanie</h2>
				<label for="email" class="sr-only">Email address</label> 
				<input type="email" name="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus> 
				<label for="password" class="sr-only">Password</label> 
				<input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<button class="btn btn-lg btn-primary btn-block" type="submit">Loguj</button>
			</form>
		</div>
	</div>
	<!-- /container -->

	<script src="<c:url value="/" />/resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="<c:url value="/" />/resources/js/jquery-3.1.1.min.js"></script>
</body>
</html>
