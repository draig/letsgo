<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">LetsGO</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active">
                    <a href="/LetsGo/popularC"><spring:message code="label.pop" /></a>
                </li>
                <li>
                    <a href="/LetsGo/myeventC"><spring:message code="label.my" /></a>
                </li>
                <li>
                    <a href="/LetsGo/searchC"><spring:message code="label.search" /></a>
                </li>
                <li>
                    <a href="/LetsGo/myeventC"><spring:message code="label.add" /></a>
                </li>
            </ul>

            <ul class="nav navbar-nav navbar-right">


                <!-- Eсли зарегистрирован -->
                <sec:authorize url="/user+admin">
                    <c:set var="username">
                        <sec:authentication property="principal.username" /> 
                    </c:set>
                    <c:set var="user_id">
                        <sec:authentication property="principal.id" /> 
                    </c:set>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            ${username}
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="/LetsGo/profile/${user_id}">Profile</a>
                            </li>
                            <li>
                                <a href="/LetsGo/settings/${user_id}">Settings</a>
                            </li>
                            <sec:authorize url="/admin">
                            <li>
                                <a href="usermanagerC">/LetsGo/UsersManager</a>
                            </li>
                            </sec:authorize>
                            <li>
                                <a href="<c:url value="/logout" />">
                                    <spring:message code="label.logout" />
                                </a>
                            </li>
                        </ul>
                    </li>

                </ul>
            </sec:authorize>
            <sec:authorize url="/anonymous">
                <ul class="nav navbar-nav" style="float:right;">
                    <li>
                        <a href="<c:url value="/login.jsp" />">
                            <spring:message code="label.login" />
                       </a>
                    </li>           
                    <li>
                       <a href="registrationC">
                            <spring:message code="label.reg" />
                       </a>
                    </li>
                </ul>
            </sec:authorize>
        </div>
        <!--/.navbar-collapse -->
    </div>
</div>