package com.stayready.hbcu.integerarrayobject;

import com.stayready.hbcu.IntegerArrayObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class IncrementEvenDecrementOddTest {
    @Test
    public void testOneEvenElement() {
        // given
        Integer[] input = {38};
        Integer[] expectedOutput = {39};
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        arrayObject.incrementEvenDecrementOdd();
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expectedOutput, actual);
    }

    @Test
    public void testOneOddElement() {
        // given
        Integer[] input = {91};
        Integer[] expectedOutput = {90};
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        arrayObject.incrementEvenDecrementOdd();
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expectedOutput, actual);
    }


    @Test
    public void testOdd() {
        // given
        Integer[] input = {101, 25, 11};
        Integer[] expectedOutput = {100, 24, 10};
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        arrayObject.incrementEvenDecrementOdd();
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expectedOutput, actual);
    }

    @Test
    public void testEven() {
        // given
        Integer[] input = {34, 18, 700, 128, 110};
        Integer[] expectedOutput = {35, 19, 701, 129, 111};
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        arrayObject.incrementEvenDecrementOdd();
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expectedOutput, actual);
    }

}
