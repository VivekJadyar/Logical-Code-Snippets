
class Swap {

	public static void main(String [] args) {
	
		int num1 = 15;
		int num2 = 45;
		
		System.out.println("Initial values num1: " + num1 + " num2 : " + num2);
		
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		
		System.out.println("After values num1: " + num1 + " num2 : " + num2);
	
	}

}