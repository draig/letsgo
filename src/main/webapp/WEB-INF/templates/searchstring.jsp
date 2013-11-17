<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div style="margin-top: 2%; margin-bottom: 2%" align="center">
      <form class="navbar-form">
        <div class="form-group">
          <input class="form-control" size="50" type="text">
        </div>
        <button type="submit" class="btn btn-success"><spring:message code="label.search" /></button>
      </form>
</div>
