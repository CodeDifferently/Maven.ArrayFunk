package com.stayready.hbcu.oscillationstate;

import com.stayready.hbcu.OscillationState;
import org.junit.Assert;
import org.junit.Test;

public class ToggleTest {
    @Test
    public void lowerCaseToLowerCaseTest() {
        // given
        OscillationState state = OscillationState.LOWERCASE;
        OscillationState expected = OscillationState.UPPERCASE;

        // when
        OscillationState actual = state.toggle();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void upperCaseToLowerCaseTest() {
        // given
        OscillationState state = OscillationState.UPPERCASE;
        OscillationState expected = OscillationState.LOWERCASE;

        // when
        OscillationState actual = state.toggle();

        // then
        Assert.assertEquals(expected, actual);
    }
}
