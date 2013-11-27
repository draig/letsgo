<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/css/cerulean-bootstrap.css'/>" rel="stylesheet">
  </head>
  <body>
	
    <div class="conteiner">
	<style type="text/css">
		#inputGroup label {
			font-family: Fira Sans Light;
			font-size: x-large ;
		}
		
		body {
			background-color: #eee;
		}
		#hr {
			border-top: 2px solid  #317EAC ;
			padding-bottom : 3% ;
		}
	</style>
		<div class="hidden-xs" style="margin-top: 5%;"></div>
		<div class="col-md-4 col-xs-12 col-md-offset-4">
			<h2>Authorization</h2>
			<div id="hr"></div>
			<form role="form" action="<c:url value="/j_spring_security_check" />" method="POST">
				<div class="form-group" id="inputGroup">
					<label for="inputemail" class="control-label" algin="cebter"><spring:message code="label.email" /></label>
					<input type="email" name="j_username" class="form-control" id="inputemail">
					<span class="help-block"></span>
				</div>
				<div class="form-group" id="inputGroup">
					<label for="inputpass" class="control-label" algin="cebter"><spring:message code="label.password" /></label>
					<input type="password" name="j_password" class="form-control" id="inputpass">
					<span class="help-block"></span>
				</div>
				<div class="checkbox">
				    <label>
				        <input type="checkbox" name="_spring_security_remember_me"> <spring:message code="label.remember" />
				    </label>
			    </div>
				<button type="submit" class="btn btn-primary btn-block">Sign in</button>
			</form>
			<div class="hidden-xs" style="margin-top: 20%;"></div>
			<div class="col-md-6" align="left"><a href="/LetsGo/registration.ntp"><font color="red">registrate</font></a></div> 
			<div class="col-md-6" align="right"><a href="/LetsGo/"><font color="green">come to site</font></a></div>
		</div>		
	</div>
        <script src="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/js/jquery.js'/>"></script>
        <script src="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/js/bootstrap.js'/>"></script>
  </body>
</html>
