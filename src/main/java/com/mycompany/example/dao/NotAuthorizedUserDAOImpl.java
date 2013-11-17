package com.mycompany.example.dao;

import com.mycompany.example.models.NotAuthorizedUser;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public  class NotAuthorizedUserDAOImpl implements NotAuthorizedUserDAO {

    @Autowired
    private SessionFactory sessionFactory;
     
    @Override
    public void addNotAuthorizedUser ( NotAuthorizedUser nauser ) {
        sessionFactory.getCurrentSession().save(nauser);
    }

    @Override
    public void removeNotAuthorizedUser (Integer id) {
        NotAuthorizedUser user = (NotAuthorizedUser) sessionFactory.getCurrentSession().load(
                NotAuthorizedUser.class, new Long ( id ));
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }
    }
    
    @Override
    public NotAuthorizedUser getNotAuthorizedUserByHash ( String hash ) {
        List<NotAuthorizedUser> auser = sessionFactory.getCurrentSession().createCriteria(NotAuthorizedUser.class).add( Restrictions.eq("hash", hash ) ).list () ;
        if ( auser.size() != 1 ) {
            return null ;
        }
        return auser.get(0) ;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<NotAuthorizedUser> listNotAuthorizedUser() {
        return sessionFactory.getCurrentSession().createQuery("from NAUser")
            .list();
    }
    
    @Override
     public NotAuthorizedUser getNotAuthorizedUserByEmail ( String email ) {
        List<NotAuthorizedUser> auser = sessionFactory.getCurrentSession().createCriteria(NotAuthorizedUser.class).add( Restrictions.eq("email", email ) ).list () ;
        if ( auser.size() != 1 ) {
            return null ;
        }
        return auser.get(0) ;
     }
    
}