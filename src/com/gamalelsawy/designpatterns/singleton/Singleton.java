package com.gamalelsawy.designpatterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton {
    private List<Integer> nums;
    public static Singleton singleton;

    private Singleton(){
        nums = Arrays.asList(new Integer[]{1, 2, 3, 4});
        Collections.shuffle(nums);
        System.out.println("Constructor Called!!");
    }

    public static Singleton getSingletonInstance() {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }
    public void printData(){
        for(Integer i: nums)
            System.out.print(i.toString() + " ");
        System.out.println();
    }
}
