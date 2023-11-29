package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamapi {

    public static void main(String[] args)
    {

       List<Integer> data= Arrays.asList(1,2,3,4,5,6,7,8);

       Stream<Integer> dataStream=data.stream();

        dataStream.filter(n->n%2==1).forEach(s->System.out.println(s));



    }
}
