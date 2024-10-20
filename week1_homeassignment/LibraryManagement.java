package week1_homeassignment;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lobj=new Library();
		String bookTitle=lobj.addBook("Science");
		System.out.println("Book Added is : " +bookTitle);
		lobj.issueBook();
		

	}

}
