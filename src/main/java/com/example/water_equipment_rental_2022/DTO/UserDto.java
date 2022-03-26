package com.example.water_equipment_rental_2022.DTO;

import com.example.water_equipment_rental_2022.entity.Equipment;

import java.util.List;

public class UserDto {

    private Long id;
    private String firstName;
    private String name;
    private String personalId;
    private String phoneNumber;
    private List<EquipmentDto>equipmentDtoList;
    private List<InformationDto>informationDtoList;

    public List<InformationDto> getInformationDtoList() {
        return informationDtoList;
    }

    public void setInformationDtoList(List<InformationDto> informationDtoList) {
        this.informationDtoList = informationDtoList;
    }

    public List<EquipmentDto> getEquipmentDtoList() {
        return equipmentDtoList;
    }

    public void setEquipmentDtoList(List<EquipmentDto> equipmentDtoList) {
        this.equipmentDtoList = equipmentDtoList;
    }

    public UserDto(Long id, String firstName, String name, String personalId, String phoneNumber,
                   List<EquipmentDto> equipmentDtoList, List<InformationDto> informationDtoList) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.personalId = personalId;
        this.phoneNumber = phoneNumber;
        this.equipmentDtoList = equipmentDtoList;
        this.informationDtoList = informationDtoList;
    }

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
