package com.stayready.hbcu.integerarrayobject;

import com.stayready.hbcu.IntegerArrayObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 28/11/2018.
 */
public class GetTest {
    @Test
    public void testGet1() {
        // Given
        Integer indexToFetch = 3;
        Integer[] input = {1,2,5,178931798};
        Integer expected = 178931798;
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        Integer actual = arrayObject.get(indexToFetch);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet2() {
        // Given
        Integer indexToFetch = 0;
        Integer[] input = {981238912,2,5,8};
        Integer expected = 981238912;
        IntegerArrayObject arrayObject = new IntegerArrayObject(input);

        // when
        Integer actual = arrayObject.get(indexToFetch);

        // then
        Assert.assertEquals(expected, actual);
    }
}
