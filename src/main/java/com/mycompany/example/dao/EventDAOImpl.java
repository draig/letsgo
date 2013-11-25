package com.mycompany.example.dao;

import com.mycompany.example.models.Event;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public  class EventDAOImpl implements EventDAO {

    @Autowired
    private SessionFactory sessionFactory;
     
    @Override
    public void addEvent ( Event event ) {
        sessionFactory.getCurrentSession().save(event) ;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Event> listEvent() {
        return sessionFactory.getCurrentSession().createQuery("from Event")
            .list();
    }

    @Override
    public void removeEvent (Integer id) {
        Event event = (Event) sessionFactory.getCurrentSession().load(
                Event.class, new Long ( id ));
        if (null != event) {
            sessionFactory.getCurrentSession().delete(event);
        }
    }
    
    @Override
    public void updateEvent ( Event event ) {
        sessionFactory.getCurrentSession().update(event);
    }
    
    @Override
     public Event getEventById ( Integer id ) {
         List<Event> auser = sessionFactory.getCurrentSession().createCriteria(Event.class).add(Restrictions.eq("id", new Long ( id ) )).setMaxResults(1).list() ;
         if ( auser.isEmpty() ) {
            return null ;
        }
         return auser.get(0) ;
     }
    
    @Override
     public Event getEventByLink ( String link ) {
        List<Event> auser = sessionFactory.getCurrentSession().createCriteria(Event.class).add(Restrictions.eq("eventLink", link )).setMaxResults(1).list() ;
         if ( auser.isEmpty() ) {
            return null ;
        }
         return auser.get(0) ;
     }
}