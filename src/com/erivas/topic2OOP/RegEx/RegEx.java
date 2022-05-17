package com.erivas.topic2OOP.RegEx;

import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		String str ="Hi                      4522245132";
		
		String strPattern = "(\\w+)(\\s+)([13|2|45]+)";
		
		Pattern pattern = Pattern.compile(strPattern);

		// Verifies if a string matches the pattern
		System.out.println(pattern.matcher(str).matches());

		// Retrieve all the different conjuncts that match the pattern
		str = str.replaceAll(strPattern, "$1$2$1$3");
		
		System.out.println(str);
	}	
}
