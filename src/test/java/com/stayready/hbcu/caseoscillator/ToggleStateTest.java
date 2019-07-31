package com.stayready.hbcu.caseoscillator;

import com.stayready.hbcu.CaseOscillator;
import com.stayready.hbcu.OscillationState;
import org.junit.Assert;
import org.junit.Test;

public class ToggleStateTest {
    @Test
    public void test1() {
        test("waltz bad nymph for quick jigs vex");
    }

    @Test
    public void test2() {
        test("sphinx of black quartz, judge my vow.");
    }

    @Test
    public void test3() {
        test("the quick brown fox jumps over the lazy dog");
    }


    private void test(String expectedStringToBeEvaluated) {
        // given
        CaseOscillator caseOscillator = new CaseOscillator(expectedStringToBeEvaluated);
        OscillationState expectedInitialState = OscillationState.LOWERCASE;
        OscillationState actualInitialState = caseOscillator.getState();
        Assert.assertEquals(expectedInitialState, actualInitialState);
        caseOscillator.toggleState();

        // when
        OscillationState expectedState = OscillationState.UPPERCASE;
        OscillationState actualState = caseOscillator.getState();
        Assert.assertEquals(expectedState, actualState);
    }
}
