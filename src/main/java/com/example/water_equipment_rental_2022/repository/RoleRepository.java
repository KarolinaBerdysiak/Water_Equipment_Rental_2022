package com.example.water_equipment_rental_2022.repository;

import com.example.water_equipment_rental_2022.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
