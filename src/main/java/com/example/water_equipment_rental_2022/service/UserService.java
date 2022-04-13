package com.example.water_equipment_rental_2022.service;

import com.example.water_equipment_rental_2022.DTO.UserDto;
import com.example.water_equipment_rental_2022.entity.Role;
import com.example.water_equipment_rental_2022.entity.User;
import com.example.water_equipment_rental_2022.repository.RoleRepository;
import com.example.water_equipment_rental_2022.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public User save(UserDto registrationDto) {
        Role role = roleRepository.findByName("ROLE_USER");
        Collection<Role> roles = new ArrayList<>();
        // cheeck if role of ROLE_USER exists
        // if yes find the role of ROLE_USER and add to the user roles list
        if (role != null)
            roles.add(role);

            // otherwise create new role of ROLE_USER and add to the user roles list
        else {
            role = Role.builder().name("ROLE_USER").build();
            // przez buildera tworzymy role więc mozemy usnunąć konstruktor w roli
            //gdyby nie było buildera w roli, musiałby być tam konstruktor
            //roleRepository.save(role) roles.add(role);
            roleRepository.save(role);
            roles.add(role);
        }


        return userRepository.save(
                User.builder().firstName(registrationDto.getFirstName())
                        .name(registrationDto.getName())
                        .email(registrationDto.getEmail())
                        .password(passwordEncoder.encode(registrationDto.getPassword()))
                        .roles(roles).build());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.
                User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}