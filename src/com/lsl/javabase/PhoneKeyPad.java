package com.lsl.javabase;


/*
 Exercise PhoneKeyPad: On your phone keypad, the alphabets are mapped to digits as follows:
  ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
Write a program called PhoneKeyPad, which prompts user for a String (case insensitive), 
and converts to a sequence of Keypad digits. Use a nested-if (or switch-case) in this exercise. 
Modify your program to use an array for table look-up later.
Hints: You can use in.next().toLowerCase() to read a string and convert it to lowercase to reduce your cases.

 */
public class PhoneKeyPad {
	public static void main(String[] args){
		getPhoneKeySequence("lsl");
	}
	public static void getPhoneKeySequence(String str){
		str=str.toLowerCase();
		String[] arr=str.split("");
		for(int i=0;i<arr.length;i++){
			if("abc".contains(arr[i])){
				System.out.print("2");
			}
			if("def".contains(arr[i])){
				System.out.print("3");
			}
			if("ghi".contains(arr[i])){
				System.out.print("4");
			}
			if("jhl".contains(arr[i])){
				System.out.print("5");
			}
			if("mno".contains(arr[i])){
				System.out.print("6");
			}
			if("pqrs".contains(arr[i])){
				System.out.print("7");
			}
			if("tuv".contains(arr[i])){
				System.out.print("8");
			}
			if("wxyz".contains(arr[i])){
				System.out.print("9");
			}
		}
	}
	
}
