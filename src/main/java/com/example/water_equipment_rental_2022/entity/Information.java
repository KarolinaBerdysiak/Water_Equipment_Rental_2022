package com.example.water_equipment_rental_2022.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_information;

    private LocalDate informationDate;
    private LocalDate validUntil;
    private String informationMessage;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "id_user")
    private User userInformation;


    public Information() {
    }

    public Information(LocalDate informationDate, LocalDate validUntil, String informationMessage) {
        this.informationDate = informationDate;
        this.validUntil = validUntil;
        this.informationMessage = informationMessage;
    }

}