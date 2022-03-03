import java.util.Scanner;

class Q6
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a, b; 
		
		System.out.println("Enter the number_1: ");
		a = input.nextInt();
		System.out.println("Enter the number_2: ");
		b = input.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
	
	}
}






