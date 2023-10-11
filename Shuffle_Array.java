package com.rough.book;
import java.util.Random;
public class Shuffle_Array {
	
	public static void main(String[] args) {
		int[] arrayElements= {2,3,4,5,4,3};
		   Random rand = new Random();

	        for (int i = arrayElements.length - 1; i > 0; i--) {
	            int j = rand.nextInt(i + 1);

	            int temp = arrayElements[i];
	            arrayElements[i] = arrayElements[j];
	            arrayElements[j] = temp;
	        }

	        System.out.print("arrayElements ");
	        for (int element : arrayElements) {
	            System.out.print(element + " ");
	        }
		
	}

}
