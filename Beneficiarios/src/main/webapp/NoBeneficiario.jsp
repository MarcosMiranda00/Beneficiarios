<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="Stylesheet" href= "Style/NoBeneficiario.css">
<head>
<meta charset="ISO-8859-1">
<title>No eres Beneficiario</title>
</head>
<body>
<%
HttpSession sesion = (HttpSession) request.getSession();
String usuSession = String.valueOf(sesion.getAttribute("Nodui"));
System.out.print(usuSession +"Nombre usuario");

if(usuSession.equals(null)||usuSession.equals("null")){
	response.sendRedirect("index.jsp");
} %>
<form action="ControllerMostrarInformacion" method="post">
<div>
<h1>Desafortunadamente no eres Beneficiario</h1>
<input class="button" type="submit" name="NoVerificarDui" value="Regresar">
</div>
</form>
</body>
</html>