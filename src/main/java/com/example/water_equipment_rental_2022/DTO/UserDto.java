package com.example.water_equipment_rental_2022.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String firstName;
    private String name;
    private String personalId;
    private String phoneNumber;
    private String email;
    private String password;
    private List<EquipmentDto> equipmentDtoList;
    private List<InformationDto> informationDtoList;





    }
