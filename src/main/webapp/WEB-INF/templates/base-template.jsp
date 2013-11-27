<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <title> <spring:message code="label.sitetitle"/> </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link href="http://bootswatch.com/cerulean/bootstrap.css" rel="stylesheet">-->
        <link href="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/css/cerulean-bootstrap.css'/>" rel="stylesheet">
    </head>
    <body>
        <div class="conteiner">
            <div col-xm-12>
                <tiles:insertAttribute name="header" />
            </div>
            
            <div class="col-xm-12">
                <!-- advertisement banners -->
                <tiles:insertAttribute name="advertisement" />
            </div>
            <div class="row" >
                <div class="col-md-3">
                    <tiles:insertAttribute name="leftbar" />
                </div>
                <div class="col-md-6">
                    <tiles:insertAttribute name="content" />
                </div>
                <div class="col-md-3">
                    <tiles:insertAttribute name="rightbar" />
                </div>
            </div>
            <div col-xm-12>
                <tiles:insertAttribute name="footer" />
            </div>
        </div>
        <script src="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/js/jquery.js'/>"></script>
        <script src="<spring:url value='/resources/bootstrap-3.0.2-dist/dist/js/bootstrap.js'/>"></script>
    </body> 
</html>



