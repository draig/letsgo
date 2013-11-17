package com.mycompany.example.models;

import java.util.Collection;
import java.util.HashSet;
import java.io.Serializable;
import java.util.Collections;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table (name="ausers")
public class AUser implements Serializable  {

    private Long id;
    private String username;
    private String password;
    private String email ;
    private Role grantedAuthority;
    private Classifier classifier ;
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
       }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(name = "password")
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
    public Role getGrantedAuthority()
    {
        return this.grantedAuthority;
    }

    public void setGrantedAuthority(Role grantedAuthority)
    {
        this.grantedAuthority=grantedAuthority;
    }
    
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classifier_id")
    public Classifier getClassifier()
    {
        return this.classifier;
    }

    public void setClassifier(Classifier classifier)
    {
        this.classifier=classifier;
    }
}

