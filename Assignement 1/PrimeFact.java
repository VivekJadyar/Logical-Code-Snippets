
import java.util.Scanner;

class PrimeFact   
{

	public static void main(String args []) {
		
		int num, mod, count = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = input.nextInt();
		int number = num;
		
		for (int a = 2; a < num; a++){
			if(num % a == 0){
				number = num / a;
											//----------------
				for (int i = 2; i <= (number/2); i++) {
			
			if ((number % i) == 0) {
				count++;
				break;
			}				
		}
		
		if (count !=  0)
			System.out.println(number);
											//--------------
				
				num /= a;
				a = 2;
			}
			if(a == num)
				break;
		}
		
	}	
	
}    


		