package com.mycompany.example.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="classifier")
public class Classifier implements Serializable  {

    private Long classifierId;
    //private Region region;
    //private Age age;
    //private Sex sex ;
    private Category category ;
    //private Price price ;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return classifierId;
    }
    
    public void setId(Long classifierId) {
        this.classifierId = classifierId;
    }
    
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id")
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "age_id")
    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sex_id")
    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }*/

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "price_id")
    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }*/

}

