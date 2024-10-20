package week1_homeassignment;

public class FindIntersection {

	public static void main(String[] args) {
		 // Declare two arrays
        int[] a = {3, 2, 11, 4, 6, 7};
        int[] b = {1, 2, 8, 4, 9, 7};

        // Outer loop to iterate through the first array
        for (int i = 0; i < a.length; i++) {
            // Inner loop to iterate through the second array
            for (int j = 0; j < b.length; j++) {
                // Compare elements from both arrays
                if (a[i] == b[j]) {
                    // Print the matching value from the first array
                    System.out.println("Match found: " + a[i]);
                }
            }
        }

	}

}
