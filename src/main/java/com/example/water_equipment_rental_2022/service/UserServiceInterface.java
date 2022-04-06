package com.example.water_equipment_rental_2022.service;

import com.example.water_equipment_rental_2022.DTO.UserDto;
import com.example.water_equipment_rental_2022.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserServiceInterface extends UserDetailsService {
    User save(UserDto userDto);
}
