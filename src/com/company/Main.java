package com.company;

public class Main {

    public static void main(String[] args) {
      int  a = 0, b = 567;
      String s = "Hansi";
      int position = s.indexOf('a');
        System.out.println(position);
        //hier hättet er gezeigt dass double manchmal nicht so genau ist
        double d = 100.0;
        double d2 = 0.1;
        double d3 = 0.0000000000001;
        double d4 = 1000000000000000000.0;
        System.out.println(d + d2 + d3 + d4);


        // unterschied post und pre increment
        a = 1;
        int c;
        ++a; //wir erwarten 2
        System.out.println(a);

        c = ++a; //wir erwarten 3
        System.out.println("a: " + a + "c :" + c);

        c= a++; //wir erwarten??
        System.out.println("a: " + a + "c: " + c);
        myLittleHelper("Whatever");
        myLittleHelper(s);
        //beispiel
        String helper = "Batman";
        myLittleHelper(helper);

    }
    public static void myLittleHelper (String helper) {
        System.out.println("I am the little helper" + " " + helper);
    }
}
