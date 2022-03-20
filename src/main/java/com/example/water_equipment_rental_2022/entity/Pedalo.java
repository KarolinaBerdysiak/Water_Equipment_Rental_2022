package com.example.water_equipment_rental_2022.entity;

import javax.persistence.*;

@Entity
@Table(name = "pedalo")
public class Pedalo {
//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
