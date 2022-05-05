import java.util.Scanner;

class Sort{								// working
	
	int[] sorting(int a1[]){
		for(int i = a1.length - 1; i >= 0; i--){
			int temp = a1[i];						// holidng value
			int j = i - 1;
			while(j > -1 && a1[j] > a1[i] ){
				a1[j + 1] = a1[j];
				j = j - 1;	
			}
			a1[j + 1] = temp;
		}
		return a1;
	}
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Sort st = new Sort();
		
		int n = input.nextInt();			// no of elements
		
		int stack[] = new int[n];
		System.out.println("Enter Unsorted array: ");
		for(int i = 0; i < stack.length; i++){
			stack[i] = input.nextInt();
		}
		
		stack = st.sorting(stack);
		
		System.out.println("Sorted array: ");
		for(int i: stack){
			System.out.print(i + " ");
		}
		
	}
	
}