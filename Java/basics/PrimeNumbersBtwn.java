import java.util.Scanner;   // error
	class PrimeNumbersBtwn{

		public static void main(String args[]){
			System.out.println("Enter the values of a and b to find the prime numbers in bitween ");
			int a = Utility.getI();
			int b = Utility.getI();
			 //findThePrimeNumbers(a,b);

			for (int i =a; i <= b; i++) {
				boolean m = findThePrimeNumbers(i);
            	if (findThePrimeNumbers(i)) {
                System.out.println(i + " ");
            	} else{
            		break;
            	}
        	}

		}
		public static boolean findThePrimeNumbers(int a) {
    		if (a <= 1) {
       		 return false;
    		}
    
    		for (int i = 2; i <= a; i++) {
        	if (a % i == 0) {
            	return false;
        		}
        	}
    		return true;
    	}
}

		

	