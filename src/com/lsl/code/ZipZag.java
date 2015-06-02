package com.lsl.code;

public class ZipZag {

	public static void main(String[] args) {

	}
	public String getZipTag(String str,int rows){
		StringBuilder result=new StringBuilder();
		if(str.length()<=rows||rows==1){
			return str;
		}
		int num=2*rows-2;
		for(int i=0;i<rows;i++){
			
			for(int j=0;j<str.length();j+=num){
				result.append(str.charAt(j));
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		return result.toString();
	}

}
