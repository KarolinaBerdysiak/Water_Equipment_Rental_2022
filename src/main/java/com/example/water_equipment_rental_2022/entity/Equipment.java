package com.example.water_equipment_rental_2022.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "seq_equipment", sequenceName = "seq_equipment", allocationSize = 1)
@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_equipment")
    private Long idEquipment;

    private String type;
    private String serialNumber;
    private double hourPrice;
    private double dayPrice;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_user")
    private User user;


}
