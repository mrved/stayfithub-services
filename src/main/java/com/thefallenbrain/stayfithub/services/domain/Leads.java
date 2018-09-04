package com.thefallenbrain.stayfithub.services.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
public class Leads {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Email
    private String email;

    private String phone;

    private String address;

    private Date enquiryDate;

    private String status;

    @ManyToOne
    private FitnessCenter fitnessCenter;

    @OneToOne
    private User userIfConverted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEnquiryDate() {
        return enquiryDate;
    }

    public void setEnquiryDate(Date enquiryDate) {
        this.enquiryDate = enquiryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FitnessCenter getFitnessCenter() {
        return fitnessCenter;
    }

    public void setFitnessCenter(FitnessCenter fitnessCenter) {
        this.fitnessCenter = fitnessCenter;
    }

    public User getUserIfConverted() {
        return userIfConverted;
    }

    public void setUserIfConverted(User userIfConverted) {
        this.userIfConverted = userIfConverted;
    }
}
