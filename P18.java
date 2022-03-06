
class P18 {
	
	public static void main(String args []) {
				
		for (int rows = 1; rows <= 5; rows++) {
			
			for (char column = 'A'; column <= 'E' - (rows - 1); column++){
				
				System.out.print(column + " ");
				
			}
			
			System.out.println();
			
		}
		
	}	
	
}