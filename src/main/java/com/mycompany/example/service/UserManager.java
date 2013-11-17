package com.mycompany.example.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mycompany.example.models.AUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserManager {
        @Autowired
	private AUserService auserService ;
        
	public AUser getUserByEmail (String email ) throws UsernameNotFoundException{
		if( !auserService.containUser( "email" , email ) ){
			throw new UsernameNotFoundException( "user with that email (" + email + ") not found" );
		}
		return auserService.getUserByLogin(email) ;		
	}
        
        public AUserDetails getUserDetailsByEmail (String email ) throws UsernameNotFoundException{
            AUserDetails auserdetails = new AUserDetails ( getUserByEmail ( email ) ) ;
            return auserdetails ;
        }
        
        public List <AUser> allUser () {
             return auserService.listUser() ;
        }
        
        public AUser getUserById ( Integer id ) {
            return auserService.getUserById(id) ;
        }
        
        public void updateUser ( AUser user ) {
            auserService.updateUser(user);
        }
}
