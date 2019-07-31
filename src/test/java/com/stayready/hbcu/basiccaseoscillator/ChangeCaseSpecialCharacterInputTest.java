package com.stayready.hbcu.basiccaseoscillator;

import com.stayready.hbcu.BasicCaseOscillator;
import org.junit.Assert;
import org.junit.Test;

public class ChangeCaseSpecialCharacterInputTest {
    @Test
    public void test1() {
        // given
        String input = "  the  quick  brown";
        String expected = "  ThE  qUiCk  BrOwN";

        // when
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String input = " .the -quick _brown";
        String expected = " .ThE -qUiCk _BrOwN";

        // when
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        String input = " @the #quick =brown";
        String expected = " @ThE #qUiCk =BrOwN";

        // when
        test(input, expected);
    }

    private void test(String input, String expected) {
        // given
        BasicCaseOscillator caser = new BasicCaseOscillator();

        // when
        String actual = caser.changeCase(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
