package com.lsl.method;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
	   public static int[] grades;  // Declare an int[], to be allocated later
	   
	   // main() method
	   public static void main(String[] args) {
	      readGrades();
	      System.out.println("The average is " + average());
	      System.out.println("The minimum is " + min());
	      System.out.println("The maximum is " + max());
	      System.out.println("The standard deviation is " + stdDev());
	   }
	   // Prompt user for the number of students and allocate the "grades" array.
	   // Then, prompt user for grade, check for valid grade, and store in "grades".
	   public static void readGrades() {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the number of students : ");
			int num=in.nextInt();
			grades=new int[num];
			for(int i=0;i<num;i++){
				System.out.print("Enter the grade for student "+(i+1)+":");
				grades[i]=in.nextInt();
				if(grades[i]>100){
					System.out.println("Invalid grade, try again...");
					i--;
					continue;
				}
			}
			in.close();	   	
	   }
	   
	   // Return the average value of int[] grades
	   public static double average() { 
		   double sum=0;
		   for(int i=0;i<grades.length;i++){
			   sum+=grades[i];
		   }
		   return sum/grades.length;
	   }
	   
	   // Return the maximum value of int[] grades
	   public static int max() {
		   return grades[grades.length-1];
	   }
	   
	   // Return the minimum value of int[] grades
	   public static int min() {
		   Arrays.sort(grades); 
		return grades[0];
		}
	   
	   // Return the standard deviation of the int[] grades
	   public static double stdDev() {
		   double average= average();
		   double temp=0;
		   for(int i:grades){
			   temp+=i*i-average*average;
		   }
		return Math.sqrt(temp/grades.length) ; 
		
	   }
	}












