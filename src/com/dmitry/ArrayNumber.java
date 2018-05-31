package com.dmitry;
import java.util.Arrays;

public class ArrayNumber implements NumberCollection {

    private boolean setOptimize = false;
    private int data[];

    public ArrayNumber() {
        data = new int[0];
    }

    @Override
    public void add(int value) {
        if (!setOptimize) {
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = value;
        }
    }

    @Override
    public void optimize() {
        Arrays.sort(data);
        setOptimize = true;
    }

    @Override
    public int[] select(int value1, int value2) {
        int result[] = new int[0];
        //if the array is not sorted then we check everything.
        if (!setOptimize) {
            for (int aData : data) {
                if (aData >= value1 && aData <= value2) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = aData;
                }
            }
        }
        //range of numbers from the sorted array
        else {
            for (int aData : data) {
                boolean findSelectRange = false;
                if (aData >= value1 && aData <= value2) {
                    findSelectRange = true;
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = aData;
                    continue;
                }
                if (findSelectRange) {
                    break; //In the sorted array, there are no more numbers in this range
                }
            }
        }
        return result;
    }
}
