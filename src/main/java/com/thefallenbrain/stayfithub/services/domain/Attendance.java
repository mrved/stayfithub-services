package com.thefallenbrain.stayfithub.services.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Past;
import java.util.Date;

@Entity
public class Attendance {
    @Id
    @GeneratedValue
    private int id;

    @Past
    private Date timestamp;

    @ManyToOne
    private User user;
}
