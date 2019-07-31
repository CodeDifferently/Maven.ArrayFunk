package com.stayready.hbcu.arrayconverter;

import com.stayready.hbcu.ArrayConverter;
import org.junit.Assert;
import org.junit.Test;

public class ToStringArray {
    @Test
    public void test1() {
        // given
        String obj1 = "1.0";
        String obj2 = "2.0";
        String obj3 = "3.0";

        Object[] input = new Object[]{obj1, obj2, obj3};
        String[] expected = new String[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String obj1 = "4.0";
        String obj2 = "5.0";
        String obj3 = "6.0";

        Object[] input = new Object[]{obj1, obj2, obj3};
        String[] expected = new String[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    @Test
    public void test3() {
        // given
        String obj1 = "7.0";
        String obj2 = "8.0";
        String obj3 = "9.0";

        Object[] input = new Object[]{obj1, obj2, obj3};
        String[] expected = new String[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    private void test(Object[] input, String[] expected) {
        ArrayConverter converter = new ArrayConverter(input);

        // when
        String[] actual = converter.toStringArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
