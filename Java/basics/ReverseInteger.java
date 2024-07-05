 import java.util.Scanner;
 	class ReverseInteger{
 		public static void main(String args[]){

 			Scanner sc = new Scanner(System.in);
 			System.out.println("Enter the interger numbers to be reversed ");
 			int number = sc.nextInt();

 			int newnumber = findReverseNumber(number);
 			System.out.println( "The reversed integer number is " + newnumber);

 		}


 		public static int findReverseNumber(int value){

 			int reverseInteger = 0;
 			int extract;
 			while(value!=0){
			
	 			extract = value % 10 ;
	 			reverseInteger = reverseInteger * 10 + extract;
	 			value = value / 10;

 			}
 			return reverseInteger;
 			
 		}

 }