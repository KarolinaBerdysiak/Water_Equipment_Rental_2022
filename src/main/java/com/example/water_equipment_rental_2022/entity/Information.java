package com.example.water_equipment_rental_2022.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_information;

    private LocalDate informationDate;
    private LocalDate validUntil;
    private String informationMessage;

@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST})
@JoinColumn(name = "id_user")
    private User userInformation;

    public User getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(User userInformation) {
        this.userInformation = userInformation;
    }

    public Information() {
    }

    public Information(LocalDate informationDate, LocalDate validUntil, String informationMessage) {
        this.informationDate = informationDate;
        this.validUntil = validUntil;
        this.informationMessage = informationMessage;
    }

    public Long getId_information() {
        return id_information;
    }

    public void setId_information(Long id_information) {
        this.id_information = id_information;
    }

    public LocalDate getInformationDate() {
        return informationDate;
    }

    public void setInformationDate(LocalDate informationDate) {
        this.informationDate = informationDate;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public String getInformationMessage() {
        return informationMessage;
    }

    public void setInformationMessage(String informationMessage) {
        this.informationMessage = informationMessage;
    }
}
