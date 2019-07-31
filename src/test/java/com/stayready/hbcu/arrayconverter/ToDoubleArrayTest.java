package com.stayready.hbcu.arrayconverter;

import com.stayready.hbcu.ArrayConverter;
import org.junit.Assert;
import org.junit.Test;

public class ToDoubleArrayTest {
    @Test
    public void test1() {
        // given
        Double obj1 = 1.0;
        Double obj2 = 2.0;
        Double obj3 = 3.0;

        Object[] input = new Object[]{obj1, obj2, obj3};
        Double[] expected = new Double[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        Double obj1 = 4.0;
        Double obj2 = 5.0;
        Double obj3 = 6.0;

        Object[] input = new Object[]{obj1, obj2, obj3};
        Double[] expected = new Double[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    @Test
    public void test3() {
        // given
        Double obj1 = 7.0;
        Double obj2 = 8.0;
        Double obj3 = 9.0;

        Object[] input = new Object[]{obj1, obj2, obj3};
        Double[] expected = new Double[]{obj1, obj2, obj3};

        // when
        test(input, expected);
    }

    private void test(Object[] input, Double[] expected) {
        ArrayConverter converter = new ArrayConverter(input);

        // when
        Double[] actual = converter.toDoubleArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
