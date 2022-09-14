<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body class="text-center">
	<div class="text-bg-dark p-3">
	<h1>Create a New Dojo!</h1>
	<form:form action="/dojos" method="post" modelAttribute="dojo">
		<p>
        	<form:label path="name">Dojo Name:</form:label>
        	<form:input path="name"/>
    	</p>
    		<input type="submit" value="Submit"/> 
	</form:form>
	</div>
</body>
</html>