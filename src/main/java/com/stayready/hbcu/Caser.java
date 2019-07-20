package com.stayready.hbcu;

public class Caser {
    public static Character invertCasing(Character character) {
        if (Character.isUpperCase(character)) {
            return character.toString().toLowerCase().charAt(0);
        } else {
            return character.toString().toUpperCase().charAt(0);
        }
    }


    /**
     * @param stringToBeEvaluated - The string to be manipulated by the aglorithm
     * @return identical string with oscillating casing
     */
    public static String camelCase(String stringToBeEvaluated) {
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

    public static void main(String[] args) {
        System.out.println(camelCase("The quick brown fox"));
    }
}
