package com.stayready.hbcu.arrayconverter;

import com.stayready.hbcu.ArrayConverter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class ConstructorTest {
    @Test
    public void test1() {
        // given
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Object[] array = new Object[]{obj1, obj2, obj3};

        // when
        test(array);
    }

    @Test
    public void test2() {
        // given
        Object obj1 = new String();
        Object obj2 = new String();
        Object obj3 = new String();

        Object[] array = new Object[]{obj1, obj2, obj3};

        // when
        test(array);
    }


    @Test
    public void test3() {
        // given
        Object obj1 = new Date();
        Object obj2 = new Date();
        Object obj3 = new String();

        Object[] array = new Object[]{obj1, obj2, obj3};

        // when
        test(array);
    }

    private void test(Object[] actual) {
        // given
        ArrayConverter arrayConverter = new ArrayConverter(actual);

        // when
        Object[] expected = arrayConverter.getArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
