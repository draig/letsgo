package com.mycompany.example.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="price")
public class Price implements Serializable {
    private Integer priceId;
    private Integer minCost ;
    private Integer maxCost ;

    @Id
    @GeneratedValue
    @Column(name = "price_id")
    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }
    
    @Column(name = "min_cost")
    public Integer getMinCost() {
        return minCost;
    }

    public void setMinCost(Integer minCost) {
        this.minCost = minCost;
    }

    @Column(name = "max_cost")
    public Integer getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(Integer maxCost) {
        this.maxCost = maxCost;
    }
    
}
