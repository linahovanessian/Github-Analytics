<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

</head>
<body>

<div class="container">
    <h2>${repoName} Repository latest 100 Commits</h2>

    <table class="table table-hover">
        <thead>

        <tr>
            <th>#</th>
            <th>sha</th>
            <th>Message</th>
            <th>URL</th>
            <th>Author</th>
            <th>Committer</th>
        </tr>
        </thead>
        <tbody>

        <c:choose>
            <c:when test="${empty commits}">
                <p>There are no results .</p>
            </c:when>
            <c:otherwise>
                <c:set var="count" value="0" scope="page"/>
                <c:forEach items="${commits}" var="commit">
                    <c:set var="count" value="${count + 1}" scope="page"/>
                    <tr>
                        <td><c:out value="${count}"/></td>
                        <td><c:out value="${commit.sha}"/></td>
                        <td><c:out value="${commit.message}"/></td>
                        <td><a target="_blank" href="${commit.url}">${commit.url}</a></td>
                        <td><c:out value="${commit.authorName}"/></td>
                        <td><c:out value="${commit.committerName}"/></td>


                    </tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>


        </tbody>
    </table>
</div>

</body>
</html>
