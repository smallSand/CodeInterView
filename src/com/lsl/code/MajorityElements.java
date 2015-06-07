package com.lsl.code;

import java.util.Arrays;

/* MajorityElements
 * 
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than  n/2  times.
 * 
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 */
public class MajorityElements {

	public static void main(String[] args) {
		int[] nums={1,2,2,2,4};
		System.out.println(MajorityElements.majorityElement(nums));
	}
	   public static int majorityElement(int[] nums) {
		   Arrays.sort(nums);
		    return nums[nums.length/2];
	    }
}
