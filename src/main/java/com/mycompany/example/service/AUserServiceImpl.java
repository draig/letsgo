package com.mycompany.example.service;

import com.mycompany.example.dao.AUserDAO;
import com.mycompany.example.models.AUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class AUserServiceImpl implements AUserService {
 
    @Autowired
    private AUserDAO contactDAO;
 
    @Transactional
    @Override
    public void addUser (AUser user) {
        contactDAO.addUser(user);
    }
 
    @Transactional
    @Override
    public List<AUser> listUser() {
 
        return contactDAO.listUser();
    }
 
    @Transactional
    @Override
    public void removeUser (Integer id) {
        contactDAO.removeUser(id);
    }
    
    @Transactional
    @Override
    public boolean containUser ( String field , String value ) {
        return contactDAO.containUser(field, value) ;
    }
    
    @Transactional
    @Override
    public AUser getUserByLogin ( String login ){
        return contactDAO.getUserByLogin(login) ;
    }
    
    @Transactional
    @Override
    public void updateUser ( AUser user ){
        contactDAO.updateUser(user);
    }
    
    @Transactional
    @Override
    public AUser getUserById ( Integer id ) {
        return contactDAO.getUserById(id) ;
    }
}