package com.example.water_equipment_rental_2022.mapper;

import com.example.water_equipment_rental_2022.DTO.EquipmentDto;
import com.example.water_equipment_rental_2022.DTO.InformationDto;
import com.example.water_equipment_rental_2022.DTO.UserDto;
import com.example.water_equipment_rental_2022.entity.Information;
import com.example.water_equipment_rental_2022.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    public static User map(UserDto userDto){
        User user=new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setName(userDto.getName());
        user.setPersonalId(userDto.getPersonalId());
        user.setPhoneNumber(userDto.getPhoneNumber());
        return user;
    }

    public static UserDto map(User user){
        UserDto userDto=new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setName(user.getName());
        userDto.setPersonalId(user.getPersonalId());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setInformationDtoList(InformationMapper.map(user.getInformationList()));
        userDto.setEquipmentDtoList(EquipmentMapper.map(user.getEquipmentList()));
        return userDto;


        }
    }




