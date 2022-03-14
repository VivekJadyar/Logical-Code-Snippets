
import java.util.Scanner;

class  PrintDigit{

	public static void main(String [] args) {
		int num;
		int digit;
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num = input.nextInt();
		
		while (num != 0) {
			digit = num % 10;
			System.out.print(digit + "	");
			num /= 10;
		}
		
	}

}