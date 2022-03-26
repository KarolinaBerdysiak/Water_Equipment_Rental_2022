package com.example.water_equipment_rental_2022.repository;

import com.example.water_equipment_rental_2022.entity.Information;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends CrudRepository<Information,Long> {
}
