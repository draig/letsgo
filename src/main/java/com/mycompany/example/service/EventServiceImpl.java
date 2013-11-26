package com.mycompany.example.service;

import com.mycompany.example.dao.EventDAO;
import com.mycompany.example.models.Event;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventServiceImpl implements EventService {
    
    @Autowired
    private EventDAO contactDAO;
 
    @Transactional
    @Override
    public void addEvent (Event event) {
        contactDAO.addEvent(event);
    }
 
    @Transactional
    @Override
    public List<Event> listEvent() {
        return contactDAO.listEvent();
    }
 
    @Transactional
    @Override
    public void removeEvent (Integer id) {
        contactDAO.removeEvent(id);
    }
    
    
    @Transactional
    @Override
    public void updateEvent ( Event event ){
        contactDAO.updateEvent(event);
    }
    
    @Transactional
    @Override
    public Event getEventById ( Integer id ) {
        return contactDAO.getEventById(id) ;
    }
    
    @Transactional
    @Override
    public Event getEventByLink ( String link ) {
        return contactDAO.getEventByLink(link) ;
    }
    
    @Transactional
    @Override
    public long eventCount () {
        return contactDAO.eventCount() ;
    }
    
    @Transactional
    @Override
    public List<Event> listEvent( int start , int count ){
        return contactDAO.listEvent(start, count) ;
    }
}
