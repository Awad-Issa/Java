<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <style>
      .earnForms{border: black solid 4px;padding: 10px;}
      .mainDiv{display: flex;justify-content: space-around;text-align-last: center;font-size: larger;font-variant: small-caps;}
      .goldScore{margin: 80px;}
      .btn{border: black solid  4px; box-shadow: black 0px 0px 2px 2px; font-family: cursive}
      #span{ border: black 4px solid; width: 100px}

    </style>

</head>
<body>

<h2 class="goldScore">Your gold: <span id="span"><c:out value="${gold}"></c:out></span></h2>

<div class="mainDiv">
    <form action="/ninjaPost" method="POST"><div class="earnForms"><h2>Farm</h2> <h2>(earns 10 - 20 gold)</h2> <input class="btn" type="submit" value="Find Gold!"><input
            type="hidden" name="location" value="farm"></div></form>
    <form action="/ninjaPost" method="POST"><div class="earnForms"><h2>Cave</h2> <h2>(earns 5 - 10 gold)</h2> <input class="btn" type="submit" value="Find Gold!"><input
            type="hidden" name="location" value="cave"></div></form>
    <form action="/ninjaPost" method="POST"><div class="earnForms"><h2>House</h2> <h2>(earns 2 - 5 gold)</h2> <input class="btn" type="submit" value="Find Gold!"><input
            type="hidden" name="location" value="house"></div></form>
    <form action="/ninjaPost" method="POST"><div class="earnForms"><h2>Quest</h2> <h2>(earns/takes 0 - 50 gold)</h2> <input class="btn" type="submit" value="Find Gold!"><input
            type="hidden" name="location" value="quest"></div></form>
</div>

<h2>Activities:</h2>

<ul>

    <c:forEach items="${activities}" var="activity">
        <li>${activity}</li>
        </c:forEach>

</ul>

</body>
</html>
