package com.lsl.javabase;
import java.util.Scanner;    // needed to use Scanner for input
/*
 * 
  Enter an integer: 12
Enter a floating point number: 33.44
Enter your name: Peter
Hi! Peter, the sum of 12 and 33.44 is 45.44

 */
public class KeyboardScanner {
   public static void main(String[] args) {
      int num1;
      double num2;
      String name;
      double sum;
    
      // Setup a Scanner called in to scan the keyboard (System.in)
      Scanner in = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      num1 = in.nextInt();     // use nextInt() to read int
      System.out.print("Enter a floating point number: ");
      num2 = in.nextDouble();  // use nextDouble() to read double
      System.out.print("Enter your name: ");
      name = in.next();      // use next() to read String
   
      // Display
      sum=num1+num2;
      System.out.print("Hi "+name+", the sum of "+num1+" and "+num2+" is "+sum);
      in.close();
   }
}
