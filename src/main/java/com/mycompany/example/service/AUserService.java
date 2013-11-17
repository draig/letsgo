package com.mycompany.example.service;

import com.mycompany.example.models.AUser;
import java.util.List;

public interface AUserService {

    public void addUser (AUser contact);

    public List<AUser> listUser();

    public void removeUser (Integer id);
    
    public boolean containUser ( String field , String value ) ;
    
    public AUser getUserByLogin ( String login ) ;
    
    public AUser getUserById ( Integer id ) ;
    
    public void updateUser ( AUser user );
}