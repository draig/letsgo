package com.mycompany.example.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="sex")
public class Sex implements Serializable {
    public final static Byte MALE = 1 ;
    public final static Byte FEMALE = 1 ;
    public final static Byte ANY = 3 ;
    
    private Integer sexId;
    private Byte sex ;

    @Id
    @GeneratedValue
    @Column(name = "sex_id")
    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    @Column(name = "sex")
    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }
    
}
