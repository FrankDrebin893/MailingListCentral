<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
	<jsp:body>
		<form action="LoginController" method="post">
			Enter username : <input type="text" name="username"> <BR>
			Enter password : <input type="password" name="password"> <BR>
			<input type="submit" />
		</form>
	</jsp:body>
</t:layout>