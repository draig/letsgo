package com.mycompany.example.service;

import com.mycompany.example.models.Event;
import java.util.List;


public interface EventService {
    public void addEvent ( Event event );

    public List<Event> listEvent();

    public void removeEvent (Integer id);
    
    public void updateEvent ( Event event );
    
    public Event getEventById ( Integer id ) ;
    
    public Event getEventByLink ( String link ) ;
    
    public long eventCount () ;
    
    public List<Event> listEvent( int start , int count );
}
