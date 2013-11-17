<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta name="viewport" content="width=device-width">
        <!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
        <title>
            <tiles:getAsString name="title" />
        </title>
        <!--<link rel="stylesheet" href="/css/style.css" type="text/css"/>-->
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js" type="text/javascript"></script>
        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js" type="text/javascript"></script>
        <style type="text/css">
            body {
                padding-top: 50px;
                padding-bottom: 20px;
                padding-right: 3%;
                padding-left: 3%;
              }
        </style>
    </head>
    <body>
        <tiles:insertAttribute name="header" />
        <tiles:insertAttribute name="searchstring" />
        <tiles:insertAttribute name="content" />
        <tiles:insertAttribute name="footer" />

    </body>
</html>