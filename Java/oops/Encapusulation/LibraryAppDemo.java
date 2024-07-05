class LibraryAppDemo{
	
	static Book books[] = {
							new Book(101,"Java","Saravana M","not issued"),
							new Book(102,"HTML","Rahul","not issued"),
							new Book(103,"Spring boot","Anuraaag",""),
							new Book(104,"CSS","Ahana","not issued"),
							new Book(105,"React JS","Sanya","not issued"),

						};

	public static void	main(String args[]){

		int service;

		String bookName,bookDetails;
		boolean bookStatus;
			int index,bookId;

			String[] details;

		while(true){
		    System.out.println("\n******************");
			System.out.println("Library Menu");
			System.out.println("******************");
			System.out.println("1.Display All Books");
			System.out.println("2.Status of Particular Book ");
			System.out.println("3.Issue Book");
			System.out.println("4.Return Book ");
			System.out.println("5.Borrower Search ");
			System.out.println("6.Search by book Id/book name ");
			System.out.println("7.Exit Menu");
			System.out.println("Enter the options(1-5)");
			
			service = Helper.getI();


			
			


			switch(service){

			case 1:

				displayAllBook();

				break;

			case 2:

				try{

						System.out.println("Please Enter the name of the book");
						bookName = Helper.getS();
						bookDetails = getAvailableBookDetail(bookName);

						details = bookDetails.split("#");
						index = Integer.parseInt(details[1]);
						String bookCurrentStatus = details[0];
						String borrower = details[2];



						if( bookCurrentStatus.equals("available")){
							System.out.println("The book " + bookName + " is available");
							}
							else if(bookCurrentStatus.equals("borrowed")){
								System.out.println("The book  " + bookName + " is borrowed by " + borrower);

							}else {
								System.out.println("The book " + bookName + " is not available");
							}

				}catch(Exception e){

					System.out.println("Error : LibraryAppDemo - Status of Particular Book " + e.getMessage());

				}
				
				

				
				
				break;

			case 3:

				System.out.println("Please Enter the name of the book you wish to borrow");
				String bookSearch = Helper.getS();
				/*int value = bookCheck(borrowingBook);
				if(value >= 0){

					System.out.println("Enter the borrowers name ");
							String borrowerName  = Helper.getS();

							books[value].setIssuedTo(borrowerName);
							books[value].setStatus(false);

							System.out.println("The book " + borrowingBook +" is issued to " + books[value].getIssuedTo());

				}else if(value == -2){

					System.out.println(" The book "+ borrowingBook +" is not available ");
					
				}else{

					System.out.println("The book is already issued to to ****** ");
					
				}

				*/

				try{

						Book searchedBook = getBookDetails(bookSearch);

					
						if(searchedBook == null){
							System.out.println("The Book " + bookSearch + " is not Available in the Library");	
						}else if( searchedBook.getStatus() == true){
									System.out.println("Enter the borrowers name ");
									String borrowerName  = Helper.getS();

									searchedBook.setIssuedTo(borrowerName);
									searchedBook.setStatus(false);
							System.out.println("The Book " + bookSearch + " is issued to " + searchedBook.getIssuedTo());
						}else{
							System.out.println("The Book " + bookSearch + " is available.");
						}
					}
				catch(Exception e){
					System.out.println(e);
				}




			
				break;


			

			


			case 4:

				System.out.println("Please Enter the name of the book you wish to return");
				String returnBookName = Helper.getS();
				//int value = bookCheck(borrowingBook);

				try{
						
						Book returnedBook = retunLibraryBook(returnBookName);

						

						if(returnedBook == null){
							System.out.println("The Book " + returnBookName + " is not available in the Library");	
						}else if( returnedBook.getStatus() == false){

							System.out.println("The Book " + returnBookName + " is returned by " + returnedBook.getIssuedTo());
							returnedBook.setStatus(true);
							returnedBook.setIssuedTo(null);
							
						}else{
							System.out.println("The Book " + returnBookName + " is not issued.");
						}

				}
				catch(Exception e){
					System.out.println(e);
				}
			
				break;
				

			

			
			case 5:

			System.out.println("Please Enter the name of the Borrower you wish to Search");
				String borrowerName = Helper.getS();
				//int value = bookCheck(borrowingBook);


				try{
						Book searchedborrower = getBorrower(borrowerName);

						

						if(searchedborrower == null){
							System.out.println( borrowerName + " is not issued any book from  the Library");	
						}else if( searchedborrower.getIssuedTo().equalsIgnoreCase(borrowerName)){

							System.out.println("The Book " + searchedborrower.getBookName() + " has been issued " + borrowerName );
							
							
						}else{
							System.out.println(borrowerName + " is not issued any book from  the Library");
						}
					}
					catch(Exception e){
						System.out.println(e);
					}
				break;

			
			case 6:
					System.out.println("Book search  ");
					System.out.println("Do you want to search book by book id (1) or book name(2) ");
					int searchBy = Helper.getI();
					Book bookData = null;
					switch(searchBy)  {
							
							


							case 1 : 

								System.out.println("Enter the book id to be searched");
								bookId = Helper.getI();

								try{
										bookData = getBookDetails(bookId);

										if(bookData == null){
											System.out.println("There is no such book available with this book id :" + bookId);							
										}else{
											System.out.println(bookData);// will call book data ToString
										}
								}
								catch(Exception e){
									System.out.println(e);

								}


								break;

							case 2 :  


								System.out.println("Enter the book name searched");
								String bookName1 = Helper.getS();

							try{	// what if i put for here

								bookData = getBookDetails(bookName1);

								if(bookData == null){
									System.out.println("There is no such book available with this book name :" + bookName1);							
								}else{
									System.out.println(bookData);// will call book data ToString

								}
							}
							catch(Exception e){
								System.out.println(e);
							}

								break;


							default : 
								System.out.println("Wrong input");
								break;

					}


			case 7:
					System.exit(0);
					break;

			}


		}
	}

	public static void displayAllBook(){
		System.out.println("### BOOK DETAILs ###");
		System.out.println("********************");

		try{

			for(int i =0 ; i<books.length;i++){
				   System.out.println("Book ID : " + books[i].getBookId());
					System.out.println("Book Name: " + books[i].getBookName());
					System.out.println("Authour Name: " + books[i].getAuthorName());
					System.out.println("Status : " + books[i].getStatus());
					System.out.println("Issued To : " + books[i].getIssuedTo());

					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

	public static String getAvailableBookDetail(String bookName){

	int index =-1;
	String result ="not available";
	String borrower = " ";


	try{
			for(int i=0;i<books.length;i++){
								
				if (bookName.equalsIgnoreCase(books[i].getBookName()) && (books[i].getStatus() == true )){
					index =i;
					result = "available";
					break;
					
				}else if(bookName.equalsIgnoreCase(books[i].getBookName())){
					index =i;
					result = "borrowed";
					borrower = books[i].getIssuedTo();
					break;
				}
			}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
	
	result = result + "#" + index + "#" + borrower;	
	}

	return	result;
    }

    public static int bookCheck(String borrowingBook){
    	int j = 0;
    	for(int i=0;i<books.length;i++){
					
						if(borrowingBook.equalsIgnoreCase(books[i].getBookName()) && books[i].getStatus() == true){
							
							 j = i;
							 break;
							
						} else if(borrowingBook.equalsIgnoreCase(books[i].getBookName()) && (books[i].getStatus() == false) ){

							
							 j = -1;
						}else{
							 j =-2;
							
						}



				}
    	
		return j;

    }public static Book retunLibraryBook( String bookName){


		Book returnBook = null;

		try{

				for(Book book: books){

					if((book.getBookName()).equalsIgnoreCase(bookName)){
						returnBook = book;
						break;
					}

				}
		}
		catch(Exception e){
			System.out.print(e);

		}

		return returnBook;

	
    }

    public static Book getBorrower( String borrowerName){


		Book returnBorrowerdetails = null;

		for(Book book: books){

			if((book.getIssuedTo()).equalsIgnoreCase(borrowerName)){
				returnBorrowerdetails = book;
				break;
			}

		}

		return returnBorrowerdetails;

	
    }


    public static Book getBookDetails(String bookName){

    	Book availableBook = null;

		try{
				for(Book book: books){

					if((book.getBookName()).equalsIgnoreCase(bookName)){
						availableBook = book;
						break;
					}

				}
		}
		catch(Exception e){
			System.out.println(e);
		}

		return availableBook;

		
    }

    public static Book getBookDetails(int bookId){

    	Book availableBook = null;

    	try{
				for(Book book: books){
					if(book.getBookId() == bookId){
						availableBook = book;
						break;
					}

				}
		}
		catch(Exception e){
			System.out.println(e);

		}	

		return availableBook;

		
    }

	

}


