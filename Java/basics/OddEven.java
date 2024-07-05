
import java.util.Scanner; // Scanner class import util - package

class OddEven {

	public static void main(String args[]){

		Scanner sc =  new Scanner(System.in);  // create an object of the class Scanner;

		int num1;

		System.out.println("Enter the number to be checked");
		num1 = sc.nextInt();

		if(num1 % 2 == 0){
			System.out.println(num1 + " is an even Number");
		}
		else{
			System.out.println(num1 +" is an odd Number");
		}

	}
}