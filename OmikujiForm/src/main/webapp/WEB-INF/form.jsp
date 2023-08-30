<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Post Page</title>
</head>
<body>

<h1>Send an Omikuji!</h1>

<div style="border: black 2px solid; display: inline-block; padding: 10px;">

<form action="/omikuji/show" method="POST">

<h3>Pick any number from 5 to 25</h3>
<input type="number" name="number">

<h3>Enter the name of any city</h3>
<input type="text" name="cityName">

<h3>Enter any name of any real person</h3>
<input type="text" name="personName">

<h3>Enter professional endeavor or hobby</h3>
<input type="text" name="hobby">

<h3>Enter any type of living thing</h3>
<input type="text" name="livingType">

<h3>Say some thing nice to someone</h3>
<input type="text" name="somethingToSay">

<h2>Send and show a friend</h2>

<input type="submit" value="Send" >

</form>
</div>

</body>
</html>
