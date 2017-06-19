<%--
  Created by IntelliJ IDEA.
  User: andriusbaltrunas
  Date: 6/19/2017
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Students</title>
</head>
<body>

<table>
  <thead>
    <tr>
      <th>Student name</th>
      <th>Student surname</th>
      <th>Student phone</th>
      <th>Student email</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="student" items="${students}">
      <tr>
        <td><a href="/getStudentDetailInfo?id=${student.id}">${student.name}</a></td>
        <td><a href="/getStudentDetailInfo?id=${student.id}">${student.surname}</a></td>
        <td>${student.phone}</td>
        <td>${student.email}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>

</body>
</html>
