package com.mycompany.example.dao;

import com.mycompany.example.models.Classifier;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassifierDAOImpl implements ClassifierDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addClassifier ( Classifier classifier) {
        sessionFactory.getCurrentSession().save(classifier);
    }

    @Override
    public void removeClassifier (Integer id) {
        Classifier classifier = (Classifier) sessionFactory.getCurrentSession().load(
                Classifier.class, new Long ( id ));
        if (null != classifier) {
            sessionFactory.getCurrentSession().delete(classifier);
        }
    }
    
    @Override
    public void updateClassifier ( Classifier classifier ){
        sessionFactory.getCurrentSession().update(classifier);
    }
    
    
    @Override
    public Classifier getClassifierById ( Integer id ) {
        List<Classifier> auser = sessionFactory.getCurrentSession().createCriteria(Classifier.class).add(Restrictions.eq("id", new Long ( id ) )).setMaxResults(1).list() ;
         if ( auser.isEmpty() ) {
            return null ;
        }
         return auser.get(0) ;
    }
}
