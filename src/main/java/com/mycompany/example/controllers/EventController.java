package com.mycompany.example.controllers;

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
    
}
