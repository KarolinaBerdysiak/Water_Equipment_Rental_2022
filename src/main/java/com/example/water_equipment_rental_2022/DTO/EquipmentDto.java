package com.example.water_equipment_rental_2022.DTO;

public class EquipmentDto {

    private Long id;
    private String Type;
    private String serialNumber;
    private double hourPrice;
    private double dayPrice;

    public EquipmentDto(Long id, String type, String serialNumber, double hourPrice, double dayPrice) {
        this.id = id;
        Type = type;
        this.serialNumber = serialNumber;
        this.hourPrice = hourPrice;
        this.dayPrice = dayPrice;
    }

    public EquipmentDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }
}
