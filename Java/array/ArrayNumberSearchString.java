import java.util.Scanner;
	class ArrayNumberSearchString{
		public static void main(String args[]){
			System.out.println("Enter the size of the array ");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int values[] = new int [size];

			System.out.println("Enter the numbers for the array");

			for(int i=0;i<values.length;i++){
				values[i] = sc.nextInt();
			}

			System.out.println("Enter the number to be searched ");
			int numbSearch = sc.nextInt();

			//boolean isfound = true;
			String location="";
			int count =0;

			for(int i=0;i<values.length;i++){
				if(values[i] == numbSearch){
					//location =  i+1;
				//	System.out.println(location);
					if(location.equals("")){
						location = location + (i+1);
					}else {
						location = location + ", " + (i+1); 
					}
					
					count ++;
					//location = location + i;
				}

			}
			
			System.out.println("The given numbers are :\n");
				for(int i =0;i<values.length;i++){
					System.out.print(values[i] + " ");
				}
				System.out.println("\n");
			if (count == 0){
				System.out.println("  The given number " + numbSearch + " is not found in the array \n");
			}else{
				System.out.println("The given number  " + numbSearch + " is found " + count + " times in the array at locaitons  : " + location);
			}





		}
	}