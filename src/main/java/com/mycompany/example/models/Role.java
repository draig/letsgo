package com.mycompany.example.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    private Long roleId;
    private String authority;
 
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    public Long getRoleId() {
        return roleId;
    }
 
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
 
    @Column(name = "role_name")
    @Override
    public String getAuthority() {
        return authority;
    }
 
    public void setAuthority (String authority ) {
        this.authority = authority ;
    }
}