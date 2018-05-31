package com.dmitry;

public interface NumberCollection {

    /**
     * add new element
     *
     * @param value element for adding
     */
    void add(int value);

    /**
     * Optimize collection
     */
    void optimize();

    /**
     * Sampling
     *
     * @param value1 - from (inclusive)
     * @param value2 - before (inclusive)
     * @ return
     */
    int[] select(int value1, int value2);

}
