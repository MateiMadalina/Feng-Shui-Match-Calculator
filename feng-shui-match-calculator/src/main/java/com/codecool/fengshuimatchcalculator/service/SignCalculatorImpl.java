package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Sign;

import java.time.LocalDate;

public class SignCalculatorImpl implements SignCalculator {
    @Override
    public Sign calculateChineseZodiac(LocalDate date) {
        int year = date.getYear();
        int reminder = year%12;
        Sign[] allSign = Sign.values();
        System.out.println(allSign[reminder]);
        return allSign[reminder];
    }
}
