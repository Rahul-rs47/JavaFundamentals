import java.util.Scanner;
	class CheckPrime{ // to check if number is prime or not prime
		public static void main(String args[]){
			System.out.println("Enter the number to be checked ");
			int num = Utility.getI();

			boolean isPrime = true;


			for(int i=2; i < num; i++){

				if(num % i == 0){
					isPrime = false;
					break;// to exit loop 
				}
			}

			if(isPrime == true){
				System.out.println("The given Number " + num + " is prime ");
			}else {
				System.out.println("The given Number " + num + " is not  prime ");
			}

			System.out.println("The numer is Prime " + isPrime(num));

		}

		public static boolean  isPrime(int value){
			boolean flag = true;

			for (int i=2; i<value; i++){
				if(value % i == 0){
					 flag = false;
					break;
				}
			}

			return flag;



		}
	}