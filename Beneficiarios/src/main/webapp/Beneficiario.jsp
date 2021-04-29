<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="Stylesheet" href= "Style/Beneficiario.css">
<head>
<meta charset="ISO-8859-1">
<title>Beneficiario</title>
</head>
<body>

<%
HttpSession sesion = (HttpSession) request.getSession();
String usuSession = String.valueOf(sesion.getAttribute("dui"));
System.out.print(usuSession +"Nombre usuario");

if(usuSession.equals(null)||usuSession.equals("null")){
	response.sendRedirect("index.jsp");
} %>
<form action="ControllerMostrarInformacion" method="post">
<div>
<h1>Eres un afortunado Beneficiario para los $300 dolares</h1>
<input class="button" type="submit" name="VerificarDui" value="Regresar">
</div>

</form>

</body>
</html>