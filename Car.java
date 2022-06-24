package com.example;

public class Car {

    private int Id;
    private String registerNumber;
    private String Brand;
    private Person owner;
    public int getId() {
        return Id;}

    public void setId(int id) {
        Id = id;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Car(int id, String registerNumber, String brand, Person owner) {
        Id = id;
        Brand = brand;
        this.registerNumber = registerNumber;
        this.owner = owner;
    }
}