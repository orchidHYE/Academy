<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<p>request.setAttribute("name") 이름: ${name}</p>
<P>model.addAttribute("serverTime") 현재시간: ${serverTime}. </P>
</body>
</html>