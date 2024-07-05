import java.util.Scanner;
class TwoDimensionalArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[][] = new int [size][size];
		
		System.out.println("Enter the array");
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					 a[i][j] = sc.nextInt();

			}
		}

		System.out.println("The Entered Array is ");
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j] + " ");
				}
				System.out.print("\n");
			}


		System.out.println("The diagonal sum of the array:-");
		int sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i==j){
					sum += a[i][j];	
				}
			}
		}System.out.println(sum);
		


		System.out.println("The diagonal sum :");
		int sum1=0;
		int max =a.length-1;
		int min =0;
		for(int k=0;k<a.length;k++){
			
			sum1 +=a[max-k][min + k];
						
		}
		System.out.println(sum1);


	}
}