import java.util.Scanner;

class IfDemo{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		/*
			1. simple if
			2. if else
			3. if elseif lader
			4. nested if
		*/


		// simple if

			System.out.println("Enter the day");
			int day = sc.nextInt();

			if(day == 5){

				System.out.println("Friday");

			}


		// if else 

			if(day >= 1 && day < 6){
				System.out.println("Working Day");
			}else{
				System.out.println("Holiday");
			}


		// if else ladder

			if(day < 1 ||  day > 7){
				System.out.println("Wrong Input");	
			}else if( day >= 1 && day <= 3){
				System.out.println("Week begining");
				}else if(day > 3 && day < 6){
						System.out.println("Week last days");
					}else if(day == 6 || day == 7){
						System.out.println("Week end days");
					}

					/*
					
					if(day < 1 ||  day > 7){
						System.out.println("Wrong Input");	
					}
			 		if( day >= 1 && day <= 3){
						System.out.println("Week begining");
					}
					if(day > 3 && day < 6){
						System.out.println("Week last days");
					}
					if(day == 6 || day == 7){
						System.out.println("Week end days");
					}
					*/


			// nested if 

			if(day == 6 || day == 7){

				if(day == 6){
					System.out.println("Saturday");
				}else {
					System.out.println("Sunday");
				}
			}




	}
}