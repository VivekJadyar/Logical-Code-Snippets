
class Pattern3 {
	
	public static void main(String args []) {
		
		for (int rows = 6; rows >= 1; rows--) {
			
			if (rows != 6){
				
				System.out.print("*");
				
				for (int spaces = 1; spaces <= rows - 2; spaces++) {
				
					System.out.print(" ");
				
				}
				
				if (rows != 1)
					System.out.print("*");
				
			}
			
			else
				for (int star = 1; star <= rows; star++)
					System.out.print("*");
			
			System.out.println();
			
		}				
		
	}
	
}

	
	