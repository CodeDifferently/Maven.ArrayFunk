package com.stayready.hbcu.integerarrayobject;

import com.stayready.hbcu.IntegerArrayObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class ReplaceTest {
    @Test
    public void testInsert1() {
        // Given
        Integer indexToInsertAt = 3;
        Integer valueToBeInserted = 12;
        Integer[] input = {1,2,5,8};
        Integer[] expected = {1,2,5,valueToBeInserted};
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        arrayObject.replace(indexToInsertAt, valueToBeInserted);
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsert2() {
        // Given
        Integer valueToBeInserted = 82;
        Integer indexToInsertAt = 0;
        Integer[] input = {1,2,5,8};
        Integer[] expected = {valueToBeInserted,2,5,8};
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        arrayObject.replace(indexToInsertAt, valueToBeInserted);
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
