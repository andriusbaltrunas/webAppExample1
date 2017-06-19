<%--
  Created by IntelliJ IDEA.
  User: andriusbaltrunas
  Date: 6/19/2017
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student Detail</title>
</head>
<body>
  <h1>STUDENTO DUOMENYS</h1>
  <div>Studento vardas: ${studentDetailInfo.student.name}</div>
  <div>Studento pavalde: ${studentDetailInfo.student.surname}</div>
  <div>Studento telefonas: ${studentDetailInfo.student.phone}</div>
  <div>Studento e-mail: ${studentDetailInfo.student.email}</div>

  <h3>STUDENTO ADRESAI</h3>
  <table>
    <thead>
      <tr>
        <th>Country</th>
        <th>City</th>
        <th>Street</th>
        <th>post code</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="address" items="${studentDetailInfo.studentAddresses}">
        <tr>
          <td>${address.country}</td>
          <td>${address.city}</td>
          <td>${address.street}</td>
          <td>${address.postCode}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

  <h3>STUDENTO PAZYMIAI</h3>

  PADAROTE JUS!!!!
</body>
</html>
