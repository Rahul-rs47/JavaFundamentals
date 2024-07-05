import java.util.Scanner;

	class DecimalToBinary{
		public static void main(String args[]){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the value of decimal number to be converted to binary");
			int number = sc.nextInt();

			
			findDecimalToBinary(number);
			System.out.println("The binary nuber of  " + number +  " is " + findDecimalToBinary(number));

		}			
		
		public static int findDecimalToBinary(int number){

			int  binary =0;
			int reminder;
			int i =0;
			while(number >0){
				reminder = number % 2;
				number = number / 2;
				binary = binary + reminder * (int)(Math.pow(10,i))  ;
				i++;
			}

			return binary;
			
		}
		

			

	}