package com.example.water_equipment_rental_2022.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InformationDto {

    private Long id;
    private LocalDate informationDate;
    private LocalDate validUntil;
    private String informationMessage;



}
