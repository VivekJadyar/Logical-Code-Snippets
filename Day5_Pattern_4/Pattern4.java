
class Pattern4 {
	
	public static void main(String args []) {
		
		for (int rows = 1; rows <= 6; rows++) {
			
			for (int spaces = rows; spaces < 6; spaces++){
				
				System.out.print(" ");
				
			}
			
			for (int star = 1; star <= rows; star++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
			
		}				
		
	}
	
}

	
	