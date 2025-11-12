package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number = 2;
		boolean isPrime = true;
		
		for(int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			} 					
		}
		
		if (isPrime) {
		System.out.println(number+ " Is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}
}