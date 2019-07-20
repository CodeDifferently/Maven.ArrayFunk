package com.stayready.hbcu.integerarrayobject;

import com.stayready.hbcu.IntegerArrayObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class AddTest {
    @Test
    public void testAdd1() {
        // given
        Integer valueToBeAdded = 10;
        Integer[] intArray = {1, 3, 2, 5, 4, 7, 6};
        Integer[] expected = {1, 3, 2, 5, 4, 7, 6, valueToBeAdded};
        IntegerArrayObject arrayObject = new IntegerArrayObject(intArray);


        // when
        arrayObject.add(valueToBeAdded);
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        // given
        Integer firstValueToBeAdded = 10;
        Integer secondValueToBeAdded = 17;
        Integer[] intArray = {1, 3, 2, 5, 4, 7, 6};
        Integer[] expected = {1, 3, 2, 5, 4, 7, 6, firstValueToBeAdded, secondValueToBeAdded};
        IntegerArrayObject arrayObject = new IntegerArrayObject(intArray);


        // when
        arrayObject.add(firstValueToBeAdded);
        arrayObject.add(secondValueToBeAdded);
        Integer[] actual = arrayObject.getArray();

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}