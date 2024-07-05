import java.util.Scanner;
class Factorial{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial ");


		int n = sc.nextInt();
		int fact = 1;

		
	/*	for (int i = 1; i <= n; i++){
			
			fact = fact * i; 
			
		}

		int p = 1;
		while( p <= n){
			fact *=  p;
			p++;
		}

	*/
		int k = 1;
		do{
			
			fact *= k;
			k++;

		}while (k <= n);
		

		System.out.println("The factorial of " + n  + " is " + fact );

	
	}
}

