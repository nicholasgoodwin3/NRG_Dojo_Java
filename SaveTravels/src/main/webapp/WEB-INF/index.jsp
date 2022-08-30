<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="stylesheet.css">
<title>plz work.</title>
</head>
<body>
<h1 id="h1">Expense table for our trip!</h1>
<table class="table table-dark table-hover">
    <thead>
        <tr>
            <th class="text-center">Expense</th>
            <th class="text-center">Vendor</th>
            <th class="text-center">Amount</th>
            <th class="text-center">Actions</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td class="text-center"><a href="/expenses/${expense.id}"><c:out value="${expense.name}"></c:out></a></td>
				<td class="text-center"><c:out value="${expense.vendor}"></c:out></td>
				<td class="text-center">$<c:out value="${expense.amount}"></c:out></td>
				<td class="text-center"><a href="/edit/${expense.id}">edit</a><br>
				<form action="/expenses/${expense.id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input type="submit" value="Delete" class="btn btn-primary">
				</form>
				</td>
			</tr>	
		</c:forEach>
    </tbody>
</table>
<div class="container-fluid" id="main"> <!-- experiment with CSS formatting and bootstrap implementation. -->
	<h1 id="title">Add a new expense:</h1>
	<form:form action="/expenses" method="post" modelAttribute="expense">

		<div id="main">
			<form:label path="name">Expense Name: </form:label><br/>
			<form:errors path="name" class="text-danger"/>
			<form:input style="width:300px;" path="name"/>
		</div>

		<div id="main">
			<form:label path="vendor">Vendor: </form:label><br/>
			<form:errors path="vendor" class="text-danger"/>
			<form:input style="width:300px;" path="vendor"/>
			<br/>
		</div>
	
		<div id="main">
			<form:label path="amount">Amount: </form:label><br />
			<form:errors path="amount" class="text-danger"/>
			<form:input style="width:300px;" type="double" path="amount"/>
		</div>
	
		<div id="main">
			<form:label path="description">Description: </form:label><br />
			<form:errors path="description" class="text-danger"/>
			<form:textarea style="width:300px;" rows="3" path="description"/>
		</div>
	
		<div id="main">
			<input type="submit" class="btn btn-primary" value="Submit"/>
		</div>
	</form:form>
</div>
</body>
</html>