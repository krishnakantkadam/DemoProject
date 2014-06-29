<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="libraries.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>VTS</title>
</head>
<body style="background-color: #34495E;">
	<div data-role="page">

		<div data-role="header" data-position="fixed" data-fullscreen="true"
			data-theme="b">
			<h1>Vehicle Tracking System</h1>
		</div>
		<div data-role="content" data-theme="b" style="height: 594px;">
			<section class="loginform">
				<form name="LoginOprationDao" action="LoginOprationDao"
					method="POST" accept-charset="utf-8">
					<div style="width: 295px;">
						<label for="usermail">Email</label> <input type="email" 
							name="usermail" style="height: 20px;"
							placeholder="yourname@email.com" required> <label
							for="password">Password</label> <input type="password"
							name="password" placeholder="password" required>
					</div>
					<div style="width: 100px;">
						<input type="submit" value="Login">
					</div>
				</form>
			</section>
		</div>
		<div data-role="footer" data-theme="b" data-position="fixed">
			<p style="font-size: x-small;" align="left">Copyrights &copy; VTS
				2014. All Rights Reserved</p>
		</div>

	</div>
</body>
</html>