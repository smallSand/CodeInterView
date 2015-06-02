package com.lsl.code;

public class LongestPalindromel {
/*
 * 最长的回文串
 * 
 */
		
		
	public static void main(String[] args) {
		System.out.println(LongestPalindromelSring("adafdsgdfccff"));
		
	}
	
	public static String  LongestPalindromelSring(String s){
		int maxLength=0;
		String longestPalindromel=null;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				String curr=s.substring(i, j+1);
				if(isPalindromel(curr)){
					if(curr.length()>maxLength)
						longestPalindromel=curr;
						maxLength=curr.length();
				}
			}
		}
		return longestPalindromel;
	}

	
	public static boolean isPalindromel(String s){
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
				return true;

	}
}
