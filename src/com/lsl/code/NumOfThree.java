package com.lsl.code;

import java.util.ArrayList;
import java.util.Arrays;

public class NumOfThree {

	public static void main(String[] args) {
		NumOfThree n=new NumOfThree();
		int[] nums={-1,0,1,2,-1,-4};
			for(ArrayList<Integer> a:n.threeNum(nums)){
				for(Integer i:a){
					System.out.println(i);
				}
				
			}
	}
	public ArrayList<ArrayList<Integer>> threeNum(int[] nums){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> each=new ArrayList<Integer>();
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0) break;
				for(int j=i+1;j<nums.length;j++){
					if((nums[i]+nums[j])>0 && nums[j]>0) break;
					for(int k=j+1;k<nums.length;k++){
						if(nums[i]+nums[j]+nums[k]==0){
							each.add(nums[i]);
							each.add(nums[j]);
							each.add(nums[j]);
							result.add(each);
							each.clear();
						}
					}
			}
		}
		return result;
	}

	
	
}
