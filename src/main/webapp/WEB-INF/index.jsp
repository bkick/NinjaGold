<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your Gold <c:out value="${sessionScope.gold}"/></h1>
<div class="box">
	<h1>Farm</h1>
	<p>(earns 10-20 gold)</p>
	<form action="/proccess" method="post">
		<input type="hidden" value="farm" name="income"/>
		<button type="submit">Find Gold!</button>
	</form>
</div>
<div class="box">
	<h1>Cave</h1>
	<p>(earns 5-10 gold)</p>
	<form action="/proccess" method="post">
		<input type="hidden" value="cave" name="income"/>
		<button type="submit">Find Gold!</button>
	</form>
</div>
<div class="box">
	<h1>House</h1>
	<p>(earns 2-5 gold)</p>
	<form action="/proccess" method="post">
		<input type="hidden" value="house" name="income"/>
		<button type="submit">Find Gold!</button>
	</form>
</div>
<div class="box">
	<h1>Casino</h1>
	<p>(earns/takes 0-50 gold)</p>
	<form action="/proccess" method="post">
		<input type="hidden" value="casino" name="income"/>
		<button type="submit">Find Gold!</button>
	</form>
</div>
<h1>Activities</h1>
<div class="activities">
	<c:forEach var = "a" items="${action}">
		<p>${a}</p>
	</c:forEach>
</div>
</body>
</html>