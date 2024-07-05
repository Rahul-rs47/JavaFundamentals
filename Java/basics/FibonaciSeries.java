import java.util.Scanner;
	class FibonaciSeries{
		public static void main (String args[]){

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of fibonacci digits to be extracted");
			int number = sc.nextInt();

			
			getFibonacciNumbers(number);// function calling

		}	


		public static int getFibonacciNumbers(int number){
	
			int i=0;
			int newfib;
			int num1=0;
			int num2=1;
			System.out.println(num1);
			while(i<number){
				newfib = num1 + num2;
						
				System.out.println(newfib);
				num2=num1;
				num1=newfib;
		
				i++;
			
			} return 0;


		}    


	}