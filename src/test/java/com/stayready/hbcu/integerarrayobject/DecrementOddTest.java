package com.stayready.hbcu.integerarrayobject;

import com.stayready.hbcu.IntegerArrayObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class DecrementOddTest {

    @Test
    public void firstTest() {
        // given
        Integer[] input =    {2,4,6,11,13,15};
        Integer[] expected = {2,4,6,10,12,14};
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        arrayObject.decrementOdd();
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void secondTest() {
        // given
        Integer[] input =    {10,20,30,1,3,5};
        Integer[] expected = {10,20,30,0,2,4};
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        arrayObject.decrementOdd();
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
