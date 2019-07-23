package com.stayready.hbcu.caseoscilator;

import com.stayready.hbcu.CaseOscillator;
import com.stayready.hbcu.CaseOscillatorState;
import org.junit.Assert;
import org.junit.Test;

public class InvertCasingTest {
    @Test
    public void test1() {
        // given
        test("the quick brown fox jumps over the lazy dog");
    }


    @Test
    public void test2() {
        // given
        test("waltz bad nymph for quick jigs vex");
    }

    @Test
    public void test3() {
        // given
        test("sphinx of black quartz, judge my vow.");
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
