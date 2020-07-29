 <%@include file="/head.jsp" %>
   <%@include file="/nav.jsp" %>

        <h1>Agregar nuevo Cliente</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Nombre : </td>   
          <td><form:input path="nombreSolicitud"  /></td>  
         </tr> 
          <tr>    
          <td>Detalles : </td>   
          <td><form:input path="detalleSolicitud"  /></td>  
         </tr>    
         <tr>    
          <td>Fecha :</td>    
          <td><form:input path="fechaSolicitud" /></td>  
         </tr>   
         <tr>    
          <td>Estado Solicitud :</td>    
          <td><form:input path="estadoSolicitud" /></td>  
         </tr>   
         <tr>    
          <td>Tipo Solicitud: </td>   
          <td><form:input path="tipoSolicitud"  /></td>  
         </tr>    
         <tr>
          <td><form:hidden path="usuarioid"  /></td>  
         </tr>    
          
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Agregar" /></td>    
         </tr>    
        </table>    
       </form:form>   

	<%@include file="/footer.jsp" %>