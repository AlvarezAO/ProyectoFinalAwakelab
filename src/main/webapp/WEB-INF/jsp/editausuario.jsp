    
		<%@include file="/head.jsp" %>		
		<%@include file="/nav.jsp" %>


 
    <h1>Editar Cliente</h1>  
       <form:form method="post" action="/modulo5dia12/guardacambio">    
        <table >  
         <tr>      
          <td><form:hidden path="usuarioid"  /></td>  
         </tr>
         <tr>    
          <td>Nombre : </td>   
          <td><form:input path="nombre"  /></td>  
         </tr> 
          <tr>    
          <td>Rut : </td>   
          <td><form:input path="rut" /></td>  
         </tr>    
         <tr>    
          <td>Teléfono :</td>    
          <td><form:input path="telefono" /></td>  
         </tr>   
         <tr>    
          <td>Correo electrónico :</td>    
          <td><form:input path="correoelectronico"  /></td>  
         </tr>   
         <tr>    
          <td>Rubro : </td>   
          <td><form:input path="rubro"  /></td>  
         </tr>    
         <tr>    
          <td>Dirección : </td>   
          <td><form:input path="direccion" /></td>  
         </tr>    
          <tr> 
          <td>Clave : </td>       
          <td><form:input path="clave" /></td>  
         </tr> 
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Guardar cambios" /></td>    
         </tr>    
        </table>    
       </form:form>   
   

<%@include file="/footer.jsp" %>