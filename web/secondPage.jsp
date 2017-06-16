<%--
  Created by IntelliJ IDEA.
  User: andriusbaltrunas
  Date: 6/16/2017
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
This is second page :)

<div>
    <c:choose>
        <c:when test="${not empty name}">
            ${name}
        </c:when>
        <c:otherwise>
            Vardo nera
        </c:otherwise>
    </c:choose>
</div>
<div>
    ${surname}
</div>
</body>
</html>
