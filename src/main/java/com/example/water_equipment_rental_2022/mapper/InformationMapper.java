package com.example.water_equipment_rental_2022.mapper;

import com.example.water_equipment_rental_2022.DTO.InformationDto;
import com.example.water_equipment_rental_2022.entity.Information;

import java.util.ArrayList;
import java.util.List;

public class InformationMapper {

    public static Information map(InformationDto informationDto){
        Information information=new Information();
        information.setId_information(informationDto.getId());
        information.setInformationDate(informationDto.getInformationDate());
        information.setValidUntil(informationDto.getValidUntil());
        information.setInformationMessage(informationDto.getInformationMessage());
        return information;
    }

    public static InformationDto map(Information information) {
        InformationDto informationDto = new InformationDto();
        informationDto.setId(information.getId_information());
        informationDto.setInformationDate(information.getInformationDate());
        informationDto.setValidUntil(information.getValidUntil());
        informationDto.setInformationMessage(information.getInformationMessage());
        return informationDto;
    }
    public static List<InformationDto> map(List<Information>informationList){
        List<InformationDto>informationDtoList=new ArrayList<>();
        informationList.forEach(c->informationDtoList.add(map(c)));
        return informationDtoList;
    }
}
