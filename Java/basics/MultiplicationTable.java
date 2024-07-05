import java.util.Scanner;
class MultiplicationTable{
	public static void main(String args[]){
		
		System.out.println("Enter the value the fixed value p and enter the number of multiplication  iteration value required  ");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int n = sc.nextInt();


		for( int i = 1; i <= n; i++){
			
			System.out.println( p + " x " + i + " = " + i*p);
			
		}
		 
	}

}