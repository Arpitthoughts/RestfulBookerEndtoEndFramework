package TicketBooking.Pojos;

import java.util.HashSet;

public class Compareobjects {

    public static void main(String[] args) {

        Employee employee1= new Employee(1,"arpit","male");
        Employee employee2 = new Employee(2,"arpit","male");

        //System.out.println(employee1==employee2);
        System.out.println(employee1.equals(employee2));

       HashSet<Object> hashSet= new HashSet<>();
      hashSet.add(employee1);
      hashSet.add(employee2);
      System.out.println(hashSet);


    }



}
