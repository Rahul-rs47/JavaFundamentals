import java.util.Scanner;
class ArraySort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array ");
		int size = sc.nextInt();
		int values[] = new int[size];

		System.out.println("Enter the array : ");
		for(int i=0;i<values.length;i++){
			 values[i]=sc.nextInt();
		}

		System.out.println("The array is : ");
		for(int i =0 ;i<values.length;i++){
			System.out.print(values[i] + " ");
		}

		int sortvalues [] = new int [size];
		/*
		for(int i=0;i<sortvalues.length;i++){
			sortvalues[i]	= values[i];	
		}*/

		sortvalues = values;


		System.out.print("\n");

		System.out.print("The sortvalues is : ");
		for(int i =0 ;i<sortvalues.length;i++){
			System.out.print(sortvalues[i] + " ");
		}

		

		int c;

		for(int i=0;i<size-1;i++){
			//System.out.println();
			for(int j=i+1;j<size;j++){
				if(sortvalues[i] > sortvalues[j])
				{
					c=sortvalues[i];
					sortvalues[i]=sortvalues[j];
					sortvalues[j]=c;

									}
			//	arrayPrint(values);
				//System.out.println();
			}
			
		}
		System.out.println();
		
		System.out.println(" The sorted final  array is :-");


		/*for(int i =0 ;i<sortvalues.length;i++){
			System.out.print(sortvalues[i] + " ");


		}*/
		arrayPrint(sortvalues);

		System.out.println();
		System.out.println(" The original array is :- ");
		arrayPrint(values);

	} 

	public static void arrayPrint(int [] values){
		for(int j =0 ;j<values.length;j++){
			System.out.print(values[j] + " ");
		}

	}
}