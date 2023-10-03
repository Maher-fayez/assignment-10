package edu.miu.question2;

public class ArrayReversor {
    private ArrayFlattenerService flatternerService;

    public ArrayReversor(ArrayFlattenerService flatternerService){
        this.flatternerService = flatternerService;
    }

    public int[] reverseArray(int[][] inputArray){
        int[] flattenedArray = flatternerService.flattenArray(inputArray);

        if(flattenedArray == null){
            return  null;
        }

        int[] reversedArray = new int[flattenedArray.length];

        for (int i = 0; i < flattenedArray.length; i++) {
            reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
        }

        return reversedArray;
    }
}
