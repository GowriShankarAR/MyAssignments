package week1_homeassignment;

public class Library {

	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

    public static void main(String[] args) {
		
		Library libraryObj=new Library();
		String bookTitle=libraryObj.addBook("Science");
		System.out.println("Book Added is : " +bookTitle);
		libraryObj.issueBook();
}

}





