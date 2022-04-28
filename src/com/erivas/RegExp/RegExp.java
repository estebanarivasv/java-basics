package com.erivas.RegExp;

import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		
		String str ="Hola                      4522245132";
		
		String strPattern = "(\\w+)(\\s+)([13|2|45]+)";
		
		Pattern pattern = Pattern.compile(strPattern);
		
		System.out.println(pattern.matcher(str).matches());
		
		str = str.replaceAll(strPattern, "$1$1$3");
		
		System.out.println(str);
	}	
}
