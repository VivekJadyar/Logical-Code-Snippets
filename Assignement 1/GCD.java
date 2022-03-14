import java.util.Scanner;

class GCD {

	public static void main(String [] args) {
	
		Scanner input = new Scanner(System.in);
		int num1, num2, i = 1, gcd = 1;
		
		System.out.print("Enter the number1: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the number2: ");
		num2 = input.nextInt();
		
		for (i = 1; i < num1 && i < num2; i++) {
		
			if(num1 % i == 0 && num2 % i == 0)
				gcd = i;
		
		}
		
		System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
	
	}

}