package com.stayready.hbcu;


public class CaseOscillator {
    private CaseOscillatorState state;
    private final String stringToBeEvaluated;

    /**
     * @param stringToBeEvaluated - The string to be manipulated by the algorithm
     */
    public CaseOscillator(String stringToBeEvaluated) {
        this.state = CaseOscillatorState.LOWERCASE;
        this.stringToBeEvaluated = stringToBeEvaluated;
    }

    public CaseOscillatorState getState() {
        return state;
    }

    public String getStringToBeEvaluated() {
        return stringToBeEvaluated;
    }

    public void toggleState() {
        this.state = this.state.toggle();
    }

    public Character invertCasing(Character character) {
        if (!" ".equals(character)) {
            toggleState();
        }
        return this.state.toCasing(character);
    }

    /**
     * @param  -
     * @return identical string with oscillating casing
     */
    public String changeCase() {
        StringBuilder sb = new StringBuilder();
        String stringToBeEvaluated = this.stringToBeEvaluated.toLowerCase();
        char[] characters = stringToBeEvaluated.toCharArray();
        for(char character : characters) {
            sb.append(invertCasing(character));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CaseOscillator("The quick brown fox").changeCase());
    }
}
