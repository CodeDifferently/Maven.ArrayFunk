package com.stayready.hbcu.oscillationstate;

import com.stayready.hbcu.OscillationState;
import org.junit.Assert;
import org.junit.Test;

public class LowercaseStateOscillateTest {
    @Test
    public void test1() {
        // given
        Character input = 'A';
        Character expected = 'a';
        test(input, expected);
    }


    @Test
    public void test2() {
        // given
        Character input = 'B';
        Character expected = 'b';
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        Character input = 'C';
        Character expected = 'c';
        test(input, expected);
    }


    private void test(Character input, Character expected) {
        // given
        OscillationState state = OscillationState.LOWERCASE;

        // when
        Character actual = state.oscillate(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
