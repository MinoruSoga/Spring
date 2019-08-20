<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Login</title>

<!-- Material Design for Bootstrap fonts and icons -->

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">

    <!-- Material Design for Bootstrap CSS -->

    <link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">

</head>

<body>
<main class="mt-5">
	<form:form modelAttribute="loginForm" class="container w-50 mt-5">
	      <div class="text-center my-5">
	        <h1 class="h3 mb-5 font-weight-normal">Login</h1>
	      </div>
	      <div class="form-label-group">
	      <form:input path="email" class="form-control my-5" placeholder="Email address" required="" autofocus=""/>
	      	<form:errors path="email" cssStyle="color:red"/>
	      </div>
	      <div class="form-label-group">
	      <form:input path="password" class="form-control" placeholder="Password" required=""/>
	      	<form:errors path="password" cssStyle="color:red"/>
	      </div>
	      <button class="btn btn-lg btn-primary btn-block mt-3" type="submit">Log in</button>
	
	      <p class="mt-5 mb-3 text-muted text-center">© 2019</p>

    </form:form>
</main>
</body>

</html>