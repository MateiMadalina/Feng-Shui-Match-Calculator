package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Match;
import com.codecool.fengshuimatchcalculator.model.Persona;
import com.codecool.fengshuimatchcalculator.model.Sign;

import java.time.LocalDate;
import java.util.Arrays;

public class MatchCalculatorImpl implements MatchCalculator{
    private final PersonaProvider personaProvider;
    private final SignCalculator signCalculator;

    public MatchCalculatorImpl(PersonaProvider personaProvider, SignCalculator signCalculator) {
        this.personaProvider = personaProvider;
        this.signCalculator = signCalculator;
    }

    @Override
    public Match calculate(LocalDate birthdate1, LocalDate birthdate2) {
        Sign sign1 = signCalculator.calculateChineseZodiac(birthdate1);
        Sign sign2 = signCalculator.calculateChineseZodiac(birthdate2);
        Persona first = personaProvider.findPersona(sign1);
        System.out.println(first.sign());
        Persona second = personaProvider.findPersona(sign2);
        System.out.println(second.sign());
        boolean goodMatches = Arrays.asList(first.goodMatches()).contains(second.sign());
        boolean badMatches = Arrays.asList(first.badMatches()).contains(second.sign());
        if(goodMatches){
            return Match.Good;
        } else if (badMatches) {
            return Match.Bad;
        }else{
            return Match.Average;
        }
    }
}
