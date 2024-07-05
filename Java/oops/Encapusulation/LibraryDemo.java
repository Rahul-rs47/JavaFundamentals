import java.util.Scanner;
class LibraryDemo {
	//static String[] libraryStack = {"Java","Spring","HTML","CSS","React"};

	static String[][] libraryStack = { 
									   {"1","Java",""},
									   {"2","Spring",""},
									   {"3","HTML","saravanan"},
									   {"4","CSS",""},
									   {"5","React",""}
									};
	
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		int size = 5;
		
		/*	for (String x : libraryStack){
				System.out.println(x);

			}	*/

		while(true){
			System.out.println("\n******************");
			System.out.println("Library Menu");
			System.out.println("******************");
			System.out.println("1.Display All Books");
			System.out.println("2.Status of Particular Book ");
			System.out.println("3.Issue Book");
			System.out.println("4.Return Book ");
			System.out.println("5.Borrower Search");
			System.out.println("6.Exit Menu");
			System.out.println("Enter the options(1-6)");
			int service = sc.nextInt();
			sc.nextLine();


			String bookName, bookDetails, borrower, bookStatus;

			String[] details;
			int index ;
		

			switch(service){

			case 1 :
					displayAllBooks();

				break;

			case 2 :
			// Status of particular book
					displayAllBooks();
					System.out.println("Please Enter the name of the book");

					bookName = sc.nextLine();
					bookDetails = getAvailableBookIndex(bookName);
					details = bookDetails.split("#");

					bookStatus = details[0];
					index = Integer.parseInt(details[1]);
					borrower = details[2];
					
					String output1 = bookName + " book is " + bookStatus;
					String output2 =(borrower.equals(" ")) ?  output1 : output1 + " by " + borrower;


					System.out.println(output2);
					
				break;
			case 3 :
					displayAllBooks();
					System.out.println("Please choose your book  from the available library books");
					bookName = sc.nextLine();

					bookDetails = getAvailableBookIndex(bookName);
					details = bookDetails.split("#");
					bookStatus = details[0];
					index = Integer.parseInt(details[1]);
					borrower = details[2];

					if(index > -1){

							if(borrower.equals(" ")){

									System.out.println("Please	enter the borrowers name to avail this book");
									String	borrowerName = sc.nextLine();
									libraryStack[index][2] = borrowerName;

									System.out.println(bookName +" book is issued to " + borrowerName);


							}else{

								System.out.println("Sorry ! " + bookName +" book is already issued to " + borrower);
							}
						
						

					}else{

						System.out.println(bookName + " book is "  + bookStatus);
					}

					


				break;

			case 4 :
					System.out.println("Please Enter the book name to return");

					bookName = sc.nextLine();
					bookDetails = getAvailableBookIndex(bookName);
					details = bookDetails.split("#");

					bookStatus = details[0];
					index = Integer.parseInt(details[1]);
					borrower = details[2];

					if(index > -1){

							if(borrower.equals(" ")){
								System.out.println(bookName +" book is not issued to anyone");
							}else{
								libraryStack[index][2] = "";
								System.out.println( bookName +" book is returned by "  + borrower);
							}
						
						

					}else{

						System.out.println(bookName + " book is "  + bookStatus + " in the library");
					}


				

				break;

			case 5 :
					System.out.println("Please Enter the borrower name");

					String borrowerSearch = sc.nextLine();
					getBookByBorrowerName(borrowerSearch);
					

				break;

				

			case 6 :System.out.println("Thanks for using Library ");
					

					System.exit(0);
				

				break;
			default :

					break;

			}

		}


	}
	
	public	static String checkStatus(int index){
		String status = "Not Available";
		if(libraryStack[index][2].equals("")){
				status = "Available";
		}
		return status;
	}

	public static void displayAllBooks(){
		System.out.println("\nBooks details in the Library");
		System.out.println("*****************************");
		for(int i=0;i<libraryStack.length;i++){
			System.out.println("Book id : " + libraryStack[i][0] + " " + libraryStack[i][1]+ " " + checkStatus(i));
		}
		System.out.println("*****************************\n");

	}
	public static boolean isAvailable(String bookName){

		boolean flag = false;
		for(int i=0;i<libraryStack.length;i++){
							
			if (bookName.equalsIgnoreCase(libraryStack[i][1]) && (libraryStack[i][2].equals("")) ){
				flag = true;
				break;
			}
		}	
		return	flag;
	}
	public static String getAvailableBookIndex(String bookName){

		int index =-1;
		String result ="not available";
		String	borrower = " ";
		for(int i=0;i<libraryStack.length;i++){
							
			if (bookName.equalsIgnoreCase(libraryStack[i][1]) && (libraryStack[i][2].equals("")) ){
				index =i;
				result = "available";
				break;
				
			}else if(bookName.equalsIgnoreCase(libraryStack[i][1])){
				index =i;
				result = "borrowed";
				borrower = libraryStack[i][2];
				break;
			}
		}
		result = result + "#" + index + "#" + borrower;	
		return	result;
	}
	public static boolean	 getBookDetails(String bookName){

		boolean	flag = false;
		for(int i=0;i<libraryStack.length;i++){
							
			if (bookName.equalsIgnoreCase(libraryStack[i][1]) && (libraryStack[i][2].equals("")) ){
				flag = true;
				break;
			}
		}	
		return	flag;
	}

	public static void getBookByBorrowerName(String name){
		
		//boolean flag =false;
		for(int i=0;i<libraryStack.length;i++){
			if (name.equals(libraryStack[i][2])){
				System.out.println("Book id : " + libraryStack[i][0] + " " + libraryStack[i][1]+ " " + "borrowed by" + name);
			}//flag =true;	
		}
	}

	

}

