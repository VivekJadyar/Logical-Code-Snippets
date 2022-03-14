
import java.util.Scanner;

class  Palindrome{

	public static void main(String [] args) {
		int num, temp, rev = 0, digit;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		num = input.nextInt();
		temp = num;
		
		while (num != 0) {
			digit = num % 10;
			rev *= 10;
			rev = rev + digit;
			num /= 10;
		}
		
		if(temp == rev)
			System.out.print("Number is Palindrome");
		else
			System.out.print("Number is not Palindrome");
				
	}

}