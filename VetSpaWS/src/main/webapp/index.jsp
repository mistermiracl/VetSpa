<!DOCTYPE html>
<html>
<body>
	<h2><%= String.format("Hello %s", request.getParameter("name") != null ? request.getParameter("name") : "World") %></h2>
	<!-- <%-- <%= String.format("Hello %s", request.getParameter("name") != null ? request.getParameter("name") : "World") --%> -->
</body>
</html>
