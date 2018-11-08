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
    <style>
        #rcorners1 {
            border-radius: 30px;
            border: 2px solid #5bc0de;
            padding: 20px;
            width: 200px;
            height: 150px;
            align-content: center;
            vertical-align: middle;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>${repoName} Repository</h2>
    <p><a href="/github/commits/${repoName}/${ownerName}">Jump to latest 100 commits !</a></p>

    <table class="table table-hover">
        <thead>

        <tr>
            <th>#</th>
            <th>ID</th>
            <th></th>
            <th>Commit Count</th>
        </tr>
        </thead>
        <tbody>

        <c:choose>
            <c:when test="${empty contributors}">
                <p>There are no results .</p>
            </c:when>
            <c:otherwise>
                <c:set var="count" value="0" scope="page"/>
                <c:forEach items="${contributors}" var="contributor">
                    <c:set var="count" value="${count + 1}" scope="page"/>
                    <tr>
                        <td><c:out value="${count}"/></td>
                        <td><c:out value="${contributor.login}"/></td>
                        <td>
                            <div id="rcorners1"><img style="border-radius: 50%;" src="${contributor.avatar}" alt=""
                                                     height="100"
                                                     width="100"/></div>
                        </td>
                        <td><c:out value="${contributor.commitCount}"/></td>

                    </tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>


        </tbody>
    </table>
</div>

</body>
</html>
