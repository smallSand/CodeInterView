package com.lsl.javabase;
/*
 * 
 * PI=4*(1-1/3+1/5-1/7+1/9-1/11+1/13-1/15+....);
 */
public class ComputePI {
	public static void main(String[] args) {
		double sum = 0;
		int maxDenom = 10000000;
		for (int denom = 1;denom<maxDenom ; denom = denom + 2) {
		   if (denom % 4 == 1) {
		      sum += 1.0/denom;
		   } else if (denom % 4 == 3) {
		      sum -= 1.0/denom;
		   } else {
		      System.out.println("The computer has gone crazy?!");
		   }
		}
			System.out.println("PI="+4*sum);
	}
}
