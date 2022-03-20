package com.example.water_equipment_rental_2022.entity;

import javax.persistence.*;

@Entity
@Table(name = "motor_boat")
public class MotorBoat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
