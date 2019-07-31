package com.stayready.hbcu.basiccaseoscillator;

import com.stayready.hbcu.BasicCaseOscillator;
import org.junit.Assert;
import org.junit.Test;

public class ChangeCaseUpperCaseInputTest {
    @Test
    public void test1() {
        // given
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String expected = "ThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoG";

        // when
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String input = "TWO DRIVEN JOCKS HELP FAX MY BIG QUIZ";
        String expected = "TwO dRiVeN jOcKs HeLp FaX mY bIg QuIz";

        // when
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        String input = "PACK MY BOX WITH FIVE DOZEN LIQUOR JUGS";
        String expected = "PaCk My BoX wItH fIvE dOzEn LiQuOr JuGs";


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
