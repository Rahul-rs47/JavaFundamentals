import java.util.Scanner;
	class ArrayDemo1{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			int size = sc.nextInt();

			int values[] = new int [size]; // array declartion


			for(int i=0; i<values.length; i++){
				values[i]=sc.nextInt();
			}

			for(int i=0; i<values.length;i++){
				System.out.print(values[i] + " ");
			}




		}
	}