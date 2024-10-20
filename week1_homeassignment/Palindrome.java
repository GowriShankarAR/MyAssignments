package week1_homeassignment;

public class Palindrome {

	public static void main(String[] args) {
		  checkPalindrome(121);    
	        checkPalindrome(12345);
	    }

	    // Method to check if a number is a palindrome
	    public static void checkPalindrome(int input) {
	        int output = 0; 
	        int original = input;

	        // Reverse the number using a for loop
	        for (int i = input; i > 0; i /= 10) {
	            int rem = i % 10; // Get the last digit
	            output = output * 10 + rem; // Build the reversed number
	        }

	        // Check if the original number is equal to the reversed number
	        if (original == output) {
	            System.out.println("The number " + original + " is a Palindrome.");
	        } else {
	            System.out.println("The number " + original + " is not a Palindrome.");
	        }
	    }
	}
