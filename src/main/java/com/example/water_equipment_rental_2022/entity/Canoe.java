package com.example.water_equipment_rental_2022.entity;

import javax.persistence.*;

@Entity
@Table(name = "canoe")
public class Canoe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}