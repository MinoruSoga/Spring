<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
    <h2>${message}</h2>
    <form:form modelAttribute="loginForm">
        <form:input path="userId"/>
            <form:errors path="userId" cssStyle="color:red"/><br>
        <form:input path="password"/>
            <form:errors path="password" cssStyle="color:red"/><br>
        <input type="submit" value="submit">
    </form:form>
</body>
</html>