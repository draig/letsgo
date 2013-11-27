<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row">
    <div class="col-sm-10 col-sm-offset-1" style="padding-top: 1%;">
        <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-header-navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><spring:message code="label.sitetitle"/></a>
            </div>
            <div class="collapse navbar-collapse" id="bs-header-navbar-collapse">
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">Search</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <sec:authorize url="/user+admin">
                        <li><a href="<c:url value="/logout" />"><span class="glyphicon glyphicon-log-out"></span>  <strong><spring:message code="label.logout" /></strong></a></li>
                    </sec:authorize>
                    <sec:authorize url="/anonymous">
                        <li><a href="<c:url value="/login.jsp" />"><span class="glyphicon glyphicon-log-in"></span>  <strong><spring:message code="label.login" /></strong></a></li>
                    </sec:authorize>

                </ul>
            </div>
        </nav>
    </div>
</div>