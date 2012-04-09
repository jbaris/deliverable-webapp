<%@ page contentType="text/html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Admin cars</title>
</head>
<body>
	<h2>Cars list</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
		</tr>
		<c:forEach items="${cars}" var="car">
			<tr>
				<td><c:out value="${car.id}" /></td>
				<td><c:out value="${car.name}" /></td>
			</tr>
		</c:forEach>
	</table>
	<h2>Add car</h2>
	<form action="car.add.do">
		Name: <input name="name" /> <input type="submit" />
	</form>
</body>
</html>
