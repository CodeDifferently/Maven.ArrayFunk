package com.stayready.hbcu.caseoscillator;

import com.stayready.hbcu.CaseOscillator;
import org.junit.Assert;
import org.junit.Test;

public class ChangeCasingLowerCaseInputTest {
    @Test
    public void test1() {
        // given
        String input = "the quick brown fox jumps over the lazy dog";
        String expected = "ThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoG";

        // when
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String input = "two driven jocks help fax my big quiz";
        String expected = "TwO dRiVeN jOcKs HeLp FaX mY bIg QuIz";

        // when
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        String input = "pack my box with five dozen liquor jugs";
        String expected = "PaCk My BoX wItH fIvE dOzEn LiQuOr JuGs";


        // when
        test(input, expected);
    }


    private void test(String input, String expected) {
        // given
        CaseOscillator caser = new CaseOscillator(input);

        // when
        String actual = caser.changeCase();

        // then
        Assert.assertEquals(expected, actual);
    }

}
