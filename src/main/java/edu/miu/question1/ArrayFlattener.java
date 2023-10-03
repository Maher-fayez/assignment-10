package edu.miu.question1;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public Integer[] flattenArray(Integer[][] nestedArray){
        if(nestedArray == null){
            return  null;
        }

        List<Integer> flattenedList = new ArrayList<>();

        for(Integer[] arr: nestedArray){
            if(nestedArray != null){
                for (Integer num: arr){
                    flattenedList.add(num);
                }
            }
        }

        return flattenedList.toArray(new Integer[0]);
    }
}
