package com.example.water_equipment_rental_2022.mapper;

import com.example.water_equipment_rental_2022.DTO.EquipmentDto;
import com.example.water_equipment_rental_2022.entity.Equipment;

import java.util.ArrayList;
import java.util.List;

public class EquipmentMapper {

    public static Equipment map(EquipmentDto equipmentDto){
        Equipment equipment=new Equipment();
        equipment.setIdEquipment(equipmentDto.getId());
        equipment.setType(equipmentDto.getType());
        equipment.setSerialNumber(equipmentDto.getSerialNumber());
        equipment.setHourPrice(equipmentDto.getHourPrice());
        equipment.setDayPrice(equipmentDto.getDayPrice());
        return equipment;
    }


    public static EquipmentDto map(Equipment equipment){
        EquipmentDto equipmentDto=new EquipmentDto();
        equipmentDto.setId(equipment.getIdEquipment());
        equipmentDto.setType(equipment.getType());
        equipmentDto.setSerialNumber(equipment.getSerialNumber());
        equipmentDto.setHourPrice(equipment.getHourPrice());
        equipmentDto.setDayPrice(equipment.getDayPrice());
        return equipmentDto;
    }

    public static List<EquipmentDto>map(List<Equipment>equipment){
        List<EquipmentDto>equipmentDtoList=new ArrayList<>();
        equipment.forEach(c->equipmentDtoList.add(map(c)));
        return equipmentDtoList;
    }
}
