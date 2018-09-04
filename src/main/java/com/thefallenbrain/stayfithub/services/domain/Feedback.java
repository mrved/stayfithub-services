package com.thefallenbrain.stayfithub.services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Feedback {
    @Id
    @GeneratedValue
    private int id;

    private String description;

    private Date timestamp;

    @ManyToOne
    private Member givenBy;

    @ManyToOne
    private FitnessCenter fitnessCenter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Member getGivenBy() {
        return givenBy;
    }

    public void setGivenBy(Member givenBy) {
        this.givenBy = givenBy;
    }

    public FitnessCenter getFitnessCenter() {
        return fitnessCenter;
    }

    public void setFitnessCenter(FitnessCenter fitnessCenter) {
        this.fitnessCenter = fitnessCenter;
    }
}
