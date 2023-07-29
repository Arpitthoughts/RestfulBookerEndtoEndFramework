package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {


        StreamsDemo.findEven();

    }
    public static void findEven(){
        int[]arr= {1,2,3,4,5,6,7,8,9,10};

     List<Integer> original=new ArrayList<>();

     for(int num : arr){
         original.add(num);
     }
        System.out.println(original);


        List<Integer>al=List.of(1,2,3,4,5,6,7,8);
        List<Integer>alfiltered=original.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(alfiltered);
    }
}