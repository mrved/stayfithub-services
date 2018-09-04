package com.thefallenbrain.stayfithub.services.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Promotion {
    @Id
    @GeneratedValue
    private int id;

    private String code;

    private Date startDate;

    private Date endDate;

    @ManyToMany
    private List<FitnessCenter> fitnessCenter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<FitnessCenter> getFitnessCenter() {
        return fitnessCenter;
    }

    public void setFitnessCenter(List<FitnessCenter> fitnessCenter) {
        this.fitnessCenter = fitnessCenter;
    }
}
