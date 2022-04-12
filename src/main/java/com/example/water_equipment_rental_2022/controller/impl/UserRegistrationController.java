package com.example.water_equipment_rental_2022.controller.impl;

import com.example.water_equipment_rental_2022.DTO.UserDto;
import com.example.water_equipment_rental_2022.controller.UserRegistrationControllerApi;
import com.example.water_equipment_rental_2022.service.UserService;
import com.example.water_equipment_rental_2022.service.UserServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserRegistrationController implements UserRegistrationControllerApi {
    UserServiceInterface userServiceInterface;

    public UserRegistrationController(UserServiceInterface userServiceInterface) {
        this.userServiceInterface = userServiceInterface;
    }
    public String registerUserAccount(UserDto userDto){
        userServiceInterface.save(userDto);
//        return "redirect:/registration?success";
        return "/login";
    }
    public String showForm() {
        return "/registration";
    }

    @Override
    public UserDto userDto() {
        return new UserDto();
    }


//    przed wprowadzeniem interface
//    @ModelAttribute("user")
//    public UserDto userDto(){
//        return new UserDto();
//    }

//    @GetMapping
//    public String showForm() {
//        return "registration";
//    }
}
