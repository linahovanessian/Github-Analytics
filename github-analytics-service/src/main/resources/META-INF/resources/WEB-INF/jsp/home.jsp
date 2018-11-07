<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>

    <!-- Access the bootstrap Css like this,
        Spring boot will handle the resource mapping automcatically -->
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>

    <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
    <c:url value="/css/main.css" var="jstlCss"/>
    <link href="${jstlCss}" rel="stylesheet"/>

</head>
<body>

<form action="/github/repositories">
    <div class="form-group">
        <label for="query">Repository Name :</label>
        <input type="text" class="form-control" id="query" name="query">
    </div>

    <button type="submit" class="btn btn-default">Search</button>
</form>
<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
