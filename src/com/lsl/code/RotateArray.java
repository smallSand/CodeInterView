package com.lsl.code;

public class RotateArray {
/*
 * Rotate n=7 {1,2,3,4,5,6,7} by k=3 steps 
 * ->> {5,6,7,1,2,3,4}
 *
 */
	
	public static void main(String[] args) {
		//RotateArray r=new RotateArray();
		int[] nums={1,2,3,4,5,6,7};
		//r.rotate(nums, 3);
		//r.rotate1(nums, 3);
		rotate2(nums, 3);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]);
		}
	}
	
	// Solution-1
		public void rotate(int[] nums,int k){
			
			if(k>nums.length){
				k=k%nums.length;
			}
			int[] result=new int[nums.length];
			//填充新数组的前k个元素
			//nums.length=7
			//k=3
			for(int i=0;i<k;i++){
				result[i]=nums[nums.length-k+i];
			}
			//填充新数组没有发生变化的元素
			int j=0;
			for(int i=k;i<nums.length;i++){
				result[i]=nums[j];
				j++;
			}
			
			System.arraycopy(result, 0, nums, 0, nums.length);
			for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]);
			}
		
		}
		//solution-2
		public void rotate1(int[] arr,int k){
			
			for(int i=0;i<k;i++){
				for(int j=arr.length-1;j>0;j--){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		
		//solution-3 revesal
		public static void rotate2(int[] arr,int order){
			if(order>arr.length){
				order=order%arr.length;
			}
			if(arr==null||arr.length==1){
				System.exit(0);
			}
			//第一部分的长度
			int a=arr.length-order;
			resever(arr, 0, a-1);
			resever(arr, a, arr.length-1);
			resever(arr, 0, arr.length-1);
			
		}
		public static void resever(int[] arr,int left,int right){
			while(right>left){
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
	

}
