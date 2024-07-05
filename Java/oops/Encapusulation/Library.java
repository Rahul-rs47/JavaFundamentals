class Library{
	public static void main(String args[]){


		Book book1 = new Book();


		book1.setBookId(321);
		book1.setBookName("spring");
		book1.setAuthorName("author");
		book1.setStatus(true);

		Book book2 = new Book(123,"java","javaAuthor",true);


		System.out.println("\nBook 1 details : ");
		displayBook(book1);
		System.out.println("\nBook 2 details : ");
		displayBook(book2);


		

	}

	public static void displayBook(Book b1){
		System.out.println("Book Id : " + b1.getBookId());
		System.out.println("Book name : " + b1.getBookName());
		System.out.println("Book Author: " + b1.getAuthorName());
		System.out.println("Book Status : " + b1.getStatus());	
	}
}