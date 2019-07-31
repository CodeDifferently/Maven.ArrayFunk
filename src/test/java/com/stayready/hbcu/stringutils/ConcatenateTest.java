package com.stayready.hbcu.stringutils;

import com.stayready.hbcu.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ConcatenateTest {
    @Test
    public void test1() {
        test("The", "Quick", "TheQuick");
    }

    @Test
    public void test2() {
        test("Brown", "Fox", "BrownFox");
    }

    @Test
    public void test3() {
        test("Jumps", "Over", "JumpsOver");
    }

    private void test(String string1, String string2, String expectedString) {
        // when
        String actualString = StringUtils.concatentate(string1, string2);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
