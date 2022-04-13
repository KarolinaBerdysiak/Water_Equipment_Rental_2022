package com.example.water_equipment_rental_2022.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "seq_role", sequenceName = "seq_role", allocationSize = 1)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_role")
    private long id;
    private String name;
}
