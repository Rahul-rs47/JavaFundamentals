import java.util.Scanner;
class MatrixAddition{
	public static void main(String args[]){
		scanner sc = new Scanner(System.in);
		int size=sc.nextInt();

		int matrixA [][] = new int [size][size];
		for(i=0;i<=size.length;i++){
			for(j=0;j<=size.length;j++){
				matrixA[i][j]= sc.nextInt();

			}
		}

		System.out.println("The entered matrix is:");
		for(i=0;i<=size.length;i++){
			for(j=0;j<=size.length;j++){
				System.out.print(matrixA[i][j]);
			}
		}



	}
}