package com.thefallenbrain.stayfithub.services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Exercise {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer caloriesBurn;
    private String videoLink;
    private String imageLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCaloriesBurn() {
        return caloriesBurn;
    }

    public void setCaloriesBurn(Integer caloriesBurn) {
        this.caloriesBurn = caloriesBurn;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
