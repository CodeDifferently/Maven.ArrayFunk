package com.stayready.hbcu;

public class IntegerArrayObject {
    private Integer[] array;

    /**
     * @param array - array to be manipulated by the instance
     */
    public IntegerArrayObject(Integer[] array) {
        this.array = array;
    }

    /**
     * @param valueToBeAdded - value to be added to each of the integers in the array
     * mutates `this.array` by adding `valueToBeAdded` to each of the elements in the array
     */
    public void add(Integer valueToBeAdded) {
    }

    /**
     * decrements all of the odd integers in `this.array`
     */
    public void decrementOdd() {
    }

    /**
     * @param indexToFetch - index of array to get value from
     * @return value in the `indexToFetch`
     */
    public Integer get(Integer indexToFetch) {
        return null;
    }

    /**
     * decrements all of the odd integers in `this.array`
     * increments all of the even integers in `this.array`
     */
    public void incrementEvenDecrementOdd() {
    }

    /**
     * increments all of the even integers in `this.array`
     */
    public void incrementEven() {
    }

    /**
     * @param indexToInsertAt - index to insert at
     * @param valueToBeInserted
     */
    public void replace(Integer indexToInsertAt, Integer valueToBeInserted) {
    }

    public Integer[] getArray() {
        return null;
    }
}
