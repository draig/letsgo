package com.mycompany.example.service;

import com.mycompany.example.models.NotAuthorizedUser;
import java.util.List;


public interface NotAuthorizedUserService {

    public void addNotAuthorizedUser ( NotAuthorizedUser nauser );

    public void removeNotAuthorizedUser (Integer id);
    
    public List<NotAuthorizedUser> listNotAuthorizedUser ( ) ;
    
    public NotAuthorizedUser getNotAuthorizedUserByHash ( String hash ) ;
    
    public NotAuthorizedUser getNotAuthorizedUserByEmail ( String email ) ;
}
