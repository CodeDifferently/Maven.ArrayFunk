package com.stayready.hbcu.arrayconverter;

import com.stayready.hbcu.ArrayConverter;
import org.junit.Assert;
import org.junit.Test;

public class ToIntegerArray {
    @Test
    public void test1() {
        // given
        Integer obj1 = 1;
        Integer obj2 = 2;
        Integer obj3 = 3;

        Object[] input = new Object[]{obj1, obj2, obj3};
        Integer[] expected = new Integer[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        Integer obj1 = 4;
        Integer obj2 = 5;
        Integer obj3 = 6;

        Object[] input = new Object[]{obj1, obj2, obj3};
        Integer[] expected = new Integer[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    @Test
    public void test3() {
        // given
        Integer obj1 = 7;
        Integer obj2 = 8;
        Integer obj3 = 9;

        Object[] input = new Object[]{obj1, obj2, obj3};
        Integer[] expected = new Integer[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    private void test(Object[] input, Integer[] expected) {
        ArrayConverter converter = new ArrayConverter(input);

        // when
        Integer[] actual = converter.toIntegerArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
