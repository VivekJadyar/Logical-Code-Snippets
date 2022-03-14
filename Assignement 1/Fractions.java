
import java.util.Scanner;

class  Fractions{

	public static void main(String [] args) {
		int num;
		int digit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num = input.nextInt();
		
		for (int a = 2; a < num; a++){
			if(num % a == 0){
				System.out.println(num / a);
				num /= a;
				a = 2;
			}
			if(a == num)
				break;
		}
		
	}

}





