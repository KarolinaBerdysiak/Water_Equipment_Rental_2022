package com.example.water_equipment_rental_2022.entity;

import javax.persistence.*;

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


    public Long getId_equipment() {
        return id_equipment;
    }

    public void setId_equipment(Long id_equipment) {
        this.id_equipment = id_equipment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public double getHour_price() {
        return hour_price;
    }

    public void setHour_price(double hour_price) {
        this.hour_price = hour_price;
    }

    public double getDay_price() {
        return day_price;
    }

    public void setDay_price(double day_price) {
        this.day_price = day_price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
