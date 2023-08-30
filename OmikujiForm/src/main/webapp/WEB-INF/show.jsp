<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Here is your Omikuji!</h1>

<div style="border: black 2px solid; background-color: aquamarine; padding: 10px; width: 280px; font-size: larger">

    <p>In <c:out value="${number}"></c:out> years, you will live in <c:out value="${cityName}"></c:out>
    with <c:out value="${personName}"></c:out> as your roommat, <c:out value="${hobby}"></c:out>
        for a living. The next time you see a <c:out value="${livingType}"></c:out>, you will
        have a good luck. also, <c:out value="${somethingToSay}"></c:out>
    </p>

</div>

<a href="/omikuji">Go back</a>
</body>
</html>
