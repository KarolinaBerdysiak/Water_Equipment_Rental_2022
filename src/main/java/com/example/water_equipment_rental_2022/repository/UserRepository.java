package com.example.water_equipment_rental_2022.repository;

import com.example.water_equipment_rental_2022.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
