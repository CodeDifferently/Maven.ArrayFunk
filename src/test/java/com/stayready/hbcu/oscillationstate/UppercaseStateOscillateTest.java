package com.stayready.hbcu.oscillationstate;

import com.stayready.hbcu.OscillationState;
import org.junit.Assert;
import org.junit.Test;

public class UppercaseStateOscillateTest {
    @Test
    public void test1() {
        // given
        Character expected = 'A';
        Character input = 'a';
        test(expected, input);
    }


    @Test
    public void test2() {
        // given
        Character expected = 'B';
        Character input = 'b';
        test(expected, input);
    }


    @Test
    public void test3() {
        // given
        Character expected = 'C';
        Character input = 'c';
        test(expected, input);
    }
    
    
    private void test(Character expected, Character input) {
        // given
        OscillationState state = OscillationState.LOWERCASE;

        // when
        Character actual = state.oscillate(expected);

        // then
        Assert.assertEquals(input, actual);
    }
}
