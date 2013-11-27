<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Bootstrap 101 Template</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/css/cerulean-bootstrap.css'/>" rel="stylesheet">
    </head>
    <body>
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
        <div class="conteiner">
            <div class="hidden-xs" style="margin-top: 5%;"></div>
            <div class="col-md-4 col-xs-12 col-md-offset-4">
                <h2>Registration</h2>
                <div id="hr"></div>
                <form:form  method="POST" action="registrateuser.ntp" commandName="nauser" role="form">
                    <div class="form-group" id="inputGroup">
                        <label for="inputname" class="control-label" algin="cebter">Name</label>
                        <form:input type="text" path="username" class="form-control" id="inputname"/>
                        <span class="help-block"><form:errors path="username" /></span>
                    </div>
                    <div class="form-group" id="inputGroup">
                        <label for="inputemail" class="control-label" algin="cebter">Email</label>
                        <form:input type="email" path="email" class="form-control" id="inputemail"/>
                        <span class="help-block"><form:errors path="email" /></span>
                    </div>
                    <div class="form-group" id="inputGroup">
                        <label for="inputpass" class="control-label" algin="cebter">Password</label>
                        <form:input type="password" path="password" class="form-control" id="inputpass"/>
                        <span class="help-block"><form:errors path="password" /></span>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block"><spring:message code="label.reg" /></button>
                </form:form>
                <div class="hidden-xs" style="margin-top: 20%;"></div>
                <div class="col-md-6" align="left"><a href="<c:url value="/login.jsp" />"><font color="red">sign in</font></a></div> 
                <div class="col-md-6" align="right"><a href="/LetsGo/"><font color="green">come to site</font></a></div>
            </div>		
        </div>
        <script src="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/js/jquery.js'/>"></script>
        <script src="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/js/bootstrap.js'/>"></script>
    </body>
</html>
