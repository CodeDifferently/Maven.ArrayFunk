package com.stayready.hbcu;

import java.util.function.Function;

/**
 * ATTENTION TO STUDENTS - You are advised AGAINST modifying this class
 */
public enum OscillationState {
    LOWERCASE(character -> character.toString().toLowerCase().charAt(0)),
    UPPERCASE(character -> character.toString().toUpperCase().charAt(0));

    private final Function<Character, Character> caseMethod;

    OscillationState(Function<Character, Character> caseMethod) {
        this.caseMethod = caseMethod;
    }

    public Character oscillate(Character character) {
        return caseMethod.apply(character);
    }

    public OscillationState toggle() {
        if(this.equals(LOWERCASE)) {
            return UPPERCASE;
        }
        return LOWERCASE;
    }
}
