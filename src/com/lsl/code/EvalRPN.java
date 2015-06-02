package com.lsl.code;

import java.util.Stack;

public class EvalRPN {
/*
 * Reverse Polish Notation
 * ["2,"1","+","3","*"] ->> (2+1)*3=9
 * ["4","13","5","/","+"] ->>(13/5)+4 =6
 */
	public static void main(String[] args) {
		String[] tokens={"2","1","+","3","*"};
		System.out.println(evalRPN(tokens));
	}

	private static int evalRPN(String[] tokens) {
		int resultVlue=0;
		String operators="+-*/";
		Stack<String> stack=new Stack<String>();
		
		for(String r:tokens){
			if(!operators.contains(r)){
				stack.push(r);
			}else{
				int a=Integer.valueOf(stack.pop());
				int b=Integer.valueOf(stack.pop());
				//int index=operators.indexOf(r);
				switch(r){  //index
				case "+":  //0
					stack.push(String.valueOf(a+b));
					break;
				
				case "-": //1
					stack.push(String.valueOf(b-a));
					break;
					
				case "*": //2
					stack.push(String.valueOf(a*b));
					break;
					
				case "/": //3
					stack.push(String.valueOf(b/a));
					break;
				}
				
			}
		}
		resultVlue=Integer.valueOf(stack.pop());
		return resultVlue;
	}

}
