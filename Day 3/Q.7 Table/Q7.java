
import java.util.Scanner;

class Q7
{
	public static void main(String args[])
	{
		
	int num;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	num = input.nextInt();
	
	System.out.println("\n");
	
	for (int i = 1; i <= 10; i++) {
		System.out.println(num + " x " + i + " = " + (num * i));
	}
	
	}
}






