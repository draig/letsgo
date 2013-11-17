package com.mycompany.example.service;

import com.mycompany.example.dao.NotAuthorizedUserDAO;
import com.mycompany.example.models.NotAuthorizedUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class NotAuthorizedUserServiceImpl implements NotAuthorizedUserService {
 
    @Autowired
    private NotAuthorizedUserDAO contactDAO;
 
    @Transactional
    @Override
    public void addNotAuthorizedUser (NotAuthorizedUser nuser) {
        contactDAO.addNotAuthorizedUser(nuser);
    }
 
    @Transactional
    @Override
    public List<NotAuthorizedUser> listNotAuthorizedUser() {
        return contactDAO.listNotAuthorizedUser();
    }
 
    @Transactional
    @Override
    public void removeNotAuthorizedUser (Integer id) {
        contactDAO.removeNotAuthorizedUser(id);
    }
    
    @Transactional
    @Override
    public NotAuthorizedUser getNotAuthorizedUserByHash ( String hash ){
        return contactDAO.getNotAuthorizedUserByHash(hash) ;
    }
    
    @Transactional
    @Override
    public NotAuthorizedUser getNotAuthorizedUserByEmail ( String email ) {
        return contactDAO.getNotAuthorizedUserByEmail(email) ;
    }
}