package com.stayready.hbcu;

import java.util.function.Function;

public enum CaseOscillatorState {
    LOWERCASE(character -> character.toString().toLowerCase().charAt(0)),
    UPPERCASE(character -> character.toString().toUpperCase().charAt(0));

    private final Function<Character, Character> caseMethod;

    CaseOscillatorState(Function<Character, Character> caseMethod) {
        this.caseMethod = caseMethod;
    }

    public Character toCasing(Character character) {
        return caseMethod.apply(character);
    }

    public CaseOscillatorState toggle() {
        if(this.equals(LOWERCASE)) {
            return UPPERCASE;
        }
        return LOWERCASE;
    }
}
