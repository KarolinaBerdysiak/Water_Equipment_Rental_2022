package com.example.water_equipment_rental_2022.controller;

import com.example.water_equipment_rental_2022.DTO.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/registration")
public interface UserRegistrationControllerApi {
    @PostMapping
    String registerUserAccount(@ModelAttribute("user") UserDto userDto);

    @GetMapping
    public String showForm();

    @ModelAttribute("user")
    public UserDto userDto();

    }

