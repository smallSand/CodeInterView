package com.lsl.array;

import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int num=in.nextInt();
		int[] grade=new int[num];
		double sum=0;
		for(int i=0;i<num;i++){
			System.out.print("Enter the grade for student "+(i+1)+":");
			grade[i]=in.nextInt();
			if(grade[i]>100){
				System.out.println("Invalid grade, try again...");
				i--;
				continue;
			}
			sum+=grade[i];
		}
		System.out.println("The average is "+sum/num);
		
		in.close();
	}

}
