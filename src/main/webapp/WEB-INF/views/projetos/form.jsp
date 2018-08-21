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
	
	<form action="/portfolio/projetos" method="post">
		<div>
			<label>Titulo</label>
			<input type="text" name="titulo">
		</div>
		
		<div>
			<label>Descrição</label>
			<textarea rows="10" cols="20" name="descricao"></textarea>
		</div>
		
		<div>
			<label>Repositório</label>
			<input type="text" name="repositorio"/>
		</div>
		
		<c:forEach items="${tecnologias}" var="tecnologia" varStatus="status">
		
			<div>
				<label>Tecnologias</label>
				<input type="text" name="tecnologias[${status.index}].nome"/>
			</div>

		</c:forEach>
		
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>