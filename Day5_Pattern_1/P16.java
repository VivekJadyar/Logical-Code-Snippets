
class P16 {
	
	public static void main(String args []) {
		
		for (int rows = 1; rows <= 5; rows++) {
			
			for (int column = 5; column >= 5 -  (rows - 1); column--){
				
				System.out.print(column + " ");
				
			}
			
			System.out.println();
			
		}
		
	}	
	
}