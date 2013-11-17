package com.mycompany.example.models;

import java.util.HashSet;
import java.io.Serializable;
import java.util.Collections;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table (name="event")
public class Event implements Serializable  {

    private Long eventId;
    private String eventname;
    private String info;
    private String description ;
    private Set<Photo>  photo;
    private Set<Comments> comments ;
    private Set<GMap> gmap ;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getEventId() {
        return eventId;
    }
    
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    
    @JoinColumn(name = "event_name")
    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    @JoinColumn(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "photo_id")
    public Set<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(Set<Photo> photo) {
        this.photo = photo;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "comments_id")
    public Set<Comments> getComments() {
        return comments;
    }

    public void setComments(Set<Comments> comments) {
        this.comments = comments;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gmap_id")
    public Set<GMap> getGmap() {
        return gmap;
    }

    public void setGmap(Set<GMap> gmap) {
        this.gmap = gmap;
    }
}
