import java.util.Scanner;
	class NumberSearchArray{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size of the array ");
			int size = sc.nextInt();
			
			System.out.println("Enter the values for the array for the given size  " + size);
			int values [] = new int[size];
			for(int i=0;i<values.length;i++){
				values[i] = sc.nextInt();
			}
			
			
			System.out.println("enter the value to be searched ");
			int numsearch = sc.nextInt();

			System.out.println("The given values are : ");

			for(int i=0;i<values.length;i++){
				System.out.print(values[i] + " ");
			}
			int position = -1 ;
			
			for(int i=0;i<values.length;i++){
				
				boolean flag = true;
				if(values[i] == numsearch){
					position = i+1;
					
					break;
				}

			}
			if(position != -1){
				System.out.println("\n " + numsearch + "  is at position : " + position);
			}

			else {
					System.out.println("the searching number \n"+ numsearch +" is not found in the array");

				}
			


		}
	}