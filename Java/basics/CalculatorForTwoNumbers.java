import java.util.Scanner;

	class CalculatorForTwoNumbers {
		public static void main (String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please enter the two values for Arithmetic operations");
			float a = sc.nextFloat();
			float b = sc.nextFloat();


			

			float sum = findSum(a,b);
			float diff = findDiff(a,b);
			float division = findDiv(a,b);
			float product = findProduct(a,b);
			
			System.out.println(" The sum of " + a +" and " + b + " is " + findSum(a,b));

			System.out.println(" The difference of " + a +" and " + b + " is " + diff);

			System.out.println(" The division of " + a +" and " + b + " is " + division);

			System.out.println(" The product of " + a +" and " + b + " is " + product);

			System.out.println(" the sum of a and b is " + (a + b));







		}
			public static float findSum(float value1, float value2){
				
			    return 	 value1 + value2 ;

			}

			public static float findDiff(float value1,float value2){
				
			     
			    return  value1 - value2 ;	

			}

			public static float findDiv(float value1,float value2){
				
			     
			    return  value1 / value2 ;	

			}

			public static float findProduct(float value1,float value2){
				
			 
			    return  value1 * value2 ;	

			}
	}
