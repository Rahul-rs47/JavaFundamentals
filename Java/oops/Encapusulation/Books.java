import java.util.Scanner;
class Books{
	private int bookId;
	private String bookName;
	private String authorName;
	private boolean status;


	public Books(){

	}

	public Books(int bookId,String bookName,String authorName,boolean status){
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.status = status;


	}

	public int getBookId(){
		return bookId;
	}

	public void displayLibraryMenu(){
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
			System.out.println("Enter the options(1-5)");
			Scanner sc = new Scanner(System.in);
			int service = sc.nextInt();
			sc.nextLine();




		}
	}

	public String displayStatusOfParticularBook(String b1){
		bookDetails = 
	}

	public void setBookId(int bookId){
		this.bookId = bookId;
	}
	

	public String getBookName(){
		return bookName;
	}

	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getAuthorName(){
		return authorName;
	}
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	public boolean getStatus(){
		return status;
	}
	public void setStatus(boolean status){
		this.status = status;
	}






}