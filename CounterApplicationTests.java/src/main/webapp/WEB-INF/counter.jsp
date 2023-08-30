<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>You have visited <a href="/"> this page</a> <c:out value="${num}"></c:out> Times</h1>
<h1><a href="/">Test another visit</a></h1>
</body>
</html>
