package com.example;
public class SalaryCalculator {
    public static double calculate(double salaryGross, double tax, double zus){
        double x;
        x=(salaryGross-(tax+zus)*salaryGross)/12;
        return x;
    }
}