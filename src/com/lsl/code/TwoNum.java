package com.lsl.code;

import java.util.HashMap;

public class TwoNum {
	private HashMap<Integer,Integer> elements=new HashMap<Integer,Integer>();
	public void add(int num){
		if(elements.containsKey(num)){
			elements.put(num, elements.get(num)+1);
		}else{
			elements.put(num, 1);
		}
	}
	
	public boolean find(int value){
		for(Integer i:elements.keySet()){
			int target=value-i;
			if(elements.containsKey(target)){
				if(i==target&&elements.get(target)<2){
					continue;
				}
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		TwoNum t=new TwoNum();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		System.out.println(t.find(5));
		
		
	}
	
}
