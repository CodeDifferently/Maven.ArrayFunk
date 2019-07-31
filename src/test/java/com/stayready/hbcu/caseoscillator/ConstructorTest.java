package com.stayready.hbcu.caseoscillator;

import com.stayready.hbcu.CaseOscillator;
import com.stayready.hbcu.CaseOscillatorState;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {
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


    private void test(String expectedStringToBeEvaluated) {
        // given
        CaseOscillator caseOscillator = new CaseOscillator(expectedStringToBeEvaluated);
        CaseOscillatorState expectedState = CaseOscillatorState.LOWERCASE;


        // when
        String actualStringToBeEvaluated = caseOscillator.getStringToBeEvaluated();
        CaseOscillatorState actualState = caseOscillator.getState();

        // then
        Assert.assertEquals(expectedStringToBeEvaluated, actualStringToBeEvaluated);
        Assert.assertEquals(expectedState, actualState);
    }
}
