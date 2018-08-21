<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<label>Código</label>
			<input type="text" name="codigo"/>
		</div>
		
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>