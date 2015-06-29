package com.lsl.method;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradesHistogram {
	   public static int[] grades;
	      // Declare an int array of grades, to be allocated later
	   public static int[] bins = new int[10];
	      // Declare and allocate an int array for histogram bins.
	      // 10 bins for 0-9, 10-19,...., 90-100
	   
	   public static void main(String[] args) {
	      readGrades("grades.in");
	      computeHistogram();
	      printHistogramHorizontal();
	      printHistogramVertical();
	   }
	   
	   // Read the grades from "filename", store in "grades" array.
	   // Assume that the inputs are valid.
	   public static void readGrades(String filename) { 
		   try {
			Scanner in=new Scanner(new File(filename));
			grades=new int[in.nextInt()];
			int i=0;
			while(in.hasNext()){
				grades[i]=in.nextInt();
				i++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	   }

	   // Based on "grades" array, populate the "bins" array.
	   public static void computeHistogram() {
		   for(int i:grades){
			   if(i>=0&&i<=9){
				   bins[0]++;
			   }
			   if(i>=10&&i<=19){
				   bins[1]++;
			   }
			   if(i>=20&&i<=29){
				   bins[2]++;
			   }
			   if(i>=30&&i<=39){
				   bins[3]++;
			   }
			   if(i>=40&&i<=49){
				   bins[4]++;
			   }
			   if(i>=50&&i<=59){
				   bins[5]++;
			   }
			   if(i>=60&&i<=69){
				   bins[6]++;
			   }
			   if(i>=70&&i<=79){
				   bins[7]++;
			   }
			   if(i>=80&&i<=89){
				   bins[8]++;
			   }
			   if(i>=90&&i<=100){
				   bins[9]++;
			   }
			   
		   }
		   
	   }

	   // Print histogram based on the "bins" array.
	   public static void printHistogramHorizontal() { 
		   for(int i=0;i<bins.length;i++){
			   if(i==0){
				   System.out.print("0 - 9 :");
			   }
			   else System.out.print(10*i+"-"+(10*i+9)+" :");
			   if(bins[i]==1){
				   System.out.print(" *");
			   }
			   if(bins[i]==2){
				   System.out.print(" **");
			   }
			   if(bins[i]==3){
				   System.out.print(" ***");
			   }
			   if(bins[i]==4){
				   System.out.print(" ****");
			   }
			   if(bins[i]==5){
				   System.out.print(" *****");
			   }
			   if(bins[i]==6){
				   System.out.print(" ******");
			   }
			   if(bins[i]==7){
				   System.out.print(" *******");
			   }
			   if(bins[i]==8){
				   System.out.print(" ********");
			   }
			   System.out.println();
		   }
		   
		   
	   }

	   // Print histogram based on the "bins" array.
	   public static void printHistogramVertical() { }
	}