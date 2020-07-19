<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mycss.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
<table>
<tr>
<td>Name</td>
<td><form:input path="name"/></td>
<td><form:errors path="name" cssClass="error"/></td>
</tr>
<tr>
<td>Age</td>
<td><form:input path="age"/></td>
<td><form:errors path="age" cssClass="error"/></td>
</tr>
<tr>
<td>Postal Code</td>
<td><form:input path="postalCode"/></td>
<td><form:errors path="postalCode" cssClass="error"/></td>
</tr>
<tr>
<td>Course Code</td>
<td><form:input path="courseCode"/></td>
<td><form:errors path="courseCode" cssClass="error"/></td>
</tr>
<tr>
<td>Phone Number</td>
<td><form:input path="phoneNumber"/></td>
<td><form:errors path="phoneNumber" cssClass="error"/></td>
</tr>
<tr>
<td><input type="submit" value="Submit"></td>
</tr>
</table>
</form:form>
</body>
</html>