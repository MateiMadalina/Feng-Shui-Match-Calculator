package com.codecool.fengshuimatchcalculator;

import com.codecool.fengshuimatchcalculator.service.PersonaProvider;
import com.codecool.fengshuimatchcalculator.service.PersonaProviderImpl;
import com.codecool.fengshuimatchcalculator.service.SignCalculator;
import com.codecool.fengshuimatchcalculator.service.SignCalculatorImpl;

import java.time.LocalDate;

public class Application
{
    public static void main(String[] args)
    {
        PersonaProvider personaProvider = new PersonaProviderImpl();
        SignCalculator test = new SignCalculatorImpl();
        test.calculateChineseZodiac(LocalDate.parse("1999-05-20"));
    }
}
