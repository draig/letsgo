package com.mycompany.example.dao;

import com.mycompany.example.models.AUser;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public  class AUserDAOImpl implements AUserDAO {

    @Autowired
    private SessionFactory sessionFactory;
     
    @Override
    public void addUser ( AUser user ) {
        sessionFactory.getCurrentSession().save(user);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<AUser> listUser() {
        return sessionFactory.getCurrentSession().createQuery("from AUser")
            .list();
    }

    @Override
    public void removeUser (Integer id) {
        AUser user = (AUser) sessionFactory.getCurrentSession().load(
                AUser.class, new Long ( id ));
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }
    }
    
    @Override
    public void updateUser ( AUser user ) {
        sessionFactory.getCurrentSession().update(user);
    }
    
    @Override
    public AUser getUserByLogin ( String email ) {
        List<AUser> auser = sessionFactory.getCurrentSession().createCriteria(AUser.class).add( Restrictions.eq("email", email ) ).list () ;
        if ( auser.size() != 1 ) {
            return null ;
        }
        return auser.get(0) ;
    }
    
    @Override
     public AUser getUserById ( Integer id ) {
         List<AUser> auser = sessionFactory.getCurrentSession().createCriteria(AUser.class).add(Restrictions.eq("id", new Long ( id ) )).setMaxResults(1).list() ;
         if ( auser.isEmpty() ) {
            return null ;
        }
         return auser.get(0) ;
     }
    
    @Override
    public boolean containUser ( String field , String value ) {
        List<AUser> auser = sessionFactory.getCurrentSession().createCriteria(AUser.class).add( Restrictions.eq( field , value ) ).setMaxResults(1).list() ;
        if ( auser.isEmpty() ) {
            return false ;
        }
        return true ;
    }
}