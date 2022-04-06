package com.example.water_equipment_rental_2022.controller;

import com.example.water_equipment_rental_2022.DTO.UserDto;
import com.example.water_equipment_rental_2022.service.UserService;
import com.example.water_equipment_rental_2022.service.UserServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    UserServiceInterface userServiceInterface;




    public UserRegistrationController(UserServiceInterface userServiceInterface) {
        this.userServiceInterface = userServiceInterface;
    }
    @ModelAttribute("user")
    public UserDto userDto(){
        return new UserDto();}




        @GetMapping
    public String showForm() {
        return "registration";
    }



@PostMapping
    public String registerUserAccount(@ModelAttribute ("user") UserDto userDto){
        userServiceInterface.save(userDto);
        return "redirect:/registration?success";
    }
}
