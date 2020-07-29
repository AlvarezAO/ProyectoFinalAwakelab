<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />  
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Untitled</title>
    <link rel="stylesheet" href="templatesUno/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="templatesUno/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="templatesUno/css/Bootstrap-DataTables.css">
    
</head>

<body>
<%@include file="/nav.jsp" %>

<div class="container">
    <div class="row">
    
    
        <div class="col-md-10 offset-md-1">

    <p></p>
    <h1>SECURITY LIFE</h1>
    <p></p>

    <p> </p><p> </p>
            <div class="panel panel-default panel-table">
              <div class="panel-heading">
                <div class="row">
                  <div class="col-8">
                    <h3 class="panel-title">Listado de Usuarios</h3>
                  </div>
                  <div class="col-4 text-right">
                    <a role="button" aria-pressed="true" href="/cliform" class="btn btn-sm btn-primary btn-create">Agregar usuario</a>
                  </div>
                </div>
              </div>
              
              <div class="panel-body">
                <table class="table table-striped table-bordered table-list">
                  <thead>
                    <tr>
                        <th><em class="fa fa-cog"></em>Acciones</th>
                        <th>Numero Id</th>
						<th>Nombre</th>
						<th>Tel�fono</th>
						<th>Correo</th>
						<th>Rubro</th>
						<th>Direcci�n</th>
						<th>Clave</th>
						</tr> 
                  </thead>
                  <tbody>
                  <c:forEach items="${lclientes}" var="lista">
                          <tr>
                            <td align="center">
                              <a class="btn btn-default" href="editusuario/${lista.usuarioid}"><em class="fa fa-pencil"></em></a>
                              <a class="btn btn-danger" href="eliminarusuario/${lista.usuarioid}"><em class="fa fa-trash"></em></a>
                            </td>
                            <td>${lista.usuarioid}</td>
							<td>${lista.nombre}</td>
							<td>${lista.telefono}</td>
							<td>${lista.correoelectronico}</td>
							<td>${lista.rubro}</td>
							<td>${lista.direccion}</td>
							<td>${lista.clave}</td>
                          </tr>
                    </c:forEach>
                        </tbody>
                </table>
            
              </div>
  </div></div></div>
     <script src="templatesUno/js/jquery.min.js"></script>
    <script src="templatesUno/bootstrap/js/bootstrap.min.js"></script>

</body>

</html>