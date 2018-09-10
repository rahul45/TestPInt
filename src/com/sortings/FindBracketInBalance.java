package com.sortings;

import java.util.Stack;

public class FindBracketInBalance {
	public static void main(String[] args) {
		String str ="“{“,”}”,”(“,(”))))((”,”[“,”]”";
		System.out.println("Is String Valid-->:"+validateStr(str));
	}
	static boolean validateStr(String str){
		int initB = 0;
		int lastB =0;
		int i=0;
		while(i<str.length()){
			if(lastB>initB){
				return false;
			}
			if(str.charAt(i)== '('){
				initB++;
			}
			if(str.charAt(i) == ')'){
				lastB++;
			}
			i++;
		}
		if(initB != lastB){
			return false;
		}
		return true;
	}
}
