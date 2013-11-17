package com.mycompany.example.dao;

import com.mycompany.example.models.Role;
import java.util.List;


public interface RoleDAO {

    public void removeRole (Integer id);
    
    public void updateRole ( Role role );
    
    public Role getRoleById ( Integer id ) ;

}