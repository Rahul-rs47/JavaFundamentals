import java.util.Scanner;
class ArrayPassByRefereceValues{
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

		arraySort(values); // pass by Reference (Array is a reference type )

		System.out.println("\nThe sorted final  array is :-");
		arrayPrint(values);

		int k =10;
		changeValue(k);// pass by value (int is a primitive data type)
		System.out.println(k);

	} 

	public static void  arraySort(int [] output){
		int c;

		for(int i=0;i<output.length-1;i++){
			for(int j=i+1;j<output.length;j++){
				if(output[i] > output[j])
				{
					c=output[i];
					output[i]=output[j];
					output[j]=c;
				}
			
			}

		}
	}

	public static void arrayPrint(int []values){
		for(int j =0 ;j<values.length;j++){
			System.out.print(values[j] + " ");
		}

	}

	public static void changeValue(int value){
		value = value + 10;
		System.out.println("value:- " + value );

	}
}