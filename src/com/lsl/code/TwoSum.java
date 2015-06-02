package com.lsl.code;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
/*Input numbers={1,2,11,15} target=9
 * output Index1=1;Index2=2

 */
	public static void main(String[] args) {
		int[] numbers={7,2,11,15};
		for(int i:twoSum3(numbers,9)){
			System.out.println(i);
		}

	}

	//Solution-1
	public static int[] twoSum(int[] numbers,int target){
		int[] index=new int[2];
		for(int i=0;i<numbers.length;i++){
			for(int j=i+1;j<numbers.length;j++){
				if((numbers[i]+numbers[j])==target){
					index[0]=i+1;
					index[1]=j+1;
				}
			}
		}
		return index;
	}
	//Solution-2 Use HashMap
	
	public static int[] twoSum2(int[] numbers,int target){
		int[] index=new int[2];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<numbers.length;i++){
			if(map.containsKey(numbers[i])){
				int num= map.get(numbers[i]);
				index[0]=num+1;
				index[1]=i+1;
				break;
				
			}else{
				map.put(target-numbers[i], i);
			}
		}
		return index;
	}
	//Solution-3
	//Input Array is Sorted
	public static int[] twoSum3(int[] numbers,int target){
		int x=0;
		int y=numbers.length-1;
		while(x<y){
			int temp=numbers[x]+numbers[y];
			if(temp<target){
				x++;
			}else if(temp>target){
				y--;
			}else{
				return new int[]{x+1,y+1};
			}
		}
		return null;
	}
	
	
}
