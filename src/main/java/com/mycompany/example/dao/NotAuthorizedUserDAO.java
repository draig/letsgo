package com.mycompany.example.dao;

import com.mycompany.example.models.NotAuthorizedUser;
import java.util.List;


public interface NotAuthorizedUserDAO {

    public void addNotAuthorizedUser ( NotAuthorizedUser nauser );

    public void removeNotAuthorizedUser (Integer id);
    
    public List<NotAuthorizedUser> listNotAuthorizedUser ( ) ;
    
    public NotAuthorizedUser getNotAuthorizedUserByHash ( String hash ) ;
    
    public NotAuthorizedUser getNotAuthorizedUserByEmail ( String email ) ;
    
}