import java.util.Scanner;
	class ArrayNumberCount{
		public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Enter the array of numbers");
		int values[] = new int [size];
		
		

			for(int i=0;i<values.length;i++){     // storing array of numbers
				 values[i] = sc.nextInt();
			}

		System.out.println("Enter the number to be searched in the array of numbers");
		int numsearch = sc.nextInt();
		int count =0;
		boolean  found =false;
		for(int i=0;i<values.length;i++){
				if(values[i] == numsearch){
					if(found){
					System.out.print(",");
				}
			System.out.print(i+1);
				found = true;

				count ++;
			}
			
		}
		System.out.println("\n " + count);
			if (count == 0){
			System.out.println(" The searching number is not found in the array");

			}else{
			System.out.println("The number of times the searching number appears is " + count);
			}


		}
	}