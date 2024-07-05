import java.util.Scanner;
class PrimeNumbersUptoN{
	public static void main(String args[]){
		
			System.out.println("Enter the values of a and b to find the prime numbers in bitween ");
			int start = Utility.getI();
			int end = Utility.getI();
			 //findThePrimeNumbers(a,b);
			System.out.println("The prime numbers are ");
			for (int i =start; i <= end; i++) {
				if (isPrime(i)){
                	System.out.print(i + " ");
            	} 

            }
        	

		}
		public static boolean isPrime(int a) {
    		if (a <= 1) {
       			return false;
    		}
    
    		for (int i = 2; i < a; i++) {
	        	if (a % i == 0) {
	            	return false;
	        	}
        	}
    		return true;
    	}
}

		

	
	
