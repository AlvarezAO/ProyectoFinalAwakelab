<%@include file="/head.jsp" %>
<%@include file="/nav.jsp" %>

<%
 String error = (String) request.getAttribute("error");
 if (error != null && error.equals("true"))
 {
 out.println("<h4 style=\"color:red\">Invalid login credentials. Please try again!!</h4>");
 }
 %>

<div class="container-fluid">
        <div class="row mh-100vh">
            <div class="col-10 col-sm-8 col-md-6 col-lg-6 offset-1 offset-sm-2 offset-md-3 offset-lg-0 align-self-center d-lg-flex align-items-lg-center align-self-lg-stretch bg-white p-5 rounded rounded-lg-0 my-5 my-lg-0" id="login-block">
                <div class="m-auto w-lg-75 w-xl-50">
                    <h2 class="text-info font-weight-light mb-5"><i class="fa fa-handshake-o"></i>SECURITY LIFE<br>&nbsp; &nbsp; Compañia de Seguros</h2>
                    <form name='loginForm' action=<c:url value='login' /> method='POST'>
                        <div class="form-group"><label class="text-secondary">Usuario</label><input class="form-control" type="text"  name='username' required="" value=''"></div>
                        <div class="form-group"><label class="text-secondary">Contraseña</label><input class="form-control" type="password" name='password' required=""></div>
                        <input class="btn btn-info mt-2" type="submit" value="Ingresar"/>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    </form>
                    <p class="mt-3 mb-0"></p>
                </div>
            </div>
            <div class="col-lg-6 d-flex align-items-end" id="bg-block" style="background: url(resources/img/Helping-Hand-1220x813.jpg) center center / cover;">
                <p class="ml-auto small text-dark mb-2"><br></p>
            </div>
        </div>
    </div>

<%@include file="/footer.jsp" %>