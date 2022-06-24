package com.example;
import java.time.LocalDate;
import java.util.ArrayList;
public class MainProgram {
    public static void main(String[] args) {

        Employee janKowalski = new Employee(111, "Jan", "Kowalski", LocalDate.of(2000, 1, 12), Gender.MALE, "Kasjer", 1);
        System.out.println(janKowalski.getId());
        System.out.println(janKowalski.getName());
        System.out.println(janKowalski.getSurname());
        System.out.println(janKowalski.getDateOfBirth());
        System.out.println(janKowalski.getGender());
        Car bmw = new Car(0, "BWM123", "bmw", janKowalski);
        Car volvo = new Car(1, "VOLVO321", "volvo", janKowalski);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(volvo);
        janKowalski.addCars(cars);
        System.out.println(janKowalski.getCars().get(0).getBrand());
        System.out.println(janKowalski.getCars().get(1).getBrand());
        System.out.println(janKowalski.getDescription());
        janKowalski.print();
        janKowalski.usePrinter("localhost");
        Employee adam = new Employee(1010, "Adam", "Nowakowski", LocalDate.of(1999, 9, 9), Gender.MALE, "Kascjer", 33333);
        adam.print();
        System.out.println(adam.getJobTitle());
        System.out.println(adam.getSalaryGross());
        Employee robotnik = new Employee(1234, "robotnik", "", LocalDate.of(1985, 12, 12), Gender.MALE, "Budowlaniec", 150000);
        System.out.println(robotnik.getMonthlySalaryNet());
    }
}