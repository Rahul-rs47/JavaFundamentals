import java.util.Scanner;
		class ToTest{

			public static void main(String args[]){

				Scanner sc = new Scanner(System.in);

					System.out.println("Please enter the energy consumed in kWh (unit)");
					double a, b ;
					 a = sc.nextInt();
					 b =(730 + (a - 200) * 5.10);
					System.out.println( b );

			}
		}