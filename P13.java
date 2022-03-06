
class P13 {
	
	public static void main(String args []) {
		
		for (char rows = 'A'; rows <= 'E'; rows++) {
			
			for (int space = 'E'; space > rows; space--)
				
				System.out.print(" ");
			
			for (char column = 'A'; column <= rows; column++){
				
				System.out.print(rows + " ");
				
			}
			
			System.out.println();
			
		}
		
	}	
	
}