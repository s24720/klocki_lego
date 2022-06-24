package com.example;
import java.time.LocalDate;
public class Employee extends Person{
    private String jobTitle;
    private double salaryGross;
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalaryGross() {
        return salaryGross;
    }

    public void setSalaryGross(double salaryGross) {
        this.salaryGross = salaryGross;
    }

    public Employee(int id, String name, String surname, LocalDate dateOfBirth, Gender gender, String jobTitle, double salaryGross) {
        super(id, name, surname, dateOfBirth, gender);
        this.jobTitle=jobTitle;
        this.salaryGross=salaryGross;
    }
}