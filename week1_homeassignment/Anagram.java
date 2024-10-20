package week1_homeassignment;

import java.util.Arrays;

public class Anagram {

		    public static void main(String[] args) {
		      
		        String text1 = "stops";
		        String text2 = "potss";

		        // Check if the lengths are equal
		        if (text1.length() != text2.length()) {
		            System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
		            return;
		        }

		        // Convert both strings to character arrays and sort them
		        char[] sortedText1 = text1.toCharArray();
		        char[] sortedText2 = text2.toCharArray();
		        Arrays.sort(sortedText1);
		        Arrays.sort(sortedText2);

		        // Step 3: Compare the sorted arrays
		        if (Arrays.equals(sortedText1, sortedText2)) {
		            System.out.println("The given strings are Anagram.");
		        } else {
		            System.out.println("The given strings are not an Anagram.");
		        }
		    }

	}

