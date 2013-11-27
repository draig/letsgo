<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="padding-top: 1%;">
    <c:forEach items="${eventList}" var="event" >
        <div class="row">
            <div class="well well-sm"> 
                <div class="caption" style="font-size: xx-large;">
                    <a href="/LetsGo/event/${event.eventLink}">${event.eventName}</a>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <span style="margin:2%;">
                            <span class="glyphicon glyphicon-user"></span>
                            36
                        </span>
                        <span style="margin:2%;">
                            <span class="glyphicon glyphicon-euro"></span>
                            free
                        </span>
                        <span style="margin:2%;">
                            <span class="glyphicon glyphicon-time"></span>
                            15:00
                        </span>
                        <span style="margin:2%;">
                            <span class="glyphicon glyphicon-calendar"></span>
                            29.01.13
                        </span>
                    </div>
                </div>
                <div class="row" style="padding-top:1%;">
                    <div class="col-md-12">
                        <span style="border-style:solid;border-color:#FFFFFF;margin:1%;">
                            <a href="#" >footbal</a>
                        </span>
                        <span style="border-style:solid;border-color:#FFFFFF;margin:1%;">
                            <a href="#" >sport</a>
                        </span>
                        <span style="border-style:solid;border-color:#FFFFFF;margin:1%;">
                            <a href="#" >4school</a>
                        </span>
                        <span style="border-style:solid;border-color:#FFFFFF;margin:1%;">
                            <a href="#" >andrew voronov</a>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
    <c:choose>
        <c:when test="${endpage - startpage ge 3}">
            <div class="row">
                <div class="col-md-12" align="center" >
                    <ul class="pagination">  
                        <c:if test="${startpage le 1}">
                            <li class="disabled"><a href="${startpage - 1}">&laquo;</a></li>
                            <li class="active"><a href="${startpage}">${startpage}</a></li>
                            <li><a href="${startpage + 1}">${startpage + 1}</a></li>
                            <li><a href="${startpage + 2}">${startpage + 2}</a></li>
                        </c:if>
                        <c:if test="${startpage gt 1}">
                            <li><a href="${startpage - 1}">&laquo;</a></li>
                            <li><a href="${startpage - 1}">${startpage - 1}</a></li>
                            <li class="active"><a href="${startpage}">${startpage}</a></li>
                            <li><a href="${startpage + 1}">${startpage + 1}</a></li>
                        </c:if>
                        <c:if test="${endpage ne 4}">
                            <li><a href="#">...</a></li>
                        </c:if>
                        <li><a href="${endpage}">${endpage}</a></li>
                        <li><a href="${startpage + 1}">&raquo;</a></li>
                    </ul>
                </div>
            </div>  
        </c:when>
        <c:when test="${endpage - startpage lt 3}">
            <c:if test="${endpage le 4}">
                <div class="row">
                    <div class="col-md-12" align="center" >
                        <ul class="pagination">
                            <li <c:if test="${startpage le 1}"> class="disabled" </c:if>><a href="${startpage - 1}">&laquo;</a></li>
                            <c:forEach begin="1" end="${endpage}" var="position">
                                <li <c:if test="${startpage eq position}"> class="active" </c:if>><a href="${position}" >${position}</a></li>
                            </c:forEach>
                            <li <c:if test="${startpage eq endpage}"> class="disabled" </c:if>><a href="${startpage + 1}">&raquo;</a></li>
                            </ul>
                        </div>
                    </div>
            </c:if>
            <c:if test="${endpage gt 4}">
                <div class="row">
                    <div class="col-md-12" align="center" >
                        <ul class="pagination">
                            <li><a href="${startpage - 1}">&laquo;</a></li>
                            <c:forEach begin="${endpage - 4}" end="${endpage}" var="position">
                                <li <c:if test="${startpage eq position}"> class="active" </c:if>><a href="${position}" >${position}</a></li>
                            </c:forEach>
                            <li <c:if test="${startpage eq endpage}"> class="disabled" </c:if>><a href="${startpage + 1}">&raquo;</a></li>
                            </ul>
                        </div>
                    </div>
            </c:if>
        </c:when>
    </c:choose>
</div>

