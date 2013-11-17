<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="bs-example">
<c:if test="${!empty auserList}">
	<table class="table table-striped table-bordered table-hover">
            <thead>
		<tr>
			<th><spring:message code="label.username" /></th>
			<th><spring:message code="label.email" /></th>
			<th><spring:message code="label.password" /></th>
                        <th><spring:message code="label.role" /></th>
			<th><spring:message code="label.change" /></th>
                        <th><spring:message code="label.delete" /></th>
		</tr>
            </thead>
            <tbody>
		<c:forEach var="auser" items="${auserList}" >
			<tr>
				<td>${auser.username}</td>
                                <td>${auser.email}</td>
				<td>${auser.password}</td>
				<td>${auser.grantedAuthority}</td>
                                <td>
                                    <form action="change/${auser.id}">
                                        <button class="btn btn-primary" ><spring:message code="label.change" /></button>
                                    </form>
                                </td>
				<td>
                                    <form action="delete/${auser.id}">
                                        <button class="btn btn-danger" ><spring:message code="label.delete" /></button>
                                    </form>
                                </td>
			</tr>
		</c:forEach>
            </tbody>
	</table>
</c:if>
</div>