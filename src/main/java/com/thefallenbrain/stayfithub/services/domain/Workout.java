package com.thefallenbrain.stayfithub.services.domain;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Workout {
    @Id
    @GeneratedValue()
    private Integer id;

    private Date startDate;

    private Date endDate;

    @ManyToOne
    private User assignedByUser;

    @ManyToOne
    private User assignedForUser;

    @ManyToMany
    private List<Exercise> exercises;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public User getAssignedByUser() {
        return assignedByUser;
    }

    public void setAssignedByUser(User assignedByUser) {
        this.assignedByUser = assignedByUser;
    }

    public User getAssignedForUser() {
        return assignedForUser;
    }

    public void setAssignedForUser(User assignedForUser) {
        this.assignedForUser = assignedForUser;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
}
