<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Repository Search Results</h2>
    <table class="table table-hover">
        <thead>

        <tr>
            <th>#</th>
            <th>ID</th>
            <th>Name</th>
            <th>Full Name</th>
            <th>Description</th>
            <th>Owner</th>
            <th>URL</th>
            <th>Created</th>
        </tr>
        </thead>
        <tbody>

        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:choose>
            <c:when test="${empty repositories}">
                <p>There are no results .</p>
            </c:when>
            <c:otherwise>
                <c:set var="count" value="0" scope="page"/>
                <c:forEach items="${repositories}" var="repo">
                    <c:set var="count" value="${count + 1}" scope="page"/>
                    <tr>
                        <td><c:out value="${count}"/></td>
                        <td><c:out value="${repo.id}"/></td>
                        <td><c:out value="${repo.name}"/></td>
                        <td><c:out value="${repo.fullName}"/></td>
                        <td><c:out value="${repo.description}"/></td>
                        <td><c:out value="${repo.ownerName}"/></td>
                        <td><c:out value="${repo.url}"/></td>
                        <td><c:out value="${repo.createdAt}"/></td>
                    </tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>
        <%--<tr>
            <td>John</td>
            <td>Doe</td>
            <td>john@example.com</td>
        </tr>--%>


        </tbody>
    </table>
</div>

</body>
</html>
