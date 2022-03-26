package com.example.water_equipment_rental_2022.DTO;

import java.time.LocalDate;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
