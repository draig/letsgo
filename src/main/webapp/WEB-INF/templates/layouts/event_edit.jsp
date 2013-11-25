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
        <!-- Bootstrap -->
        <link href="bootstrap-3.0.2-dist/dist/css/cerulean-bootstrap.css" rel="stylesheet">
        <script type="text/javascript">
            $(function () {
                $('#eventTab a:last').tab('show')
            })

        </script>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="conteiner">
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3" style="padding-top: 1%;">
                    <div class="row">
                        <ul class="nav nav-tabs" id="eventTab" >
                            <li class="active" ><a href="#" style="color: #39A8E8;" >Information</a></li>
                            <li><a href="#" style="color: #000000;" >Members</a></li>
                            <li><a href="#" style="color: #000000;" >Links</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3" style="background-color: #F7F7F7;padding-top: 2%;">
                    <form:form class="form-horizontal" role="form" method="POST" action="save" commandName="event" >
                        <form:hidden path="eventId" value="${event.eventId}" />
                        <div class="form-group">
                            <label for="inputName" class="col-sm-3 control-label">Name</label>
                            <div class="col-sm-8">
                                <form:input type="text" path="eventName" class="form-control" id="inputName" placeholder="Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="EventLink" class="col-sm-3 control-label">Event link</label>
                            <div class="input-group col-sm-8">
                                <span class="input-group-addon"><strong>letsgo.com/event/</strong></span>
                                <form:input type="text" path="eventLink" class="form-control" id="EventLink" />
                            </div>

                        </div>
                        <div class="form-group">
                            <label for="inputDiscription" class="col-sm-3 control-label">Event description</label>
                            <div class="col-sm-8">
                                <form:textarea class="form-control" path="description" id="inputDiscription" rows="4" style="resize: vertical; overflow: auto;" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-4 col-sm-4">
                                <button type="submit" class="btn btn-primary btn-lg active">Save</button>
                            </div>  
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://code.jquery.com/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="bootstrap-3.0.2-dist/dist/js/bootstrap.min.js"></script>
    </body>
</html>