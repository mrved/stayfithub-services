package com.thefallenbrain.stayfithub.services.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Trainer extends User{

    private Date doj;

    @ManyToOne
    private HeadTrainer headTrainer;

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public HeadTrainer getHeadTrainer() {
        return headTrainer;
    }

    public void setHeadTrainer(HeadTrainer headTrainer) {
        this.headTrainer = headTrainer;
    }
}
