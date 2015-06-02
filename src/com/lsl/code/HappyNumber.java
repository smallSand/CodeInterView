package com.lsl.code;


public class HappyNumber {
/*
 * 19
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		System.out.println(ishappyNum(4));
	}
	
	public static boolean ishappyNum(int value){
		int result=0;
		String[] arr=String.valueOf(value).split("");
		for(String s:arr){
			result+=Integer.parseInt(s)*Integer.parseInt(s);
			System.out.print(s);
		}

		if(result==20){
			return false;
		}
		return ishappyNum(result);
		
		
	}
	
	
	
	
}
