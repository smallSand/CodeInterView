package com.lsl.test;

public class Test {
//convert("     P A Y P A L I S H I R I N G ", 3) 
//should return"P A H N| A P L S I I G |Y I R".
			
//	P   A   H   N
//	A P L S I I G
//	Y   I   R
	/* 
	 * A B C D E F G
	 * A D G B C F H  
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
//		System.out.println(convert("PAYPALISHIRING",3));
//		System.out.println(convert1("PAYPALISHIRING",3));
//		System.out.println(convert("AB",1));
//		System.out.println(convert1("AB",1));
		System.out.println(convert1("ABC",1));
	}
	public static String convert(String s, int numRows) {
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<s.length();i+=4){
			result.append(s.charAt(i));
		}
		for(int i=1;i<s.length();i+=2){
			result.append(s.charAt(i));
		}
		for(int i=2;i<s.length();i+=4){
			result.append(s.charAt(i));
		}
		return result.toString();
    }
	
	
	public static String convert1(String s, int numRows) {
		StringBuilder result=new StringBuilder();
		int k=0;
		if(s.length()<numRows||numRows==1){
			return s;
		}
		for(int i=0;i<numRows;i++){
			if(i%2==0){
				k=numRows+1;
			}else{
				k=numRows-1;
			}
			for(int j=i;j<s.length();j+=k){
				result.append(s.charAt(j));
			}
		}
		return result.toString();
    }
	
	
	
	
}
