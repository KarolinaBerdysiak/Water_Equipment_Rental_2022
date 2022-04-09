package com.example.water_equipment_rental_2022.service;

import com.example.water_equipment_rental_2022.DTO.UserDto;
import com.example.water_equipment_rental_2022.entity.Role;
import com.example.water_equipment_rental_2022.entity.User;
import com.example.water_equipment_rental_2022.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserService implements UserServiceInterface{

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public User save(UserDto registrationDto) {
       User user=new User();
       user.setFirst_name(registrationDto.getFirstName());
       user.setName(registrationDto.getName());
       user.setEmail(registrationDto.getEmail());
       user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
       user.setRoles(Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);




    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(username);
        if(user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }}