<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Sign In</title>
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js" type="text/javascript"></script>
        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js" type="text/javascript"></script>
        <style type="text/css">
            body {
                padding-top: 5%;
                padding-bottom: 40px;
                background-color: #eee;
            }

            .form-signin {
                max-width: 430px;
                margin: 0 auto;
            }
            .form-signin .form-signin-heading,
            .form-signin .checkbox {
                margin-bottom: 2%;
            }
            .form-signin .checkbox {
                font-weight: normal;
            }
            .form-signin .form-control {
                position: relative;
                font-size: 200%;
                height: auto;
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
            }
            .form-signin .form-control:focus {
                z-index: 2;
            }
            .form-signin input[type="text"] {
                margin-bottom: -1px;
                border-bottom-left-radius: 0;
                border-bottom-right-radius: 0;
            }
            .form-signin input[type="password"] {
                margin-bottom: 1%;
                border-top-left-radius: 0;
                border-top-right-radius: 0;
            }
            span.error {
                    color: red;
            }

        </style>
    </head>
    <body>
        <div class="container">
            <c:if test="${not empty param.error}">
                <font color="red"> <spring:message code="label.loginerror" />
                : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message} </font>
            </c:if>
            <c:set var="nickname">
                <spring:message code='label.nickname'/>
                
            </c:set>
            <c:set var="email">
                <spring:message code='label.email' />
                
            </c:set>
            <c:set var="reg">
                <spring:message code='label.password' />
                
            </c:set>
            <form:form method="POST" action="registrateuser" commandName="nauser" class="form-signin">
                <h2 class="form-signin-heading"><spring:message code="label.login" /></h2>
                <form:input type="text" path="username" class="form-control" placeholder="${nickname}"/>
                <span class="error"><form:errors path="username" /></span>
                <form:input type="text" path="email" class="form-control" placeholder="${email}"/>
                <span class="error"><form:errors path="email" /></span>
                <form:input type="password" path="password" class="form-control" placeholder="${reg}"/>
                <span class="error"><form:errors path="password" /></span>
                <button class="btn btn-lg btn-primary btn-block" type="submit"><spring:message code="label.reg" /></button>
            </form:form>

        </div> <!-- /container -->

    </body>
</html>