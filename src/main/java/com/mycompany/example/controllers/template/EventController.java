package com.mycompany.example.controllers.template;

import com.mycompany.example.models.Event;
import com.mycompany.example.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EventController {
    
    @Autowired
    private EventService eventService;
    
    private final static int viewEventsOnPage = 5 ;
    //@Secured("ROLE_USER")
    @RequestMapping(value = "/createEventC"  )
    public String createEventC( ){
        Event event = new Event () ;
        eventService.addEvent( event ) ;
        event.setEventLink(event.getEventId().toString());
        eventService.updateEvent(event);
        return "redirect:/changeEvent/"+event.getEventLink() ;
    }
    
    //@Secured("ROLE_USER")
    @RequestMapping(value = "/changeEvent/{eventId}"  )
    public String changeEventC( @PathVariable("eventId") String link , Model model ){
        model.addAttribute("event", eventService.getEventByLink(link) ) ;
        return "event_edit" ;
    }
    
    //@Secured("ROLE_USER")
    @RequestMapping(value = "/changeEvent/save" , method = RequestMethod.POST  )
    public String saveEventC( @ModelAttribute Event event ){
        eventService.updateEvent(event);
        return "redirect:/changeEvent/" + event.getEventLink() ;
    }
    
    @RequestMapping(value = "/popularC"  )
    public String popularC( Model model){
        return "redirect:/allevent/1";
    }
    
    @RequestMapping(value = "/allevent/{idPage}"  )
    public String showListEvent ( @PathVariable("idPage") int pageNum , Model model ) {
        long eventCount = eventService.eventCount();
        long pageCount = eventCount/viewEventsOnPage + (eventCount%viewEventsOnPage==0?0:1) ;
        model.addAttribute("startpage", pageNum ) ;
        model.addAttribute("endpage", pageCount  ) ;
        model.addAttribute( "eventList" , eventService
                .listEvent( (pageNum - 1 ) * viewEventsOnPage , viewEventsOnPage )) ;
        return "event_list" ;
    }
    
    @RequestMapping(value = "/event/{link}"  )
    public String showEvent ( @PathVariable("link") String link , Model model ) {
        Event event = eventService.getEventByLink(link) ;
        model.addAttribute("event", event  ) ;
        return "event_show" ;
    }
}
