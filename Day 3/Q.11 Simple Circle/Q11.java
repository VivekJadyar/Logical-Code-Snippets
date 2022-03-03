import java.util.Scanner;

class Q11
{
	public static void main(String args[])
	{
		float rad, per, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number radius of circle: ");
		rad = input.nextFloat();
		
		System.out.println("Perimeter is " + (2 * (22.0 / 7.0) * rad));
		System.out.println("Area is " + ((22.0 / 7.0) * rad * rad));
	
	}
}








