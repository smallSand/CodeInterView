package com.lsl.javabase;
/*

 
Exercise Bin2Dec:
 Write a program called Bin2Dec to convert an input binary string into its equivalent decimal number.
 Your output shall look like:
Enter a Binary string: 1011
The equivalent decimal number for binary "1011" is 11
 
Enter a Binary string: 1234
Error: Invalid Binary String "1234"
Hints: For a n-bit binary number bn-1bn-2...b1b0, bi∈{0,1}, 
the equivalent decimal number is bn-1×2n-1+bn-2×2n-2+ ...+b1×21+b0×20. 
 

 */

	import java.util.Scanner;
	public class Bin2Dec {
	   public static void main(String[] args) {
	      String binStr;    // input binary string
	      int binStrLen;    // length of the input string
	      int dec = 0;      // equivalent decimal number
	      char binChar;     // each individual char in the binary string
	    
	      Scanner in = new Scanner(System.in);
	   
	      // Read input binary string
	      System.out.print("plese input a BinString : ");
	      binStr=in.next();
	      binStrLen=binStr.length();
	      in.close();
	      // Convert binary string into Decimal
	      for(int i=0;i<binStrLen;i++){
	    	  binChar=binStr.charAt(i);
	    	  
	    	  if(binChar!='1'&&binChar!='0'){
	    		  System.out.println("Error: Invalid Binary String :"+binStr);
	    		  System.exit(0);
	    	  }
	    	  
	    	  if(binChar=='1'){
	    		  dec+=Math.pow(2, binStrLen-i-1);
	    	  }

	      }
	      System.out.println("The equivalent decimal number for binary "+binStr+ " is "+ dec);
	   }
	}
	

