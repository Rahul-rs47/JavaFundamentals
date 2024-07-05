package con.lms.dto;

import java.util.Scanner;
class Book{
	private int bookId;
	private String bookName;
	private String authorName;
	private boolean status;
	private String issuedTo;


	public Book(){

	}

	public Book(int bookId,String bookName,String authorName,String issuedTo){
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.status = true;
		this.issuedTo= issuedTo;


	}

	public int getBookId(){
		return bookId;
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

	public String getIssuedTo(){
	return issuedTo;
	}
	public void setIssuedTo(String issuedTo){
		this.issuedTo = issuedTo;
	}


	public String getStatusByBookName(){

		String status = "";
		return status;
	}

	public String toString(){
		String output = " ";
		output = "Book name : " + bookName + "\n" + "Book Id :" + bookId + "\n" + "Book Status : " + status + "\n" + "Book is Issued to : " + issuedTo ;

		return output;

	}






}