import java.util.Scanner;
class FactorialFunction{ // To find factorial using function
	public static void main(String args[]){

		System.out.println("Enter the value to find its factorial");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("The factorial of " + n + "is " + findFactorial(n));
	}

	

	public static int findFactorial(int n){

		int fact =1;
		int k =1;
		do{
			fact *= k;
			k++;

		}while(k <= n);

		return fact;
	}

}