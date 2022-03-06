
class P10 {
	
	public static void main(String args []) {
		
		for (char rows = 0; rows < 5; rows++) {
			
			for (int space = 5; space > rows; space--)
				
				System.out.print(" ");
			
			for (char column = (char)('E' - rows); column <= 'E'; column++){
				
				System.out.print(column + " ");
				
			}
			
			System.out.println();
			
		}
		
	}	
	
}