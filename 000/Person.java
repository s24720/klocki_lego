package com.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person implements Printable{

    private int id;
    private String name, surname;
    private LocalDate dateOfBirth;
    private Gender gender;
    private List<Car> cars = new ArrayList<>();
    public void addCars(List<Car> cars){this.cars.addAll(cars);}
    public List<Car> getCars(){return this.cars;}
    public Gender getGender(){return this.gender;}
    public void setGender(Gender gender){this.gender=gender;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public LocalDate getDateOfBirth() {
        return dateOfBirth;}
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person(int id, String name, String surname, LocalDate dateOfBirth, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    @Override
    public String getDescription() {
        return "id- " + this.getId() + " imie-  " + this.getName() + " nazwisko-  " + this.getSurname() + " data_urodzenia- " + this.getDateOfBirth();
    }

    @Override
    public void print() {
        System.out.println(this.getDescription());
    }

    @Override
    public void usePrinter(String adresDrukarkiSieciowej) {
        System.out.println(adresDrukarkiSieciowej);
    }
}