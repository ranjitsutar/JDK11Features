package com.ranjit.StringAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {


        String b= "   ";
        String c=" saas ";
        System.out.println(b.isBlank()); //True
        System.out.println(b.isEmpty()); //false
        System.out.println(c.isBlank());//False

        System.out.println("____________________________________________________________");

        String d= " hello \n"
                +" welcome \n "
                + " bye";

        System.out.println(d);
        d.lines().forEach(System.out::println);
        List<String> res =  d.lines().collect(Collectors.toList());
        System.out.println(res);
        System.out.println("____________________________________________________________");

//        STRIP EXAMPLE
        String a= " Ranjit ";
        System.out.println(a);

        System.out.println(a.strip());
        System.out.println(a.trim());

        System.out.println(a.stripLeading());
        System.out.println(a.stripTrailing());

        System.out.println("____________________________________________________________");

        //Repeat Example

        String s= "Ranjit Sutar";

        System.out.println(s.repeat(10));





    }


}
