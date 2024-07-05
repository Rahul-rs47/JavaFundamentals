
import java.util.Scanner; // Scanner class import util - package

class OddEvenFunction {

	public static void main(String args[]){

		Scanner sc =  new Scanner(System.in);  // create an object of the class Scanner;

		int num1;

		System.out.println("Enter the number to be checked");
		num1 = sc.nextInt();

		String output = findOddOrEven(num1);

		System.out.println("The given value " + num1 + " is " +  output);

		boolean result = isEven(num1);

		System.out.println(" The given vlaue " + num1 + " is even - " + result );


		
	}

	public static String findOddOrEven(int value){
		String result;
		if (value % 2 == 0){
					result = "even";

		}else {
			result = "odd";

		}
		return result;


	}

	public static boolean isEven(int value){


		boolean result;
		if (value % 2 == 0){
					result = true;
		}else {
			result = false;

		}
		return result;
	}

}