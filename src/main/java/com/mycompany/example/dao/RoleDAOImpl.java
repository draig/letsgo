package com.mycompany.example.dao;

import com.mycompany.example.models.Role;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl implements RoleDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void removeRole (Integer id) {
        Role role = (Role) sessionFactory.getCurrentSession().load(
                Role.class, id);
        if (null != role) {
            sessionFactory.getCurrentSession().delete(role);
        }
    }
    
    @Override
    public void updateRole ( Role role ){
        sessionFactory.getCurrentSession().save(role);
    }
    
    @Override
    public Role getRoleById ( Integer id ) {
        return (Role) sessionFactory.getCurrentSession().load( Role.class, id);
    }

}
