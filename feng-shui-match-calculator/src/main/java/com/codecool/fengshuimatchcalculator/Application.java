package com.codecool.fengshuimatchcalculator;

import com.codecool.fengshuimatchcalculator.service.*;
import com.codecool.fengshuimatchcalculator.ui.FengShuiMatchCalculatorUi;

import java.time.LocalDate;

public class Application
{
    public static void main(String[] args)
    {
        PersonaProvider personaProvider = new PersonaProviderImpl();
        SignCalculator signCalculator = new SignCalculatorImpl();
        System.out.println(personaProvider);

        MatchCalculator matchCalculator = new MatchCalculatorImpl(personaProvider,signCalculator);
        FengShuiMatchCalculatorUi fengShuiMatchCalculatorUi = new FengShuiMatchCalculatorUi(matchCalculator);
        fengShuiMatchCalculatorUi.run();

    }
}
