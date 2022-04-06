package com.example.water_equipment_rental_2022.DTO;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
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

    public List<InformationDto> getInformationDtoList() {
        return informationDtoList;
    }


    public UserDto(Long id, String firstName, String name, String personalId, String phoneNumber,
                   String email, String password,
                   List<EquipmentDto> equipmentDtoList, List<InformationDto> informationDtoList) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.personalId = personalId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.equipmentDtoList = equipmentDtoList;
        this.informationDtoList = informationDtoList;
    }

    public UserDto() {
    }

    public UserDto(String firstName, String name, String email, String password) {
        this.firstName = firstName;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}