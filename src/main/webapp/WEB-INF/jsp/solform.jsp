 <%@include file="/head.jsp" %>
   <%@include file="/nav.jsp" %>

        <h1>Agregar nuevo Cliente</h1>  
       <form method="post" action="savesoli">    
        <table >    
         <tr>    
          <td>Nombre : </td>   
          <td><input type="text" name="nombreSolicitud" value="${idcliente.getNombre()}" readonly /></td>  
         </tr> 
          <tr>    
          <td>Detalles : </td>   
          <td><input type="text" name="detalleSolicitud"  /></td>  
         </tr>    
         <tr>    
          <td>Fecha :</td>    
          <td><input type="text" name="fechaSolicitud" /></td>  
         </tr>   
         <tr>    
          <td>Estado Solicitud :</td>    
          <td><input type="hidden" name="estadoSolicitud" /></td>  
         </tr>   
         <tr>    
          <td>Tipo Solicitud: </td>   
          <td><input type="text" name="tipoSolicitud"  /></td>  
         </tr>    
         <tr>
         <td>Id Cliente: </td> 
          <td><input type="hidden" name="usuarioid" value="${idcliente.getUsuarioid()}"  /></td>  
         </tr>    
          
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Agregar" /></td>    
         </tr>    
        </table>    
       </form>   

	<%@include file="/footer.jsp" %>