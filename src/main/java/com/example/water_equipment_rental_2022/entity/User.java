package com.example.water_equipment_rental_2022.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String first_name;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "personal_id")
    private String personal_id;
    @Column(name = "phone_number")
    private String phone_number;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Equipment> equipmentList;

    @OneToMany(mappedBy = "userInformation", cascade = CascadeType.ALL)
    private List<Information> informationList;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns=@JoinColumn(name = "id_user",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_role",referencedColumnName = "id"))
    private Collection<Role>roles;

    public <T> User(String firstName, String name, String email, String password, List<T> role_user) {

    }

    public void addInformation(Information information) {
        informationList.add(information);
        information.setUserInformation(this);
    }

    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
        equipment.setUser(this);

    }

    public User() {
    }

    public User(String first_name, String name, String email, String password,
                String personal_id, String phone_number,
                List<Equipment> equipmentList, List<Information> informationList) {
        this.first_name = first_name;
        this.name = name;
        this.email = email;
        this.password = password;
        this.personal_id = personal_id;
        this.phone_number = phone_number;
        this.equipmentList = equipmentList;
        this.informationList = informationList;
    }

    public User(String first_name, String name, String email, String password) {
        this.first_name = first_name;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}


