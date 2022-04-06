package com.example.water_equipment_rental_2022.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class InformationDto {

    private Long id;
    private LocalDate informationDate;
    private LocalDate validUntil;
    private String informationMessage;

    public InformationDto(Long id, LocalDate informationDate, LocalDate validUntil, String informationMessage) {
        this.id = id;
        this.informationDate = informationDate;
        this.validUntil = validUntil;
        this.informationMessage = informationMessage;
    }

    public InformationDto() {
    }

}
