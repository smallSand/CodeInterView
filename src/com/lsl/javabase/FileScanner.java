package com.lsl.javabase;

import java.util.Scanner;              // Needed to use Scanner for input
import java.io.File;                   // Needed to use File
import java.io.FileNotFoundException;  // Needed for file operation
   
public class FileScanner { 
   public static void main(String[] args) 
         throws FileNotFoundException {  // Needed for file operation
      int num1;
      double num2;
      String name;
      double sum;
   
      // Setup a Scanner to read from a text file
      Scanner in = new Scanner(new File("in.txt"));
      num1 = in.nextInt();      // use nextInt() to read int
      num2 = in.nextDouble();   // use nextDouble() to read double
      name = in.next();         // use next() to read String
   
      // Display
      sum=num1+num2;
      System.out.print("Hi "+name+", the sum of "+num1+" and"+num2+" is "+sum);
      in.close();
   }
}