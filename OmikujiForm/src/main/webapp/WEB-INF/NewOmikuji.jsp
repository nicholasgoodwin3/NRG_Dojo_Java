<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/style.css">
<title>Your Omikuji! :)</title>
</head>
<body>
	<h1>Here's your omikuji!</h1>
	<h2 class="container">
	<c:out value="${result}"></c:out>
	</h2>
	<a href="/omikuji">Return to form</a>
</body>
</html>