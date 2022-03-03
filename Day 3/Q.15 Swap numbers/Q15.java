
class Q15
{
	public static void main(String args[])
	{
			
		int num1 = 45, num2 = 10;
		
		System.out.println("initial value of num1: " + num1);
		System.out.println("initial value of num2: " + num2);
		
		num1 += num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("\nafter value of num1: " + num1);
		System.out.println("after value of num2: " + num2);

	}
}






