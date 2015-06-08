package com.lsl.javabase;
/*
 * The first 20 Fibonacci numbers are:
 *	1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
 *	The average is 885.5
 * 
 * 
 */
public class Fibonacci {
	//使用递归方法
	 private static int getFibo(int i) {
	  if (i == 1 || i == 2)
	  return 1;
	  else
	  return getFibo(i - 1) + getFibo(i - 2);}
	 
	 public static void main(String[] args) {
	  System.out.println("斐波那契数列的前20项为：");
	  for (int j = 1; j <= 20; j++) {
	   System.out.print(getFibo(j) + "\t");
	   if (j % 5 == 0) 
	    System.out.println();
	   }
	  }
	 }
	
	