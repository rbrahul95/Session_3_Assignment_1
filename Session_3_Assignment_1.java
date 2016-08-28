/*
To calculate square root and cube root of a
number in Java.
 */
package acadglid;

import java.lang.*;
//Problem 1
 class Root {
     double cude(double cube){
 double cbrt = Math.cbrt(cube);
  return cbrt;
     }
     
     double square(double square){
        double sqrt = Math.sqrt(square);
        return sqrt;
            }
}

public class Session_3_Assignment_1 {
     public static void main(String[] args) {
        double cube = 125.0d;
        double square = 100.0d;
       Root obj=new Root();
       System.out.println("Cube root of " + cube + " is " + obj.cude(cube));
        System.out.println("Square root of " + square + " is " + obj.square(square));
      // obj.cude(cube);
      // obj.square(square);
     
     }
}
