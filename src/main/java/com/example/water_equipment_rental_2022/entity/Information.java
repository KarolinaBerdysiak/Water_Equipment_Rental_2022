package com.example.water_equipment_rental_2022.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@AllArgsConstructor
@SequenceGenerator(name = "seq_information",sequenceName = "seq_information",allocationSize = 1)
@NoArgsConstructor
@Table
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_information")
    private Long id_information;
    private LocalDate informationDate;
    private LocalDate validUntil;
    private String informationMessage;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "id")
    private User userInformation;




    public Information(LocalDate informationDate, LocalDate validUntil, String informationMessage) {
        this.informationDate = informationDate;
        this.validUntil = validUntil;
        this.informationMessage = informationMessage;
    }

}