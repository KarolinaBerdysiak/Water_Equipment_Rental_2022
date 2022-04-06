package com.example.water_equipment_rental_2022.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EquipmentDto {

    private Long id;
    private String Type;
    private String serialNumber;
    private double hourPrice;
    private double dayPrice;

    public EquipmentDto(Long id, String type, String serialNumber, double hourPrice, double dayPrice) {
        this.id = id;
        Type = type;
        this.serialNumber = serialNumber;
        this.hourPrice = hourPrice;
        this.dayPrice = dayPrice;
    }

    public EquipmentDto() {
    }

}
