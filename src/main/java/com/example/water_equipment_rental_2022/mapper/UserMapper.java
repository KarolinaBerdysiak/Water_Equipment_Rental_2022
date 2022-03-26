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
        user.setId_user(userDto.getId());
        user.setFirst_name(userDto.getFirstName());
        user.setName(userDto.getName());
        user.setPersonal_id(userDto.getPersonalId());
        user.setPhone_number(userDto.getPhoneNumber());
        return user;
    }

    public static UserDto map(User user){
        UserDto userDto=new UserDto();
        userDto.setId(user.getId_user());
        userDto.setFirstName(user.getFirst_name());
        userDto.setName(user.getName());
        userDto.setPersonalId(user.getPersonal_id());
        userDto.setPhoneNumber(user.getPhone_number());
        userDto.setInformationDtoList(InformationMapper.map(user.getInformationList()));
        userDto.setEquipmentDtoList(EquipmentMapper.map(user.getEquipmentList()));
        return userDto;


        }
    }




