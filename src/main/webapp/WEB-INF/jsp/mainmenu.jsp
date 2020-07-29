<%@include file="/head.jsp" %>
<%@include file="/nav.jsp" %>


 <sec:authorize access="hasRole('ADMIN')">
    <div><p>Este es admin</p></div>    
</sec:authorize>

<sec:authorize access="hasRole('USER')">
     <div>
     	<p> Este es usuario</p>
     </div>  
</sec:authorize>

<sec:authorize access="hasRole('PRO')">
      <div>
      	<p>Este es profesional</p>
      </div>  
</sec:authorize>

<%@include file="/footer.jsp"%>