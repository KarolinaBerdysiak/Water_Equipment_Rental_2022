package com.example.water_equipment_rental_2022.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id_user;

    @Column(name = "first_name")
    private String first_name;
    @Column(name = "name")
    private String name;
    @Column(name = "personal_id")
    private String personal_id;
    @Column(name = "phone_number")
    private String phone_number;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Equipment> equipmentList;

    @OneToMany(mappedBy = "userInformation",cascade = CascadeType.ALL)
    private List<Information>informationList;

    public void addInformation(Information information){
        informationList.add(information);
        information.setUserInformation(this);
    }

    public void addEquipment(Equipment equipment){
        equipmentList.add(equipment);
        equipment.setUser(this);

    }

    public List<Information> getInformationList() {
        return informationList;
    }

    public void setInformationList(List<Information> informationList) {
        this.informationList = informationList;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(String personal_id) {
        this.personal_id = personal_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
