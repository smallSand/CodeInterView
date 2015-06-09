package com.lsl.javabase;
import java.util.Scanner;

/*
 * 
Enter a String: abcdef
The reverse of String "abcdef" is "fedcba".
 
 */
public class ReverseString {
   public static void main(String[] args) {
      String inStr;        // input String
      int inStrLen;        // length of the input String
   
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a String: ");
      inStr = in.next();   // use next() to read String
      inStrLen = inStr.length();
   
      // Use inStr.charAt(index) to extract character at 'index' from inStr
      StringBuilder sb=new StringBuilder();
      for(int index=inStrLen-1;index>=0;index--){
    	  	sb.append(inStr.charAt(index));
      }
      System.out.println("The reverse of String "+inStr+" is "+sb.toString());
      in.close();
   }
}