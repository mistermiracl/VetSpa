<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>VetSpa - RESTful Service</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style>
* {
	font-family: arial;
}

.padded {
	padding: 30px;
}

.adjust-container {
	margin-left: -15px;
	margin-right: -15px;
}

.main-title {
	background-color: #000000;
	color: #FFFFFF;
}

ul {
	list-style: none;
}

.padding-left-20{
	padding-left: 20px;
}

</style>
</head>
<body>
	<div class="container-fluid">
		<div class="container-fluid adjust-container main-title">
			<div class="container padded">
				<div class="container">
					<h1>VetSpa - RESTful Service</h1>
				</div>
			</div>
		</div>
		<div id="serviceListContainer" class="container padded">
			<ul>
				<li>
					<h4><a href="api/UsuarioService">Usuarios Service</a></h4>
					<p class="padding-left-20">
						Endpoint para el mantenimineto de Usuarios
						<br>
						Metodos:
						<br>
						<a href="api/UsuarioService/insert">Insertar</a><br>
						<a href="api/UsuarioService/update">Actualizar</a><br>
						<a href="api/UsuarioService/delete">Eliminar</a><br>
						<a href="api/UsuarioService/find">Buscar</a><br>
						<a href="api/UsuarioService/findAll">Listar</a><br>
					</p>
				</li>
				<li>
					<h4><a href="api/ClienteService">Clientes Service</a></h4>
					<p class="padding-left-20">
						Endpoint para el mantenimineto de Clientes
						<br>
						Metodos:
						<br>
						<a href="api/ClienteService/insert">Insertar</a><br>
						<a href="api/ClienteService/update">Actualizar</a><br>
						<a href="api/ClienteService/delete">Eliminar</a><br>
						<a href="api/ClienteService/find">Buscar</a><br>
						<a href="api/ClienteService/findAll">Listar</a><br>	
					</p>
				</li>
				<li>
					<h4><a href="api/DistritoService">Distritos Service</a></h4>
					<p class="padding-left-20">
						Endpoint para el mantenimineto de Distritos
						<br>
						Metodos:
						<br>
						<a href="api/DistritoService/insert">Insertar</a><br>
						<a href="api/DistritoService/update">Actualizar</a><br>
						<a href="api/DistritoService/delete">Eliminar</a><br>
						<a href="api/DistritoService/find">Buscar</a><br>
						<a href="api/DistritoService/findAll">Listar</a><br>
					</p>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>
