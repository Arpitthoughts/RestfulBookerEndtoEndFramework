package org.example;

public class formatfunc {

    public static void main(String[] args){

        String a ="tata motors";
        String b="Mahindra";
        String c="Two leading EV companies are %s and second one is %s";
        System.out.println(String.format(c, a,b));

        String f1="apple";
        String f2="banana";
        String result="%s and %s are my two favourite fruits";
        System.out.println(String.format(result,f1,f2));
    }

}
