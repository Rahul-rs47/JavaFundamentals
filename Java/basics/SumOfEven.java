import java.util.Scanner;
	class SumOfEven{    // To find the sum of N even numbers
		public static void main (String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("The value of n ");
			int n = sc.nextInt();

			int sum = 0;

			for (int i = 0;i<= n * 2;i++){


				if (i % 2 == 0){
							
				sum += i;
				}

			}


			System.out.println(sum);

			int sum1 = findSumOfNEven(n);

			System.out.println(sum1);

			System.out.println(findSumOfOddUptoN(n));

		}

		public static int findSumOfNEven(int n){

			int count = 0;
			int value = 0;
			int sum = 0;
			while(count <= n){
				if(value % 2 == 0){
					sum += value;
					count ++;
				}
				value ++;


			}
			return sum;

		}

		public static int findSumOfOddUptoN(int n ){

			
			
			
			int sum = 0; 


				for(int k =1; k <= n;k++){

					if (k % 2 != 0){

					sum += k;
				    }
			    }
			
				return sum;
		}



}