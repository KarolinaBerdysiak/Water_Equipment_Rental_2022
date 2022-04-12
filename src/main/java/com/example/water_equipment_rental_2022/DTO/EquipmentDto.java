package com.example.water_equipment_rental_2022.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentDto {

    private Long id;
    private String Type;
    private String serialNumber;
    private double hourPrice;
    private double dayPrice;



}
