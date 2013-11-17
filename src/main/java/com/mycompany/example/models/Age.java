package com.mycompany.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="age")
public class Age {
    private Integer ageId;
    private Byte fromYear ;
    private Byte toYear ;

    @Id
    @GeneratedValue
    @Column(name = "age_id")
    public Integer getAgeId() {
        return ageId;
    }

    public void setAgeId(Integer ageId) {
        this.ageId = ageId;
    }

    @Column(name = "from_year")
    public Byte getFromYear() {
        return fromYear;
    }

    public void setFromYear(Byte fromYear) {
        this.fromYear = fromYear;
    }

    @Column(name = "to_year")
    public Byte getToYear() {
        return toYear;
    }

    public void setToYear(Byte toYear) {
        this.toYear = toYear;
    }
}
