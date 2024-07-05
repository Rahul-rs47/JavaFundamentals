import java.util.Scanner;
	class LargestOfThree{

		public static void main(String args[]){

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 3 digits to check the LargestOfThree");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a>b && a>c) {
				System.out.println( a + " is the Largest Of the  Three numbers among  " + a + ", " + b + " , "+ c);

				}else if (b>a && b>c){
					System.out.println( b + " is the Largest Of the  Three numbers among  " + a + ", " + b + " , "+ c);
					}
					else{
						System.out.println( c + " is the Largest Of the  Three numbers among  " + a + ", " + b + " , "+ c);
					}

		}
	}