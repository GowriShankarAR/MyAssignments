package week1_homeassignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean flag = false;
		for (int i = 2; i<=input/2; i++) {
			if (input % i ==0) {
				flag = true;
				break;
			}

}
		if (flag==false)
			 System.out.println(input + " is a prime number.");
		else
		  System.out.println(input + " is not a prime number.");
}
}	