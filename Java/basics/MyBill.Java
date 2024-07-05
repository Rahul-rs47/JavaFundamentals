import java.util.Scanner;
		class MyBill{

			public static void main(String args[]){

				Scanner sc = new Scanner(System.in);

					System.out.println("Please enter the energy consumed in kWh (unit)");

					double units = sc.nextInt();
					System.out.println(" The Entered " + units + "units");
					double amount = findX(units);
			        long rounded = Math.round(amount); 
                    System.out.println(rounded);
                 // System.out.println(amount); 
                    System.out.println(" The approximate amount Generated is " + rounded +"/-" );


			}
			public static double findX(double value){
				double b ;
			//	b = b + 10 ;
				//System.out.println(b);

					if (value <= 100 && value >= 0 ){		// for value less than 100		
						b = value * 3.25 ;						
					}else if (value <= 200 && value >= 101 ){ // for value less than 200
						b =(325 + (value - 100) * 4.05);
						}else if (value <= 300 && value >= 201 ){ // for value less than 300 
							b =(730 + (value - 200) * 5.10);
							}else if (value <= 400 && value >= 301)	{
								b = (1240 + (value - 300) * 6.95 ) ;
								}else if (value <= 500 && value >= 401)	{
									b = (1935 + (value - 400) * 8.20) ;
									}else if (value <= 600 && value >= 501)	{
										b = value  * 6.40 ;
										}else if (value <= 700 && value >= 601)	{
											b = value  * 7.25 ;
											}else if (value <= 800 && value >= 701)	{
												b = value  * 7.6 ;
												}else if (value <= 1000 && value >= 801)	{
													b = value  * 7.9 ;
													}else if (value >= 1001)	{
														b = value  * 8.80 ;
														}
								return b;


			}

			


		}