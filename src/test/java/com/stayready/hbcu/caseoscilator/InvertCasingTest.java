package com.stayready.hbcu.caseoscilator;

import com.stayready.hbcu.CaseOscillator;
import com.stayready.hbcu.CaseOscillatorState;
import org.junit.Assert;
import org.junit.Test;

public class InvertCasingTest {
    @Test
    public void test1() {
        // given
        test('a', CaseOscillatorState.LOWERCASE);
    }


    @Test
    public void test2() {
        // given
        test('B', CaseOscillatorState.UPPERCASE);
    }

    @Test
    public void test3() {
        // given
        test('c', CaseOscillatorState.LOWERCASE);
    }


    private void test(Character expectedCharacterToBeEvaluated, CaseOscillatorState expectedState) {
        // given
        CaseOscillator caseOscillator = new CaseOscillator("");
        CaseOscillatorState expectedInitialState = CaseOscillatorState.LOWERCASE;
        String actualStringToBeEvaluated = caseOscillator.getStringToBeEvaluated();
        CaseOscillatorState actualState = caseOscillator.getState();


        // when
        Character character = caseOscillator.invertCasing(expectedCharacterToBeEvaluated);


    }
}
