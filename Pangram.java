package com.rough.book;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Values values = new Values();
		   String input = "Sphinx of black quartz, judge my vow"; 

	        boolean isPangram =values. isPangram(input);

	        if (isPangram) {
	            System.out.println("sentence is a pangram.");
	        } else {
	            System.out.println("sentence is not a pangram.");
	        }

	}

}
class Values
{
	 public  boolean isPangram(String input) {
	        input = input.replaceAll(" ", "").toLowerCase();

	        Set<Character> expectedChars = new HashSet<Character>();

	        for (int i = 0; i < input.length(); i++) {
	            char generatedChar = input.charAt(i);

	            if (generatedChar >= 'a' && generatedChar <= 'z') {
	            	expectedChars.add(generatedChar);
	            }
	        }

	        return expectedChars.size() == 26;
	 }
}
