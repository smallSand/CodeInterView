package com.lsl.javabase;
/*
 * HarmonicNum(n)=1+1/2+1/3+1/4+...1/n
 * Which sum is more accurate?
 */
public class HarmonicNum {
		public static void main (String[] args) {
		      int maxDenominator = 50000;
		      double sumL2R = 0.0;    //sum from left-to-right
		      double sumR2L = 0.0;    //sum from right-to-left
		      
		      // for-loop for summing from left-to-right
		      for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
		          sumL2R+=1.0/denominator;
		      }
		      // for-loop for summing from right-to-left
		      for (int denominator = maxDenominator; denominator>0;denominator--) {
		    	  sumR2L+=1.0/denominator;
		      }
		      // Find the difference and display
		      System.out.println(sumL2R);
		      System.out.println(sumR2L);
		   }
}
