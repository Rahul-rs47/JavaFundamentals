import java.util.Scanner;
	class AmstrongNumber{
		public static void main(String args[]){

			int number = 9474;
			int length =getLength(number);

		 	
			System.out.println(length);

			System.out.println("the number is amstrongNumber is " + checkAmstrongNumber(number,length));

		}

			public static boolean checkAmstrongNumber(int input,int length){

				int amstrongnumber =0;
				int i =0;
				int number = input;
				boolean isAmstrong;

				
				while(i<length){
					int lastdigit  =number % 10;
					amstrongnumber	= amstrongnumber + (int)(Math.pow(lastdigit,length));
					number /=10;
					i++;
				}
				System.out.println(number);
				System.out.println(amstrongnumber);



				if (amstrongnumber == input){
					isAmstrong = true;
				}else{
					isAmstrong = false;
				}
				return isAmstrong;



			}


		
			public static int getLength(int number){
				int length =0;
				while(number !=0){
					number /=10;
					length ++;
				}
			return length;
			}
	}