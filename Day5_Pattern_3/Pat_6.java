
class Pat_6 {
	
	public static void main(String [] args) {
	
		for (int rows = 9; rows >= 1; rows--) {
							
				for (int spaces = 9; spaces > rows; spaces--) {
					
					System.out.print(" ");
					
				}
				
				for (int num = 1; num <= rows; num++) {
				
				System.out.print("* ");
				
				}
							
			System.out.println();
			
		}
	
	}

}