<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=ISO-8859-1>
<title>Portfolio Andre Franzim</title>
</head>
<body>

	<h1>Projetos</h1>
	
	<div>${sucesso}</div>
	
	<table border="1">
		<tr>
			<td>Título</td>
			<td>Descrição</td>
			<td>Repositório</td>
			<td>Tecnologia</td>
		</tr>
		
		<c:forEach items="${projetos}" var="projeto">
			<tr>
				<td>${projeto.titulo}</td>
				<td>${projeto.descricao}</td>
				<td>${projeto.repositorio}</td>
				
				<c:forEach items="${projeto.tecnologias}" var="tecnologia">
					<td>${tecnologia.nome}</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>