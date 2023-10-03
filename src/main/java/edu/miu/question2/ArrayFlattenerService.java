package edu.miu.question2;

public class ArrayFlattenerService {

    public int[] flattenArray(int[][] inputArray){
        if(inputArray == null){
            return null;
        }

        int totalLength = 0;
        for(int[] subArray: inputArray){
            totalLength += subArray.length;
        }

        int[] flattenedArray = new int[totalLength];
        int index = 0;

        for(int[] subArray: inputArray){
            for(int num: subArray){
                flattenedArray[index++] = num;
            }
        }

        return flattenedArray;
    }
}
