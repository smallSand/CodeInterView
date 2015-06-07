package com.lsl.javabase;
/*
 * Exercise CozaLozaWoza (Loop & Condition): 
 * Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. 
 * The program shall print "Coza" in place of the numbers which are multiples of 3, 
 * "Loza" for multiples of 5, "Woza" for multiples of 7, 
 * "CozaLoza" for multiples of 3 and 5, and so on. 
 * 
 * 	The output shall look like:
 *	1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 
 *	Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22 
 *	23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
 */
public class CozaLozaWoza {

	public static void main(String[] args) {
		int lowerbound = 1;
	      int upperbound = 110;
	      for (int number = lowerbound; number <= upperbound; ++number) {
	         // Print "Coza" if number is divisible by 3
	         if (number%3==0) {   
	            System.out.print("Coza");
	         }
	         // Print "Loza" if number is divisible by 5
	         if (number%5==0) {
	            System.out.print("Loza");
	         }
	         // Print "Woza" if number is divisible by 7
	         if(number%7==0){
	        	 System.out.print("Woza");
	         }
	         // Print the number if it is not divisible by 3, 5 and 7
	           if (number%3!=0&&number%5!=0&&number%7!=0) {
	            System.out.print(number);
	         }
	         // Print a newline if number is divisible by 11; else print a space
	         if (number%11==0) {
	            System.out.println();
	         }
	         else{
	        	 System.out.print(" ");
	         }
	      }

	}

}
