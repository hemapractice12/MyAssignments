package week1.day2;

public class PalindromeCheck {

	public static void main(String[] args) {
		int input = 542;
		int output = 0;
		for(int i = input; i > 0;){
			int rem = i % 10;
			output = output * 10 + rem;
			i = i/10; 
		}
						
		if (input == output)
		{
			System.out.println(input + " is a palindrome");
		}
		else
		{
			System.out.println(input + " is not a palindrome");
		}
	}
}
