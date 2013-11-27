<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="well well-sm">
    <div class="eventHeader" style="background-color: #F7F7F7;">
        <div style="font-size: xx-large;" >		
            ${event.eventName}
        </div>
        <div class="row">
            <span style="margin:2%;">
                <span class="glyphicon glyphicon-user"></span>
                36
            </span>
        </div>
        <div>		
            <span style="font-size: xx-large;">Date : </span> <span style="font-size: xx-large;">15.06.2013 </span> in  <span style="font-size: xx-large;">15:20</span>
        </div>
        <div>
            <span style="font-size: xx-large;">Cost : </span> <span style="font-size: xx-large;color:green;">Free</span>
        </div>
        <div>
            <button type="button" class="btn btn-primary"> I let Go </button>
        </div>
    </div>
</div>
<div class="discription">
    <h2>Description</h2>
    <hr>
    <div class="discriptionText">
        ${event.description}
    </div>
</div>
<div class="extraDiscription">
    <h2>Extra Information</h2>
    <hr>
    <div>
        <div class="col-sm-3">
            organizer's email :
        </div>
        <div class="col-sm-9">
            <span>andrew@yandex.ru</span> , <span>vova@google.ru</span>
        </div>
    </div>
    <div>
        <div class="col-sm-3">
            phone :
        </div>
        <div class="col-sm-9">
            <span>+37544 760 49 89</span> 
        </div>
    </div>
</div>
