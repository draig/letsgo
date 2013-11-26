package com.mycompany.example.dao;

import com.mycompany.example.models.Event;
import java.util.List;


public interface EventDAO {

    public void addEvent ( Event event );

    public List<Event> listEvent();

    public void removeEvent (Integer id);
    
    public void updateEvent ( Event event );
    
    public Event getEventById ( Integer id ) ;
    
    public Event getEventByLink ( String link ) ;
    
    public long eventCount () ;
    
    public List<Event> listEvent( int start , int count );
}
