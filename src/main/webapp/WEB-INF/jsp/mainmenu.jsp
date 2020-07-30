<%@include file="/head.jsp" %>
<%@include file="/nav.jsp" %>
<link rel="stylesheet" href="resources/bootstrap/css/Video-Parallax-Background.css">
<style>      
    body{
        padding-top:100px;
    }
    /* fix padding under menu after resize */
    @media screen and (max-width: 767px) {
        body { padding-top: 60px; }
    }
    @media screen and (min-width:768px) and (max-width: 991px) {
        body { padding-top: 110px; }
    }
    @media screen and (min-width: 992px) {
        body { padding-top: 60px; }
    }
</style>

 <sec:authorize access="hasRole('ADMIN')">
    <div><body>
    <div class="container-fluid d-flex justify-content-center align-items-center align-content-center video-parallax-container">
        <div class="col-6">
            <h1>Heading</h1>
            <p>Paragraph</p>
        </div><video autoplay="" loop="" muted=""><source src="https://thenewcode.com/assets/videos/fashion-export.mp4" type="video/mp4" wp-acf="[{'type':'url','name':'video','label':'Video','wrapper':{'width':30}}]" wp-attr="[{'target':'src','replace':'%1'}]"></video></div>
      
        
</div>    
    <sec:authorize access="isAuthenticated()">
	    authenticated as <sec:authentication property="principal.username" /> 
	</sec:authorize>
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