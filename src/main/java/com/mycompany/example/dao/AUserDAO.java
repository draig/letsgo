package com.mycompany.example.dao;

import com.mycompany.example.models.AUser;
import java.util.List;


public interface AUserDAO {

    public void addUser ( AUser contact);

    public List<AUser> listUser();

    public void removeUser (Integer id);
    
    public void updateUser ( AUser user );
    
    public AUser getUserByLogin ( String login ) ;
    
    public AUser getUserById ( Integer id ) ;
    
    public boolean containUser ( String field , String value ) ;
}