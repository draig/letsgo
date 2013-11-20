package com.mycompany.example.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="category")
public class Category implements Serializable {
    private Integer categoryId;
    private Boolean entertainment ;
    private Boolean informative ;
    private Boolean business ;
    private Boolean sports ;
    private Boolean professional ;
    private Boolean training ;
    private Boolean other ;
    
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "entertainment")
    public Boolean getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(Boolean entertainment) {
        this.entertainment = entertainment;
    }

    @Column(name = "informative")
    public Boolean getInformative() {
        return informative;
    }

    public void setInformative(Boolean informative) {
        this.informative = informative;
    }

    @Column(name = "business")
    public Boolean getBusiness() {
        return business;
    }

    public void setBusiness(Boolean business) {
        this.business = business;
    }

    @Column(name = "sports")
    public Boolean getSports() {
        return sports;
    }

    public void setSports(Boolean sports) {
        this.sports = sports;
    }

    @Column(name = "professional")
    public Boolean getProfessional() {
        return professional;
    }

    public void setProfessional(Boolean professional) {
        this.professional = professional;
    }

    @Column(name = "training")
    public Boolean getTraining() {
        return training;
    }

    public void setTraining(Boolean training) {
        this.training = training;
    }

    @Column(name = "other")
    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }
    
    static public Category defaultCategory () {
        Category category = new Category () ;
        category.setBusiness(Boolean.TRUE);
        category.setEntertainment(Boolean.TRUE);
        category.setInformative(Boolean.TRUE);
        category.setOther(Boolean.TRUE);
        category.setProfessional(Boolean.TRUE);
        category.setSports(Boolean.TRUE);
        category.setTraining(Boolean.TRUE);
        return category ;
    }
}
