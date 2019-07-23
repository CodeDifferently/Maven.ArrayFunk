package com.stayready.hbcu;

public class BasicCaser {
    /**
     * @param stringToBeEvaluated - The string to be manipulated by the aglorithm
     * @return identical string with oscillating casing
     */
    public  String camelCase(String stringToBeEvaluated) {
        StringBuilder sb = new StringBuilder();
        stringToBeEvaluated = stringToBeEvaluated.toLowerCase();
        String[] characters = stringToBeEvaluated.split("");
        Boolean upperCase = true;
        for (int i = 0; i < characters.length; i++) {
            Character currentCharacter = characters[i].charAt(0);
            String currentCharacterAsString = currentCharacter.toString();
            if (" ".equals(currentCharacterAsString)) {
                sb.append(currentCharacterAsString);
            } else {
                if (upperCase) {
                    sb.append(currentCharacterAsString.toUpperCase());
                } else {
                    sb.append(currentCharacterAsString.toLowerCase());
                }
                upperCase = !upperCase;
            }
        }
        return sb.toString();
    }

}
