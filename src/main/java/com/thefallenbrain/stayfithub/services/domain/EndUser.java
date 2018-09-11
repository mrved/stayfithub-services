package com.thefallenbrain.stayfithub.services.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Getter
@Setter
public class EndUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Size(min=2, message="Name should have atleast 2 characters")
    String name;

    @Email
    String email;

    String password;

    @Size(min=10, message="Name should have atleast 2 characters")
    String phone;

    Date dob;

    String profilePicture;

    Double height;

    Double weight;

    Double bmi;
}
