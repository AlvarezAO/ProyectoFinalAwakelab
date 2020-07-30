<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
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

<body> --%>
<%@include file="/head.jsp" %>
<%@include file="/nav.jsp" %>


<div class="container">
    <div class="row">
        <div class="col-md-10 offset-md-1">
    <p></p>
    <h1>SECURITY LIFE</h1>
       <div class="panel panel-default panel-table">
          <div class="panel-heading">
            <div class="row">
              <div class="col-8">
                <h3 class="panel-title">Listado de Usuarios</h3>
                 </div>
                  <div class="col-4 text-center">
                    <a role="button" aria-pressed="true" href="cliform" class="btn btn-sm btn-primary btn-create">Agregar usuario</a>
                  </div>
                </div>
              </div>
              
              <div class="panel-body table-responsive">
                <table class="table table-striped table-bordered table-list ">
                  <thead>
                    <tr>
                        <th><em class="fa fa-cog"></em>Acciones</th>
                        <th>Numero Id</th>
						<th>Nombre</th>
						<th>Teléfono</th>
						<th>Correo</th>
						<th>Rubro</th>
						<th>Dirección</th>
						
						</tr> 
                  </thead>
                  <tbody>
                  <c:forEach items="${lclientes}" var="lista">
                          <tr>
                            <td align="center">
                              <a class="btn btn-primary mt-3" href="editusuario/${lista.usuarioid}"><em class="fa fa-pencil xs"></em></a>
                              <a class="btn btn-danger mt-3" href="eliminarusuario/${lista.usuarioid}"><em class="fa fa-trash xs"></em></a>
                              <a class="btn btn-warning mt-3" href=""><em class="fa fa-male xs"></em></a>
                            </td>
                            <td>${lista.usuarioid}</td>
							<td>${lista.nombre}</td>
							<td>${lista.telefono}</td>
							<td>${lista.correoelectronico}</td>
							<td>${lista.rubro}</td>
							<td>${lista.direccion}</td>
							
                          </tr>
                    </c:forEach>
                   </tbody>
                </table>
              </div>
  		</div>
 	 </div>
  </div>
  </div>
   

<%@include file="/footer.jsp" %>