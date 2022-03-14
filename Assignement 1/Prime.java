
import java.util.Scanner;

class Prime   
{

	public static void main(String args []) {
		
		int num, mod, count = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num = input.nextInt();
		
		for (int i = 2; i <= (num/2); i++) {
			
			if ((num % i) == 0) {
				count++;
				break;
			}				
		}
		
		if (count !=  0)
			System.out.println("the number is not Prime number.");
		else 
			System.out.println("the number is Prime number.");
	}
	
}    

