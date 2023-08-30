<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Costomer Name: <c:out value="${name}"></c:out></h1>
<h3>Item Name: <c:out value="${item}"></c:out></h3>
<h3>Price: <c:out value="${price}"></c:out></h3>
<h3>Description: <c:out value="${desc}"></c:out></h3>
<h3>Vendor: <c:out value="${vendor}"></c:out></h3>
</body>
</html>
