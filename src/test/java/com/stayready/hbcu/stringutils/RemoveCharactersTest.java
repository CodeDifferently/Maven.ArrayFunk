package com.stayready.hbcu.stringutils;

import com.stayready.hbcu.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveCharactersTest {
    @Test
    public void test1() {
        test("racecar", "r", "aceca");
    }

    @Test
    public void test2() {
        test("basketball", "b", "asketall");
    }

    @Test
    public void test3() {
        test("basketball", "teks", "baball");
    }

    @Test
    public void test4() {
        test("football", "fto", "ball");
    }

    private void test(String string, String charactersToRemove, String expectedString) {
        // when
        String actualString = StringUtils.removeCharacters(string, charactersToRemove);


        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
