import java.util.Scanner;
	class BinaryToDecimal{
		public static void main (String args[]){

			System.out.println("Enter the Binary Number to be converted to Decimal ");
			Scanner sc = new Scanner(System.in);
			int binary = sc.nextInt();



			
			//int binary =11100;
			int length = getLength(binary);
			//System.out.println(length);
			System.out.println("The decimal value of " + binary +" is "+getDecimal(length,binary));
		}
			public static int getLength(int binary){

				int length =0;
				while(binary != 0){
					binary = binary / 10;
					length ++;
				}
				
				return length;
			}
			
			public static int  getDecimal(int length,int binary){
				int i = 0;
				int number =0;
				while(binary >0){ //(i <= length){

					int last  = binary % 10;//gives last digit
					number = number + last * (int)(Math.pow(2,i));
					binary /=10 ;
					i++;
				}
				 
				return number;
			}
		

	}