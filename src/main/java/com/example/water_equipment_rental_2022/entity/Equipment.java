package com.example.water_equipment_rental_2022.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "equipment")
public class Equipment {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_equipment")
    private Long id_equipment;
@Column(name = "type")
private String type;
@Column(name = "serial_number")
private String serial_number;
@Column(name = "hour_price")
private double hour_price;
@Column(name = "day_price")
private double day_price;

@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
@JoinColumn(name ="id_user")
private User user;



}
