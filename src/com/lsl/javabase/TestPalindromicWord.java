package com.lsl.javabase;

import java.util.Scanner;

public class TestPalindromicWord {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("plese input a String: ");
		String str=in.next().toLowerCase();
		isPalindromicWord(str);
		in.close();
	}
	public static void isPalindromicWord(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				System.out.println(s+" is not a palindrome");
			}
		}
		System.out.println(s+" is a palindrome");
	}
}
