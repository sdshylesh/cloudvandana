package com.rough.book;

import java.util.HashMap;
import java.util.Map;

public class Roman_Integer {
public static void main(String[] args) {
	   String romanNumber = "XI";
	   System.out.println("The integer representation of " + romanNumber + " is: " + romanToInt(romanNumber));
}
public static int romanToInt(String s) {
	  int result = 0;
	    int prevValue = 0;
    Map<Character, Integer> romanValues = new HashMap<>();
    romanValues.put('I', 1);
    romanValues.put('V', 5);
    romanValues.put('X', 10);
    romanValues.put('L', 50);
    romanValues.put('C', 100);
    romanValues.put('D', 500);
    romanValues.put('M', 1000);

  

    for (int i = s.length() - 1; i >= 0; i--) {
        char currentSymbol = s.charAt(i);
        System.out.println(currentSymbol);
        int currentValue = romanValues.get(currentSymbol);
        System.out.println(currentValue);
        if (currentValue < prevValue) {
            result -= currentValue;
        } else {
            result += currentValue;
        }

        prevValue = currentValue;
    }

    return result;
}
}

	