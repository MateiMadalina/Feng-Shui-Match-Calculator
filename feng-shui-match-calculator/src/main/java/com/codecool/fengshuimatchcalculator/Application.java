package com.codecool.fengshuimatchcalculator;

import com.codecool.fengshuimatchcalculator.service.*;
import com.codecool.fengshuimatchcalculator.ui.FengShuiMatchCalculatorUi;

public class Application
{
    public static void main(String[] args)
    {
        PersonaProvider personaProvider = new PersonaProviderImpl();
        SignCalculator signCalculator = new SignCalculatorImpl();
        MatchCalculator matchCalculator = new MatchCalculatorImpl(personaProvider,signCalculator);
        FengShuiMatchCalculatorUi fengShuiMatchCalculatorUi = new FengShuiMatchCalculatorUi(matchCalculator);

        fengShuiMatchCalculatorUi.run();
    }
}
