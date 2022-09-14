<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<title>New Ninja Form!</title>
</head>
<body>
	<div class="text-bg-dark p-3">
		<h1>New Ninja!</h1>
		<form:form action="/ninjas" method="post" modelAttribute="ninja">

    	<p>
        	<form:label path="firstName">First Name:</form:label> <form:input path="firstName"/>
    	</p>
    
    	<p>
        	<form:label path="lastName">Last Name:</form:label> <form:input path="lastName"/>
    	</p>
    	<p>
        	<form:label path="age">Age:</form:label> <form:input path="age"/>
    	</p>
    	<p>
        	<form:label path="dojo">Dojo:</form:label> <form:select path="dojo">
        	<c:forEach var="eachDojo" items="${dojos}"> 
        	<option value="${eachDojo.id}">
	        <c:out value="${eachDojo.name}"/>
	        </option>
        	</c:forEach>
        	</form:select>
    	</p>
    	<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>