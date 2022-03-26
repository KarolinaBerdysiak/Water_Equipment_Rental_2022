package com.example.water_equipment_rental_2022.mapper;

import com.example.water_equipment_rental_2022.DTO.EquipmentDto;
import com.example.water_equipment_rental_2022.entity.Equipment;

import java.util.ArrayList;
import java.util.List;

public class EquipmentMapper {

    public static Equipment map(EquipmentDto equipmentDto){
        Equipment equipment=new Equipment();
        equipment.setId_equipment(equipmentDto.getId());
        equipment.setType(equipmentDto.getType());
        equipment.setSerial_number(equipmentDto.getSerialNumber());
        equipment.setHour_price(equipmentDto.getHourPrice());
        equipment.setDay_price(equipmentDto.getDayPrice());
        return equipment;
    }

    public static EquipmentDto map(Equipment equipment){
        EquipmentDto equipmentDto=new EquipmentDto();
        equipmentDto.setId(equipment.getId_equipment());
        equipmentDto.setType(equipment.getType());
        equipmentDto.setSerialNumber(equipment.getSerial_number());
        equipmentDto.setHourPrice(equipment.getHour_price());
        equipmentDto.setDayPrice(equipment.getDay_price());
        return equipmentDto;
    }

    public static List<EquipmentDto>map(List<Equipment>equipment){
        List<EquipmentDto>equipmentDtoList=new ArrayList<>();
        equipment.forEach(c->equipmentDtoList.add(map(c)));
        return equipmentDtoList;
    }
}
