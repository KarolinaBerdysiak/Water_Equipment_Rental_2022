package com.example.water_equipment_rental_2022.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@SequenceGenerator(name = "seq_user", sequenceName = "seq_user", allocationSize = 1)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
    private Long id;
    private String firstName;
    private String name;
    private String email;
    private String password;
    private String personalId;
    private String phoneNumber;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Equipment> equipmentList;
    @OneToMany(mappedBy = "userInformation", cascade = CascadeType.ALL)
    private List<Information> informationList;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "id"))
    private Collection<Role> roles;


//    public void addInformation(Information information) {
//        informationList.add(information);
//        information.setUserInformation(this);
//    }
//
//    public void addEquipment(Equipment equipment) {
//        equipmentList.add(equipment);
//        equipment.setUser(this);
//
//    }
}


