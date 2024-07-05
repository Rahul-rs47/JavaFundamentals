 import java.util.Scanner;
 class ForDemo {
 	public static void main(String args[]){

 		/*for(int i=1; i<= 10; i++){                                   // used when we know the number of out comes, entry check 
 			System.out.println("Welcome to Java Programming! " + i);
 		}

*/
 		int j = 1;// eg; we don't know the number of outcomes required 

 		while(j<=10){
 			System.out.println("Welcome to Java Programming! " + j);
 			j++;
 		}


 		// Exit check

 		int k = 1;

 		do{

 			System.out.println("Welcome to Java Programming! " + k);
 			k++;

 		}while(k<=10);
		
 	}
 }