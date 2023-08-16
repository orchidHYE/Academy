<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>modelTest1.jsp</h1>
	<ul>
		<li>req.setAttribute("m1")의 값: ${m1}</li>
		<li>session.setAttribute("m2")의 값: ${m2}</li>
		<li>model.addAttribute("am3")의 값: ${am3}</li>
		<li>model.addAttribute("am4")의 값: ${am4}</li>
		<li>model.addAttribute("testDTO")의 값: ${testDTO}</li>
		<li>model.addAttribute("am5")의 값: ${am5}</li><br/>
			  t.getUserName()의 값: ${am5.getUserName()}<br/>
			  t.userName()의 값: ${am5.userName}
	</ul>
</body>
</html>