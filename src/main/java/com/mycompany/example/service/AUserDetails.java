package com.mycompany.example.service;

import com.mycompany.example.models.AUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AUserDetails implements UserDetails {
    private AUser auser ;
    
    public AUserDetails ( AUser auser ) {
        this.auser = auser ;
    }
    
    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        Collection<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
        Collections.addAll(auth, auser.getGrantedAuthority() );
        return auth;
    }
    
    @Override
    public String getUsername() {
        return auser.getUsername() ;
    }
    
    @Override
    public String getPassword() {
        return auser.getPassword();
    }
    
    public Long getId () {
        return auser.getId() ;
    }
}
