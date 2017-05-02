<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title></head>
<h1>Custom Login Form Spring-Security Demo</h1>
<div id="login_form">
<form action="/submitLogin.do" method="post">
<input type="text" name="username" value="">
<input type="password" name="password" value="">
<input type="submit" name="Submit">
</form>
</div>
</html>