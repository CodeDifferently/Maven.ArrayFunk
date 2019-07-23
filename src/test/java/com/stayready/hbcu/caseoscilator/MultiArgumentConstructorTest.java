package com.stayready.hbcu.caseoscilator;

import com.stayready.hbcu.CaseOscillator;
import com.stayready.hbcu.CaseOscillatorState;
import org.junit.Assert;
import org.junit.Test;

public class MultiArgumentConstructorTest {
    @Test
    public void test1() {
        test(CaseOscillatorState.UPPERCASE, "waltz bad nymph for quick jigs vex");
    }

    @Test
    public void test2() {
        test(CaseOscillatorState.UPPERCASE, "sphinx of black quartz, judge my vow.");
    }

    @Test
    public void test3() {
        test(CaseOscillatorState.UPPERCASE, "the quick brown fox jumps over the lazy dog");
    }



    private void test(CaseOscillatorState expectedState, String expectedStringToBeEvaluated) {
        // given
        CaseOscillator caseOscillator = new CaseOscillator(expectedStringToBeEvaluated);


        // when
        String actualStringToBeEvaluated = caseOscillator.getStringToBeEvaluated();
        CaseOscillatorState actualState = caseOscillator.getState();

        // then
        Assert.assertEquals(expectedStringToBeEvaluated, actualStringToBeEvaluated);
        Assert.assertEquals(expectedState, actualState);
    }
}
