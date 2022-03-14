import java.util.Scanner;

class BinDec {

	public static void main (String [] args) {
	
		Scanner input = new Scanner(System.in);
		int num, rem;
		String revBin = "";
		String bin = "";
		
		System.out.println("Enter the number: ");
		num = input.nextInt();
		
		while(num != 0) {
			rem = num % 2;
			
			if (rem == 1) 
				revBin += 1;
			else
				revBin += 0;
			
			num = num / 2;					
		}
		
		for (int i = revBin.length() - 1; i >= 0; i--)
			bin = bin + revBin.charAt(i);
		
		System.out.println(bin);
	}

}